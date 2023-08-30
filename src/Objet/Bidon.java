package Objet;

import Vaisseau.Vaisseau;

public class Bidon implements Objet{

    @Override
    public void utiliser(Vaisseau vaisseau){
        if (vaisseau.getNivDeCarburant() <= 750 )
            vaisseau.setNivDeCarburant(vaisseau.getNivDeCarburant() + 250);
        else vaisseau.setNivDeCarburant(vaisseau.getCarburantMax());
    }

    @Override
    public String toString() {
        return "Bidon";
    }
}
