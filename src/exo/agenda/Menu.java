package exo.agenda;

import java.util.Objects;
import java.util.Scanner;

public class Menu {

    private final Scanner sc = new Scanner(System.in); // final => constante
    private final Agenda agenda = new Agenda();

    public void start(){

        int choix = 0;
        do {
            displayOptions();
            choix = getChoix();
            mapChoix( choix );
        }while( choix != 6 );

    }

    public void displayOptions(){
        System.out.println(" -- AGENDA -- ");
        System.out.println("1 - ajouter tache");
        System.out.println("2 - annuler tache");
        System.out.println("3 - afficher les taches"); // dans le but de pouvoir choisir laquelle annuler
        System.out.println("4 - afficher la tache la plus proche");
        System.out.println("5 - afficher la tache le plus prioritaire");
        System.out.println("6 - quitter");
    }
    public int getChoix(){

        int nbrChoix = -1;

        while( nbrChoix < 1 || nbrChoix > 6 ){
            System.out.println("Veuillez entrer votre choix");
            String choix = sc.nextLine();
            nbrChoix = Integer.parseInt( choix );
        }

        return nbrChoix;

    }
    public void mapChoix(int choix){
        switch (choix){
            case 1:
                ajouterTache();
                break;
            case 2:
                annulerTache();
                break;
            case 3:
                afficherTaches();
                break;
            case 4:
                afficherTacheProche();
                break;
            case 5:
                afficherTachePrioritaire();
                break;
            case 6:
                quitter();
                break;
        }
    }

    public void ajouterTache(){

        int prio = -1;
        while( prio != 1 && prio != 2 ){
            System.out.println("1 - non prioritaire");
            System.out.println("2 - Prioritaire");
            prio = Integer.parseInt( sc.nextLine() );
        }

        System.out.println("Quel intitule ?");
        String intitule = sc.nextLine();

        System.out.println("Quelle date ?");
        System.out.print("> annee : ");
        int annee = Integer.parseInt( sc.nextLine() );
        System.out.print("> mois : ");
        int mois = Integer.parseInt( sc.nextLine() );
        System.out.print("> jour : ");
        int jour = Integer.parseInt( sc.nextLine() );

        System.out.print("Quelle durée ?");
        int duree = Integer.parseInt( sc.nextLine() );
        switch (prio){
            case 1:
                agenda.ajouter( new Tache(intitule,annee,mois,jour, duree) );
                break;
            case 2:
                int priorite = -1;
                System.out.print("Quelle priorite ?");
                while (priorite < 0 || priorite > 3){
                    System.out.print("> ");
                    priorite = Integer.parseInt( sc.nextLine() );
                    if(priorite < 0 || priorite > 3)
                        System.out.println("choix invalide");
                }
                agenda.ajouter( new TachePrioritaire( intitule, annee, mois, jour, duree, priorite ) );
                break;
        }
    }
    public void annulerTache(){

        boolean success = false;
        boolean retry = true;

        while( retry && !success ){

            System.out.print("> index : ");
            int index = Integer.parseInt( sc.nextLine() );

            success = agenda.annulerTache(index);

            if( !success ){
                System.out.println("Retry ? (y/n)");
                retry = Objects.equals(sc.nextLine(), "y");
            }

        }

    }
    public void afficherTaches(){
        System.out.println(agenda);
    }
    public void afficherTacheProche(){
        Tache tache = agenda.recupProchaineTache();
        if( tache != null )
            System.out.println(tache);
        else
            System.out.println("Aucune tache future");
    }
    private void afficherTachePrioritaire(){
        TachePrioritaire tachePrioritaire = agenda.recupTachePrioMax();
        if( tachePrioritaire != null )
            System.out.println(tachePrioritaire);
        else
            System.out.println("Aucune tache prioritaire future");

    }
    private void quitter(){
        System.out.println("au revoir");
    }
}
