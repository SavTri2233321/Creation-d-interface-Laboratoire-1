package Cosmos;

import Vaisseau.Vaisseau;

import java.util.Stack;

public class Terre extends Planete {

    public Terre() {
        this.nom = "Terre";
        this.distanceDuSoleil = 300;
        this.gravité = "";
    }

    @Override
    public void explorer(Vaisseau vaisseau, Stack<Planete> planetesVisités, Planete planeteActuelle) {
        super.explorer(vaisseau, planetesVisités, planeteActuelle);

    }

    public String toString() {
        return "Terre";
    }
}
