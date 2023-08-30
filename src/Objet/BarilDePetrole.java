package Objet;
import Vaisseau.Vaisseau;

public class BarilDePetrole implements Objet {

    public void utiliser(Vaisseau vaisseau){
        if (vaisseau.getNivDeCarburant() <= 500 )
            vaisseau.setNivDeCarburant(vaisseau.getNivDeCarburant() + 500);
        else vaisseau.setNivDeCarburant(vaisseau.getCarburantMax());
    }


    @Override
    public String toString() {
        return "Baril d'essence";
    }

}
