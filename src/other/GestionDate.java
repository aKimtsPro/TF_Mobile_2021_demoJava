package other;

import java.time.LocalDate;

public class GestionDate {

    public static void main(String[] args) {

        LocalDate ld = LocalDate.of(2021, 12, 3);
        LocalDate ld2 = LocalDate.now().plusDays(1);

        if ( ld.isBefore( ld2 ) ){
            System.out.println("ld2 est future à ld");
        }
        else
            System.out.println("ld est future à ld2");

    }
}
