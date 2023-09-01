package Objet;

public class ListeDequipement {

    private Equipement[] listeDequipement = new Equipement[4];

    public ListeDequipement(){
        listeDequipement[0] = new BarilDePetrole();
        listeDequipement[1] = new Bidon();
        listeDequipement[3] = new Chalumeau();
        listeDequipement[2] = new Marteau();
    }

    public Equipement[] getListeDequipement(){
        return listeDequipement;

    }
}
