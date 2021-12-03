package exo.agenda;

import java.time.LocalDate;

public class Tache {

    private String intitule;
    private LocalDate date;
    private int duree; // en minutes

    public Tache(String intitule, LocalDate date, int duree) {
        this.intitule = intitule;
        this.date = date;
        this.duree = duree;
    }
    public Tache(String intitule, int year, int month, int dayOfMonth, int duree) {
        this.intitule = intitule;
        this.date = LocalDate.of(year, month, dayOfMonth);
        this.duree = duree;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    @Override
    public String toString() {
        return "Tache{" +
                "intitule='" + intitule + '\'' +
                ", date=" + date +
                ", duree=" + duree +
                '}';
    }
}
