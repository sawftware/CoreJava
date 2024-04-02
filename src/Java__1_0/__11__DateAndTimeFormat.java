package Java__1_0;

import java.util.Date;
import Java__1_0.DateAndTimeFormat.DateAndTimeFormat;

public class __11__DateAndTimeFormat {

    public static void main(final String[] args) {

        final DateAndTimeFormat dateAndTime = new DateAndTimeFormat();

        System.out.println(dateAndTime.getNow());
        System.out.println(dateAndTime.getYesterday());
        System.out.println(dateAndTime.getTomorrow());
        System.out.println(dateAndTime.getNowFormattedAsTimeHMA());
        System.out.println(dateAndTime.getNowFormattedAsTimeDayMYY());
        System.out.println(dateAndTime.getNowFormattedAsTimeDayMYYYY());
        System.out.println(dateAndTime.getNowFormattedAsDateDDMMYY());
        System.out.println(dateAndTime.getNowFormattedAsDateDDMMYYYYY());
        System.out.println(dateAndTime.getNowFormattedAsDateYYMMDD());
        System.out.println(dateAndTime.getNowFormattedAsDateYYYYMMDD());

    }

}
