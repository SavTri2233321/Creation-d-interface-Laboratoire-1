package Vaisseau;

import Cosmos.Planete;
import Cosmos.SystemeSolaire;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Stack;

public class Vaisseau {

    private int nivDeCarburant;

    private int dernierVoyageCarburant;
    private int nivDeVie;

    private final int vieMax = 100;

    private final int carburantMax = 1000;
    private final ArrayList<Objects> inventaire = new ArrayList<>();

    public Vaisseau() {
        this.nivDeCarburant = 1000;
        this.nivDeVie = 100;

    }
    public int getNivDeVie() {
        return nivDeVie;
    }

    public void setNivDeVie(int vie) {this.nivDeVie = vie;}

    public int getNivDeCarburant() {
        return nivDeCarburant;
    }

    public void setNivDeCarburant(int nouveauNiv) {
        this.nivDeCarburant = nouveauNiv;
    }

    public ArrayList<Objects> getInventaire() {
        return inventaire;
    }

    public int getDernierVoyageCarburant() {
        return dernierVoyageCarburant;
    }

    public void setDernierVoyageCarburant(int dernierVoyageCarburant) {
        this.dernierVoyageCarburant = dernierVoyageCarburant;
    }

    public int getVieMax() {
        return vieMax;
    }

    public int getCarburantMax() {
        return carburantMax;
    }
}
