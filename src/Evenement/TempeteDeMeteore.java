package Evenement;

import Vaisseau.Vaisseau;

public class TempeteDeMeteore implements Evenement{
    @Override
    public void actionner(Vaisseau vaisseau) {
        if (vaisseau.getNivDeVie() > 25)
            vaisseau.setNivDeVie(vaisseau.getNivDeVie() - 25);
        else vaisseau.setNivDeVie(0);
    }

    @Override
    public String toString() {
        return "Une tempete de meteore a frappé votre vaisseau";
    }
}
