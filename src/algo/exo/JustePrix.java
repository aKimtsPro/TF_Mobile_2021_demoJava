package algo.exo;

import java.util.Random;
import java.util.Scanner;

public class JustePrix {

    public static void main(String[] args) {

        System.out.println("Bienvenu dans l'appli juste prix");

        System.out.println("-- MENU DES DIFFICULTES --");
        System.out.println("1 - Facile (entre 1 et 100)");
        System.out.println("2 - Moyen (entre 1 et 250)");
        System.out.println("3 - Difficile (entre 1 et 500)");


        Scanner sc = new Scanner(System.in);
        int choix, nbrMax = 0;

        do {
            choix = sc.nextInt();

            switch (choix) {
                case 1:
                    nbrMax = 100;
                    break;
                case 2:
                    nbrMax = 250;
                    break;
                case 3:
                    nbrMax = 500;
                    break;
                default:
                    System.out.println("choix invalide veuillez recommencer");
            }
        } while (choix > 3 || choix < 1 );

        Random rdm = new Random();
        int nbrADeviner = rdm.nextInt(nbrMax) + 1;

        int essaiDispo = 6;
        int essai = -1;

        while( essaiDispo > 0 && essai != nbrADeviner ){

            System.out.println("Veuillez faire une proposition (reste " + essaiDispo + "essais disponibles)");
            essai = sc.nextInt();
            essaiDispo--;

            if( essai == nbrADeviner ){
                System.out.println("Bravo vous avez gagné en " + (6 - essaiDispo) + " essais");
            }
            else if( essai < nbrADeviner ){
                System.out.println("C'est plus");
            }
            else {
                System.out.println("C'est moins");
            }

        }

        System.out.println("Le nombre etait : " + nbrADeviner);



    }

}
