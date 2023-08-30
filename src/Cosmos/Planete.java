package Cosmos;

import Vaisseau.Vaisseau;

import java.util.Stack;

public class Planete {

    //Attribut
    protected String nom;
    protected int distanceDuSoleil;

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

        //Évenement


        //Objet
    }
}
