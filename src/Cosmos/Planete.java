package Cosmos;

import Objet.Equipement;
import Objet.ListeDequipement;
import Vaisseau.Vaisseau;

import java.util.Stack;

public class Planete {

    //Attribut
    protected String nom;
    protected int distanceDuSoleil;

    protected Equipement[] inventaire = new ListeDequipement().getListeDequipement();
    String gravité;

    //constructeur
    public Planete() {
    }

    //Methode
    public int getDistanceDuSoleiel(){
        return distanceDuSoleil;
    }

    public void explorer(Vaisseau vaisseau, Stack<Planete> planetesVisités, Planete planeteActuelle) {

        //Carburant utilisé
        Planete planete = planetesVisités.peek();
        vaisseau.setDernierVoyageCarburant(Math.abs(planeteActuelle.distanceDuSoleil - planete.getDistanceDuSoleiel()));
        vaisseau.setNivDeCarburant(vaisseau.getNivDeCarburant() - Math.abs(planeteActuelle.distanceDuSoleil - planete.getDistanceDuSoleiel()));

    }

    public void explorerObjet(Vaisseau vaisseau){
        int nombre = (int) (Math.random()*3);

        //Premier Objet
        vaisseau.setInventaire(inventaire[(int) (Math.random()*4)]);

        //Deuxieme Objet 1/3
        if (nombre == 1)
            vaisseau.setInventaire(inventaire[(int) (Math.random()*4)]);

    }
}
