package poo;

import java.util.Objects;

public class Chien {

    public String nom;
    public int age;

    public Chien(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Chien{" +
                "nom='" + nom + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chien chien = (Chien) o;
        return age == chien.age && Objects.equals(nom, chien.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, age);
    }
}
