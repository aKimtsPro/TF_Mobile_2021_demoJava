package algo;

import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        // Entrée/Sortie

        System.out.println("Hello world!");

        Scanner sc = new Scanner(System.in);
        System.out.println("comment ça va?");
        String cava = sc.nextLine();
        System.out.println( cava );
        System.out.println( sc.next() );

        // Variable

        byte tresPetitEntier = 1;  // 1 octet
        short petitEntier = 2;  // 2 octets
        int entier = 5; // 4 octets
        long grandEntier = 9_000_000_000_000L; // 8 octets

        float nombreAvirgule = 18.15F;  // 4 octets
        double nombreAVirgulePrecis = 18.15; // 8 octets

        char caractere = 'A'; // 2 octets

        boolean booleen = true;

        // est une objet fonctionnant comme un type primitif
        String chaineDeCaractere = "ma chaine de caractère";


        // Constantes et declaration en une ligne
        final int A = 1, B, C=3;
        final boolean X, Y = A < C;


        // Le transtypage
        grandEntier = tresPetitEntier;
        tresPetitEntier = (byte) grandEntier;

        // Transformation en primitif d'un chaine de caractere

        String chaineATransfo = "120";
        byte a = Byte.parseByte(chaineATransfo);
        short b = Short.parseShort(chaineATransfo);
        int c = Integer.parseInt(chaineATransfo);
        long d = Long.parseLong(chaineATransfo);

        float e = Float.parseFloat(chaineATransfo);
        double f = Double.parseDouble(chaineATransfo);

        // Les opérateurs

        System.out.println( (float) 8 / 5 );

        //

        a = 0; // 0

        System.out.println( a++ ); //  1 | 1 | 0
        System.out.println( ++a ); //  0 | 1 | 2
        System.out.println( a-- ); // -1 | 0 | 2
        System.out.println( --a ); //  0 | 0 | 0

        // Opérateur d'affectation

        entier = entier + 1;
        entier += 1;
        entier -= 1;
        entier *= 1;
        entier /= 1;
        entier %= 1;

        // Générer un nombre aléatoire

        int nbr = (int)(Math.random() * 10) +1;

        Random rdm = new Random();
        nbr = rdm.nextInt(10) + 1;

        String.format("le nombre est : %d", 15);

    }

}
