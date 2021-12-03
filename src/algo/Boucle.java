package algo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Boucle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // While
        boolean condition = false;

        while( condition ){
            System.out.println("execution a répétition");
        }

        // Do .. While

        do {
            System.out.println("execution a répétition");
        } while ( condition );

        // for

        for( int i = 0; i < 10 ; i++ ){
            System.out.println(i);
        }

        // foreach



        int[] list = new int[]{ 1,2,3,4 };


        for( int item : list ){
            item++;
        }

        for (int item : list){
            System.out.println(item);
        }

    }


}
