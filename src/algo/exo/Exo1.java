package algo.exo;

import java.util.Scanner;

public class Exo1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Veuillez entrer votre taille: ");
//        float taille = sc.nextFloat();
        float taille = Float.parseFloat( sc.nextLine() );
        System.out.println("Veuillez entrer votre poid:");
//        int poid = sc.nextInt();
        int poid = Integer.parseInt( sc.nextLine() );

        float imc = poid / (taille * taille);
        System.out.println("Votre IMC est de : " + imc);


    }

}
