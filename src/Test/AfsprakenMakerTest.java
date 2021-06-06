package Test;

import Models.AfsprakenMaker;
import Models.Reservering;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.function.Executable;

class AfsprakenMakerTest {

    @org.junit.jupiter.api.Test
    void maakReservering() {
        /*
        * 4 Testen
        * reservering 1 & 2 horen een object clipshoot en covershoot aant te maken
        * reservering 3 & 4 moeten een illegalargument geven
        * */
        AfsprakenMaker planner = new AfsprakenMaker();

        Reservering reservering1 = planner.MaakReservering(2,"16/10/2021","clipshoot","Eric");
        Reservering reservering2 = planner.MaakReservering(2,"19/10/2021","covershoot",null);

        assertThrows(IllegalArgumentException.class, new Executable() {

            @Override
            public void execute() throws Throwable {
                Reservering reservering3 = planner.MaakReservering(2,"18/10/2021","opname",null);
            }
        });
        assertThrows(IllegalArgumentException.class, new Executable() {

            @Override
            public void execute() throws Throwable {
                Reservering reservering4 = planner.MaakReservering(1,"17/11/2021","clipshoot","Jay");
            }
        });

        assertNotNull(reservering1);
        assertNotNull(reservering2);
    }
}