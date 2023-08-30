package Objet;

import Vaisseau.Vaisseau;

public class Chalumeau implements Objet{

    @Override
    public void utiliser(Vaisseau vaisseau){
        if (vaisseau.getNivDeVie() <= 75)
            vaisseau.setNivDeVie(vaisseau.getNivDeVie() + 25);
        else vaisseau.setNivDeVie(vaisseau.getVieMax());

    }

    @Override
    public String toString() {
        return "Chalumeau";
    }



}
