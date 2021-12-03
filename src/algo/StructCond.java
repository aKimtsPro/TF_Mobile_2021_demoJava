package algo;

import java.util.Scanner;

public class StructCond {

    public static void main(String[] args) {

        // La loi de De Morgan
        boolean sac_bleu = true;
        boolean sac_ligne = false;

        boolean rslt = !(sac_bleu && sac_ligne);
        rslt = !sac_bleu || !sac_ligne;

        rslt = !(sac_bleu || sac_ligne);
        rslt = !sac_bleu && !sac_ligne;


        // Les structures conditionnelles


        // La structure if...else if...else
        int temperature = 8;

        if( temperature >= 18 && temperature <= 23 ){
            System.out.println("Il fait bon");
        }
        else if( temperature < 18 ){
            System.out.println("Il fait trop froid. Augmentez le chauffage");
        }
        else {
            System.out.println("Il fait trop chaud. Baissez le chauffage");
        }


        // La structure switch

        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez le numéro du jour");
        int jour = sc.nextInt();

        switch (jour) {
            case 0:
            case 1:
                System.out.println("Lundi");
                break;
            case 2:
                System.out.println("Mardi");
                break;
            case 3:
                System.out.println("Mercredi");
                break;
            case 4:
                System.out.println("Jeudi");
                break;
            case 5:
                System.out.println("Vendredi");
                break;
            case 6:
                System.out.println("Samedi");
                break;
            case 7:
                System.out.println("Dimanche");
                break;
            default:
                System.out.println("Valeur invalide");
        }

    }

}
