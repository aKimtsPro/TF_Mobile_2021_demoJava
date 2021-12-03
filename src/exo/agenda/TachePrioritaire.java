package exo.agenda;

import java.time.LocalDate;

public class TachePrioritaire extends Tache{

    private int priority;

    public TachePrioritaire(String intitule, LocalDate date, int duree, int priority) {
        super(intitule, date, duree);
        setPriority(priority);
    }

    public TachePrioritaire(String intitule, int year, int month, int dayOfMonth, int duree, int priority) {
        super(intitule, year, month, dayOfMonth, duree);
        setPriority(priority);
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        if(priority >= 0 && priority <= 3)
            this.priority = priority;
    }

    @Override
    public String toString() {
        return "TachePrioritaire{" + "intitule='" + getIntitule() + '\'' +
                ", date=" + getDate() +
                ", duree=" + getDuree() +
                "priority=" + priority +
                '}';
    }
}
