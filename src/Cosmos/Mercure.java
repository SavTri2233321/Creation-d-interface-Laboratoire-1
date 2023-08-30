package Cosmos;

import Vaisseau.Vaisseau;

public class Mercure extends Planete {

    Vaisseau vaisseau;
    public Mercure() {
        this.nom = "Mercure";
        this.distanceDuSoleil = 100;
        this.gravité = "";
    }

    public String toString() {
        return "Mercure";
    }

}
