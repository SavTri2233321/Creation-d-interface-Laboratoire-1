import Cosmos.Planete;
import Cosmos.SystemeSolaire;
import Vaisseau.Vaisseau;

import java.util.Scanner;
import java.util.Stack;

public class Main{

    public static void main(String[] args) {

        //Pour le deroulement
        Scanner sc = new Scanner(System.in);
        String choix;
        int choiX;

        //Creation des objets
        SystemeSolaire systemeSolaire = new SystemeSolaire();
        Vaisseau vaisseau = new Vaisseau();
        Stack<Planete> planetesVisités = new Stack<>();
        Planete planeteActuelle = systemeSolaire.getVoieLacte()[2];



        //Deroulement

        System.out.println("Bienvenue dans Space Explorer !");
        planetesVisités.push(systemeSolaire.getVoieLacte()[2]);

        do{
            System.out.println();
            System.out.print("""
                    Que désirez-vous faire ?
                       1. Examiner le vaisseau
                       2. Explorer une planète
                       3. Utiliser un objet dans l’inventaire
                       4. Revenir en arrière
                    Votre choix : """);
            choix = sc.nextLine();

            switch(choix) {
                case "1" :

                    //Affichage
                    System.out.println();
                    System.out.println("État du vaisseau :\n" +
                            "   Planète courante : " + planeteActuelle + "\n" +
                            "   Quantité carburant : " + vaisseau.getNivDeCarburant() + " litres\n" +
                            "   Points de vie : " + vaisseau.getNivDeVie() + "\n" +
                            "   Inventaire : " + vaisseau.getInventaire());
                    break;

                case "2" :
                    //Modification
                    planetesVisités.push(planeteActuelle);
                    planeteActuelle = prochainÉtineraire(systemeSolaire, planetesVisités);
                    planeteActuelle.explorer(vaisseau, planetesVisités, planeteActuelle);
                    planeteActuelle.explorerObjet(vaisseau);

                    //Affichage
                    System.out.println();
                    System.out.println("Vous explorez la planète " + planeteActuelle + "\n" +
                            "Vous dépensez " + vaisseau.getDernierVoyageCarburant() + " litres d’essence.\n" +
                                    planeteActuelle.evenementAleatoire(vaisseau) +
                            "\nVous obtenez un(e) " + planeteActuelle.explorerObjet(vaisseau) + " !");
                    break;

                case "3" :
                    for(int i = 0; i < vaisseau.getInventaire().size(); i++) {
                        System.out.println(i + " .  " + vaisseau.getInventaire().get(i));
                    }
                    System.out.println("Quelle objet voulez-vous utiliser : ");
                        choiX = sc.nextInt();
                        vaisseau.getInventaire().get(choiX).utiliser(vaisseau);
                        vaisseau.getInventaire().remove(choiX);




                    break;
                case "4" :
                    planeteActuelle = planetesVisités.pop();
                    vaisseau.setNivDeCarburant(vaisseau.getNivDeCarburant() + vaisseau.getDernierVoyageCarburant());

                    break;
            }
        } while (vaisseau.getNivDeCarburant() >0 || vaisseau.getNivDeVie() >0);
    }
    public static Planete prochainÉtineraire(SystemeSolaire systemeSolaire, Stack<Planete> planetesVisités) {

        Planete rechercheNouvellePlanete;
        do {
            rechercheNouvellePlanete = systemeSolaire.getVoieLacte()[(int) (Math.random()*4)];
            } while (planetesVisités.peek() == rechercheNouvellePlanete);
        return rechercheNouvellePlanete;
    }
}
