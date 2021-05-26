package Test;

import com.company.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import javax.sound.sampled.Clip;

import static org.junit.jupiter.api.Assertions.*;

class AfsprakenlijstTest {

    @Test
    void addReservering() {
        Afsprakenlijst afsprakenlijst = Afsprakenlijst.getInstance();
        // afspraak om datum te checken
        afsprakenlijst.AddReservering(new Covershoot(0, 2,"16/02/2022",null));
        //Pairwise testen
        assertThrows(IllegalArgumentException.class, new Executable() {

            @Override
            public void execute() throws Throwable {
                afsprakenlijst.AddReservering(new Covershoot(1, 1,"16/02/2022","Rotterdam"));
            }
        });
        assertThrows(IllegalArgumentException.class, new Executable() {

            @Override
            public void execute() throws Throwable {
                afsprakenlijst.AddReservering(new Covershoot(2, 1,"13/02/2022","Zandvoort"));
            }
        });
        assertThrows(IllegalArgumentException.class, new Executable() {

            @Override
            public void execute() throws Throwable {
                afsprakenlijst.AddReservering(new Covershoot(3, 4,"16/02/2022","Amsterdam"));
            }
        });
        try {
            afsprakenlijst.AddReservering(new Covershoot(4,4,"14/06/2022","Noord"));
        } catch(Exception e) {
            fail("Should not have thrown an exception");
        }
        assertThrows(IllegalArgumentException.class, new Executable() {

            @Override
            public void execute() throws Throwable {
                afsprakenlijst.AddReservering(new Covershoot(5, 4,"16/02/2022","Utrecht"));
            }
        });
        assertThrows(IllegalArgumentException.class, new Executable() {

            @Override
            public void execute() throws Throwable {
                afsprakenlijst.AddReservering(new Clipshoot(6, 4,"16/02/2023",null));
            }
        });
        assertThrows(IllegalArgumentException.class, new Executable() {

            @Override
            public void execute() throws Throwable {
                afsprakenlijst.AddReservering(new Opname(7, 8,"16/02/2024","Roy"));
            }
        });
    }
}