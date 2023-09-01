package Evenement;


public class ListeDevenement {

    private Evenement[] listeDevenement = new Evenement[2];

    public ListeDevenement() {
        listeDevenement[0] = new TempeteDeMeteore();
        listeDevenement[1] = new VoleurDeLespace();
    }

    public Evenement[] getListeDequipement() {
        return listeDevenement;
    }
}
