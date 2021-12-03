package poo;

public class Employe extends Person {

    private int salaire;

    public Employe(String nom, int age, int salaire) {
        super(nom, age);
        this.salaire = salaire;
    }

    public int getSalaire() {
        return salaire;
    }

    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }

    @Override
    public void promotion() {
        salaire += 300;
    }
}
