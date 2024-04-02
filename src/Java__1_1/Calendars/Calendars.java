package Java__1_1.Calendars;

import java.util.Calendar;
import java.util.Date;

public class Calendars {

    public Date getNow() {
        final Calendar calendar = Calendar.getInstance();

        return calendar.getTime();
    }

    public Date getYesterday() {
        final Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, -1);

        return calendar.getTime();
    }

    public Date getTomorrow() {
        final Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, 1);

        return calendar.getTime();
    }

}
