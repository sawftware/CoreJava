package Java__1_0;

import java.util.Date;
import Java__1_0.SimpleDateAndTimeFormat.SimpleDateAndTimeFormat;

public class __11__SimpleDateAndTimeFormat {

    public static void main(final String[] args) {

        final SimpleDateAndTimeFormat dateAndTime = new SimpleDateAndTimeFormat();

        final Date now = dateAndTime.getNow();
        System.out.println(now);
        System.out.println(dateAndTime.getNowFormattedAsTimeHMA());
        System.out.println(dateAndTime.getNowFormattedAsTimeDayMYY());
        System.out.println(dateAndTime.getNowFormattedAsTimeDayMYYYY());
        System.out.println(dateAndTime.getNowFormattedAsDateDDMMYY());
        System.out.println(dateAndTime.getNowFormattedAsDateDDMMYYYYY());
        System.out.println(dateAndTime.getNowFormattedAsDateYYMMDD());
        System.out.println(dateAndTime.getNowFormattedAsDateYYYYMMDD());
    }

}
