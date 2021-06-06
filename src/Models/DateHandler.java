package Models;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateHandler {
    private String dateStr;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public DateHandler(){}

    public String getDateFormat(LocalDate date){
        this.dateStr = date.format(formatter);
        return this.dateStr;
    }
}
