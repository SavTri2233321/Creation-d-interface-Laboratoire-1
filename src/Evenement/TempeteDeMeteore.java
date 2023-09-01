package Evenement;

import Vaisseau.Vaisseau;

public class TempeteDeMeteore implements Evenement{
    @Override
    public void actionner(Vaisseau vaisseau) {
        if (vaisseau.getNivDeVie() > 40)
            vaisseau.setNivDeVie(vaisseau.getNivDeVie() - 40);
        else vaisseau.setNivDeVie(0);
    }

    @Override
    public String toString() {
        return "Une tempete de meteore a frappé votre vaisseau\nVotre vaisseau perd 40 points de vie";
    }
}
