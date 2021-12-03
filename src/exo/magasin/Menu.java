package exo.magasin;

import exo.magasin.produit.Produit;
import exo.magasin.produit.ProduitParPoid;
import exo.magasin.produit.ProduitParQtt;

import java.util.Scanner;

public class Menu {

    private Scanner sc = new Scanner(System.in);
    private Magasin magasin = new Magasin();
    private Panier panier = new Panier();

    public void start(){

        int choix = 0;
        do {
            displayOptions();
            choix = getChoix();
            mapChoix( choix );
        }while( choix != 6 );

    }

    public void displayOptions(){
        System.out.println(" -- MENU -- ");
        System.out.println("1 - voir les articles");
        System.out.println("2 - voir le panier");
        System.out.println("3 - ajouter au panier");
        System.out.println("4 - retirer du panier");
        System.out.println("5 - valider la commande");
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
                displayProduits();
                break;
            case 2:
                displayBasket();
                break;
            case 3:
                addToBasket();
                break;
            case 4:
                removeFromBasket();
                break;
            case 5:
                validate();
                break;
            case 6:
                quit();
                break;

        }

    }

    public void displayProduits(){
        System.out.println( magasin );
    }
    public void displayBasket(){
        System.out.println( panier );
    }
    public void addToBasket(){

        System.out.println( "Veuillez indiquer l'index du produit a recupérer" );
        int index = sc.nextInt();
        Produit existingProduit = magasin.getByIndex(index);

        System.out.println("Quelle qtt?");
        int qtt = sc.nextInt();
        sc.nextLine();
        if( qtt >= 0 ){
            Produit toAdd = null;

            if( existingProduit instanceof ProduitParQtt){
                toAdd = new ProduitParQtt(
                        existingProduit.getNom(),
                        Math.min( qtt, ((ProduitParQtt) existingProduit).getQtt() ),
                        ((ProduitParQtt) existingProduit).getPrixUnitaire()
                );
            }
            else if ( existingProduit instanceof ProduitParPoid ){
                toAdd = new ProduitParPoid(
                        existingProduit.getNom(),
                        Math.min( qtt, ((ProduitParPoid)existingProduit).getPoid() ),
                        ((ProduitParPoid) existingProduit).getPrixAuKilo()
                );
            }

            magasin.remove(toAdd);
            panier.add(toAdd);
        }
        else {
            System.out.println("qtt invalide");
        }

    }
    public void removeFromBasket(){
        System.out.println( "Veuillez indiquer l'index du produit a recupérer" );
        int index = sc.nextInt();
        Produit existingProduit = panier.getByIndex(index);

        System.out.println("Quelle qtt?");
        int qtt = sc.nextInt();
        sc.nextLine();
        if( qtt >= 0 ){
            Produit toRemove = null;

            if( existingProduit instanceof ProduitParQtt){
                toRemove = new ProduitParQtt(
                        existingProduit.getNom(),
                        Math.min( qtt, ((ProduitParQtt) existingProduit).getQtt() ),
                        ((ProduitParQtt) existingProduit).getPrixUnitaire()
                );
            }
            else if ( existingProduit instanceof ProduitParPoid ){
                toRemove = new ProduitParPoid(
                        existingProduit.getNom(),
                        Math.min( qtt, ((ProduitParPoid)existingProduit).getPoid() ),
                        ((ProduitParPoid) existingProduit).getPrixAuKilo()
                );
            }

            panier.remove(toRemove);
            magasin.add(toRemove);
        }
        else {
            System.out.println("qtt invalide");
        }
    }
    public void validate(){
        System.out.println("Le total est de : " + panier.getTotal());
        System.out.println("Souhaitez-vous valider? y/n");
        String validation = sc.nextLine();
        if( validation.equals("y") )
            panier.clear();
    }
    public void quit(){
        System.out.println("Au revoir");
    }

}
