package exo.magasin.produit;

public class ProduitParPoid extends Produit {

    private int poid; // en gramme
    private double prixAuKilo;

    public ProduitParPoid(String nom, int poid, double prixAuKilo) {
        super(nom, poid * prixAuKilo / 1000);
        this.poid = poid;
        this.prixAuKilo = prixAuKilo;
    }

    public int getPoid() {
        return poid;
    }

    public void setPoid(int poid) {
        if( poid > 0 ){
            this.poid = poid;
            setPrix( prixAuKilo * poid / 1000 );
        }
    }

    public double getPrixAuKilo() {
        return prixAuKilo;
    }

    public void setPrixAuKilo(double prixAuKilo) {
        if( prixAuKilo > 0 ){
            this.prixAuKilo = prixAuKilo;
            setPrix( prixAuKilo * poid / 1000 );
        }
    }

    @Override
    public String toString() {
        return "ProduitParPoid{" +
                "nom="+getNom()+
                ", prixTotal="+getPrix()+
                ", poid=" + poid +
                ", prixAuKilo=" + prixAuKilo +
                '}';
    }
}
