package Java__1_1;

import Java__1_1.Calendars.Calendars;

import java.util.Date;

public class __1__Calendars {

    public static void main(final String[] args) {

        final Calendars calendars = new Calendars();
        final Date now = calendars.getNow();
        final Date yesterday = calendars.getYesterday();
        final Date tomorrow = calendars.getTomorrow();

        System.out.println(now);
        System.out.println(yesterday);
        System.out.println(tomorrow);

        if(yesterday.before(now)) {
            System.out.println("Yesterday came before now!");
        }

        if(tomorrow.after(now)) {
            System.out.println("Tomorrow comes after now!");
        }

    }

}
