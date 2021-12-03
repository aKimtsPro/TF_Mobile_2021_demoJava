package exo.agenda;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Agenda {

    private final List<Tache> taches = new ArrayList<>();

    public void ajouter( Tache aAjouter ){

        if( aAjouter.getDate().isAfter( LocalDate.now() ) )
            taches.add( aAjouter );

    }

    public boolean annulerTache( int index ){

        if( index < 0 || index >= taches.size() )
            return false;

        LocalDate ajd = LocalDate.now();
        Tache aAnnuler = taches.get(index);

        if( taches.contains(aAnnuler) && aAnnuler.getDate().isAfter( ajd ) ){
            taches.remove(aAnnuler);
            return true;
        }
        return false;

    }

    public Tache recupProchaineTache(){

        if( taches.size() == 0 )
            return null;

        LocalDate ajd = LocalDate.now();
        Tache prochaine = null; // il se peut que ce soit une tache passe

        for (Tache tache : taches) {
            if ( tache.getDate().isAfter(ajd) && ( prochaine == null || tache.getDate().isBefore( prochaine.getDate() )) ){
                prochaine = tache;
            }
        }

        return prochaine;

    }

    public TachePrioritaire recupTachePrioMax() {

        if( taches.size() == 0 )
            return null;

        LocalDate ajd = LocalDate.now();
        TachePrioritaire prioritaire = null;

        for (Tache tache : taches) {

            if( tache.getDate().isAfter(ajd) && tache instanceof TachePrioritaire  ) {
                TachePrioritaire pretendant = (TachePrioritaire) tache;

                if (prioritaire == null)
                    prioritaire = pretendant;

                else if (prioritaire.getPriority() < pretendant.getPriority())
                    prioritaire = pretendant;

                else if( prioritaire.getPriority() == pretendant.getPriority() && pretendant.getDate().isBefore( prioritaire.getDate() ) )
                    prioritaire = pretendant;
            }
        }

        return prioritaire;

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (Tache tache : taches) {
            sb.append(i++).append(" - ").append(tache).append('\n');
        }
        return sb.toString();
    }
}
