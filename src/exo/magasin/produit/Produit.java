package exo.magasin.produit;

import java.util.Objects;

public abstract class Produit {

    private String nom;
    private double prix;

    public Produit(String nom, double prix) {
        this.nom = nom;
        this.prix = prix;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPrix() {
        return prix;
    }

    protected void setPrix(double prix) {
        if( prix > 0 )
            this.prix = prix;
    }

    @Override
    public boolean equals(Object obj) {
        if( this == obj )
            return true;

        if( obj == null || obj.getClass() != this.getClass()  )
            return false;

        Produit produit = (Produit) obj;

        return this.getNom().equals( produit.getNom() );
    }

}
