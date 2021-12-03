package exo.magasin;

import exo.magasin.produit.Produit;
import exo.magasin.produit.ProduitParPoid;
import exo.magasin.produit.ProduitParQtt;

import java.util.ArrayList;
import java.util.List;

public class Panier {

    private List<Produit> produitList = new ArrayList<>();

    public void add(Produit toAdd){

        Produit presentProd = getProduitIfExists(toAdd);

        if( presentProd == null ){
            produitList.add( toAdd );
        }
        else{

            if ( toAdd instanceof ProduitParPoid ){

                ProduitParPoid p = (ProduitParPoid) presentProd;
                ProduitParPoid pToAdd = (ProduitParPoid) toAdd;
                p.setPoid( p.getPoid() + pToAdd.getPoid() );

            }
            else if ( toAdd instanceof ProduitParQtt ){

                ProduitParQtt p = (ProduitParQtt) presentProd;
                ProduitParQtt pToAdd = (ProduitParQtt) toAdd;
                p.setQtt( p.getQtt() + pToAdd.getQtt() );

            }
        }
    }

    public void remove(Produit toRemove){

        Produit presentProd = getProduitIfExists(toRemove);

        if( toRemove instanceof ProduitParQtt ){


            ProduitParQtt p = (ProduitParQtt) presentProd;
            ProduitParQtt pToAdd = (ProduitParQtt) toRemove;

            if( pToAdd.getQtt() >= p.getQtt() ){
                produitList.remove( presentProd );
            }
            else {
                p.setQtt( p.getQtt() - pToAdd.getQtt() );
            }

        }
        else if( toRemove instanceof ProduitParPoid ){

            ProduitParPoid p = (ProduitParPoid) presentProd;
            ProduitParPoid pToRemove = (ProduitParPoid) toRemove;

            if( pToRemove.getPoid() >= p.getPoid() ){
                produitList.remove( presentProd );
            }
            else {
                p.setPoid( p.getPoid() - pToRemove.getPoid() );
            }

        }

    }

    public void clear(){
        produitList.clear();
    }

    private Produit getProduitIfExists(Produit ref){

        for (Produit produit : produitList) {
            if ( ref.equals(produit) )
                return produit;
        }
        return null;

    }

    public double getTotal(){
        double sum = 0;

        for (Produit produit : produitList) {
            sum += produit.getPrix();
        }

        return sum;
    }

    public Produit getByIndex(int index){
        return produitList.get(index);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (Produit produit : produitList) {
            sb.append(i++).append(" - ").append( produit ).append('\n');
        }
        return sb.toString();
    }
}
