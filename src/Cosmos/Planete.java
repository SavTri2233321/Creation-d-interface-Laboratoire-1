package Cosmos;

import Evenement.Evenement;
import Objet.Equipement;
import Objet.ListeDequipement;
import Evenement.ListeDevenement;
import Vaisseau.Vaisseau;

import java.util.Stack;

public class Planete {

    //Attribut
    protected String nom;
    protected int distanceDuSoleil;

    protected Equipement[] inventaire = new ListeDequipement().getListeDequipement();

    protected Evenement[] evenement = new ListeDevenement().getListeDequipement();
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

    public Equipement explorerObjet(Vaisseau vaisseau){

        //Premier Objet
        Equipement equipement = inventaire[(int) (Math.random()*4)];
        vaisseau.setInventaire(equipement);

        return equipement;

    }

    public Evenement evenementAleatoire(Vaisseau vaisseau) {

        Evenement evenement = this.evenement[(int) (Math.random()*2)];
        evenement.actionner(vaisseau);

        return evenement;
    }
}
