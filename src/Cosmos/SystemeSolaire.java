package Cosmos;

import Vaisseau.Vaisseau;

public class SystemeSolaire {

    private Planete[] voieLacte = new Planete[8];



    public SystemeSolaire() {
        voieLacte[0] = new Mercure();
        voieLacte[1] = new Venus();
        voieLacte[2] = new Terre();
        voieLacte[3] = new Mars();

    }

    public Planete[] getVoieLacte() {
        return voieLacte;
    }
}
