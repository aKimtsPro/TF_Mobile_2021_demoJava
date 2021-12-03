package poo;

import java.util.Objects;

public abstract class Person {

    private String nom;
    private int age;

    public Person(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    // region get/set

    public int getAge(){
        return age;
    }

    protected void setAge( int age ){
        if( age >= 0)
            this.age = age;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public abstract void promotion();

    // endregion

    // region polymorph

    public void saluer(){
        System.out.println("Bonjour, je suis" + nom + " et j'ai " + age + "ans");
    }

    // signature : Class - nom - ordre/type des params
    public void saluer(Person p){
        System.out.println("Bonjour " + p.nom + ", je suis "+ nom);
    }

    public <T> T method(T param){
        return param;
    }

    @Override
    public String toString() {
        return "Person{" +
                "nom='" + nom + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(nom, person.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, age);
    }

    // endregion
}
