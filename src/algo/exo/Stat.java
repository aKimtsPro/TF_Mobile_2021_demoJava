package algo.exo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Stat {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = null;

        System.out.println("Veuillez entrer une série de nombre. Arretez-vous en ecrivant 'stop'");
        List<Float> numbers = new ArrayList<>();

        do {
            input = sc.nextLine();
            if( !input.equals("stop") )
                numbers.add( Float.parseFloat( input ) );
        } while( !input.equals("stop") );

        float min = 0;
        float max = 0;
        float somme = 0;

        if( numbers.size() > 0 ){
            min = numbers.get(0);
            max = numbers.get(0);
        }

        for( float number : numbers ){
            if(number < min)
                min = number;

            if( number > max )
                max = number;

            somme += number;
        }

        System.out.println("min : " + min);
        System.out.println("max : " + max);
        System.out.println("somme : " + somme);
        System.out.println("moyenne : " + (somme / numbers.size()));
        System.out.println("nbr elements : " + numbers.size());

    }

}
