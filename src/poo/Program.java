package poo;

public class Program {

    public static void main(String[] args) {
        Cadre p = new Cadre("Luc", 55, 102);
        Person p1 = new Employe("Luc", 55, 2200);
        Chien c = new Chien("Luc", 55);
        Cadre c1 = new Cadre("Marie", 42, 101);

        System.out.println( p.equals(p1) );
        System.out.println( p.equals(c) );
        c1.saluer();

        if( p instanceof Cadre ){
            System.out.println("c'est un cadre");
            p.saluer();
        }
    }

}
