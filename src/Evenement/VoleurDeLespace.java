package Evenement;

import Vaisseau.Vaisseau;

public class VoleurDeLespace implements Evenement{
    @Override
    public void actionner(Vaisseau vaisseau) {
        if (vaisseau.getNivDeCarburant() > 100)
            vaisseau.setNivDeCarburant(vaisseau.getNivDeCarburant() - 100);
        else vaisseau.setNivDeCarburant(0);
    }

    @Override
    public String toString() {
        return "Des voleurs accostent votre vaisseau\nVotre vaisseau perd 100L de carburant";
    }
}
