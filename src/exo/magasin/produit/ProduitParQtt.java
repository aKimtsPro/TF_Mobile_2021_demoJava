package exo.magasin.produit;

public class ProduitParQtt extends Produit {

    private int qtt;
    private double prixUnitaire;

    public ProduitParQtt(String nom, int qtt, double prixUnitaire) {
        super(nom, qtt * prixUnitaire);
        this.qtt = qtt;
        this.prixUnitaire = prixUnitaire;
    }

    public int getQtt() {
        return qtt;
    }

    public void setQtt(int qtt) {
        if( qtt > 0){
            this.qtt = qtt;
            setPrix( qtt * prixUnitaire );
        }
    }

    public double getPrixUnitaire() {
        return prixUnitaire;
    }

    public void setPrixUnitaire(double prixUnitaire) {
        if( prixUnitaire > 0 ){
            this.prixUnitaire = prixUnitaire;
            setPrix( qtt * prixUnitaire );
        }
    }

    @Override
    public String toString() {
        return "ProduitParQtt{" +
                "nom= "+ getNom() +
                "prixTotal= " + getPrix() +
                "qtt=" + qtt +
                ", prixUnitaire=" + prixUnitaire +
                '}';
    }
}
