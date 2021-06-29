package Models;

public abstract class AfsprakenMakerFactory {
    abstract Reservering maakReservering(int aantalPersonen, String date, String typeReservering, String specialValue);
}
