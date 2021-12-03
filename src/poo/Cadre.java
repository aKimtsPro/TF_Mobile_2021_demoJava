package poo;

public class Cadre extends Person {

    private int numeroBureau;

    public Cadre(String nom, int age, int numeroBureau) {
        super(nom, age);
        this.numeroBureau = numeroBureau;
    }

    public int getNumeroBureau() {
        return numeroBureau;
    }

    public void setNumeroBureau(int numeroBureau) {
        this.numeroBureau = numeroBureau;
    }

    @Override
    public void promotion() {
        numeroBureau += 100;
    }

    @Override
    public void saluer() {
        super.saluer();
        System.out.println("Je suis cadre");
    }
}
