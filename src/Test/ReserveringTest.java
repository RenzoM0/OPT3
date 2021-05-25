package Test;

import com.company.Covershoot;
import com.company.Reservering;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class ReserveringTest {

    @Test
    void getAantalPersonen() {
        Reservering res1;
        Reservering res2 = new Covershoot(2,2,"11/07/2022",null);
        Reservering res3 = new Covershoot(3,3,"11/07/2022",null);
        Reservering res4 = new Covershoot(4,4,"11/07/2022",null);
        Reservering res5 = new Covershoot(5,5,"11/07/2022",null);
        Reservering res6 = new Covershoot(6,6,"11/07/2022",null);
        Reservering res7;

        assertEquals(2,res2.getAantalPersonen());
        assertEquals(3,res3.getAantalPersonen());
        assertEquals(4,res4.getAantalPersonen());
        assertEquals(5,res5.getAantalPersonen());
        assertEquals(6,res6.getAantalPersonen());
        assertThrows(IllegalArgumentException.class, new Executable() {

            @Override
            public void execute() throws Throwable {
                Reservering res1 = new Covershoot(1,1,"11/07/2022",null);
            }
        });
        assertThrows(IllegalArgumentException.class, new Executable() {

            @Override
            public void execute() throws Throwable {
                Reservering res7 = new Covershoot(7,7,"11/07/2022",null);
            }
        });
    }
}