package Cosmos;

import Vaisseau.Vaisseau;

import java.util.Stack;

public class Mars extends Planete {

    public Mars() {
        this.nom = "Mars";
        this.gravité = "";
        this.distanceDuSoleil = 400;

    }

    @Override
    public void explorer(Vaisseau vaisseau, Stack<Planete> planetesVisités, Planete planeteActuelle) {
        super.explorer(vaisseau, planetesVisités, planeteActuelle);

    }

    public String toString() {
        return "Mars";
    }


}
