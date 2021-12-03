package algo;

import java.util.*;

public class TabList {

    public static void main(String[] args) {

        // Les tableaux

        int[] tab = new int[10];
        tab = new int[]{0,1,2,3,4,5,6,7,8,9};
        tab = new int[11];

        System.out.println( tab[0] );


        Scanner[][] tabDeTab = new Scanner[10][10];

        tabDeTab = new Scanner[5][];
        tabDeTab[0] = new Scanner[10];
        tabDeTab[1] = new Scanner[21];
        tabDeTab[2] = new Scanner[3];
        tabDeTab[3] = new Scanner[8];
        tabDeTab[4] = new Scanner[1];

        // Les collections

        // List

        List<Integer> listDEntier = new ArrayList<>();

        int taille = listDEntier.size();
        listDEntier.add( 10 );
        int element = listDEntier.get( 0 );
        listDEntier.remove( (Integer) 10 );
        listDEntier.clear();
        if ( !listDEntier.contains(10) )
            listDEntier.add(10);

        int index = listDEntier.indexOf(10);

        // Passer de liste à tableau
        listDEntier.toArray(new Integer[0]);
        // Passer de tableau à list


        Stack<String> pile = new Stack<>();
        pile.push("ajouté au dessus");
        System.out.println( pile.peek() ); // recupère l'élément le plus récent sans le retirer
        System.out.println( pile.pop() ); // recupère l'élément le plus récent et le retire

        Queue<String> file = new LinkedList<>();
        file.add("ajouté à la fin de la file");
        String premier = file.remove(); // retirer le premier de la file


        Map<String, Integer> nomAge = new HashMap<>();
        nomAge.put("pol", 45);
        nomAge.put("luc", 67);
        nomAge.put("marie", 35);

        int age = nomAge.get("luc");
        System.out.println(age);

        if( nomAge.containsKey("luc") )
            nomAge.put("luc", 68);

        age = nomAge.get("luc");
        System.out.println(age);


        Set<Integer> set = new HashSet<>();
        set.add(1);




    }


}
