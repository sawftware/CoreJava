package Java__1_0.SimpleDateAndTimeFormat;

import java.util.Date;
import java.text.SimpleDateFormat;

public class SimpleDateAndTimeFormat {

    final private Date date = new Date();
    final private SimpleDateFormat sdfHMA = new SimpleDateFormat("h:mm a");
    final private SimpleDateFormat sdfDMYY = new SimpleDateFormat("EEE, MMM d, ''yy");
    final private SimpleDateFormat sdfDMYYYY = new SimpleDateFormat("EEE, MMM d, yyyy");
    final private SimpleDateFormat sdfYYYYMMDD = new SimpleDateFormat("yyyy-MM-dd");
    final private SimpleDateFormat sdfYYMMDD = new SimpleDateFormat("yy-MM-dd");
    final private SimpleDateFormat sdfDDMMYYYY = new SimpleDateFormat("dd-MM-yyyy");
    final private SimpleDateFormat sdfDDMMYY = new SimpleDateFormat("dd-MM-yy");


    public Date getNow() {
        return new Date(date.getTime());
    }

    public String getNowFormattedAsTimeHMA() {
        return sdfHMA.format(date.getTime());
    }
    public String getNowFormattedAsTimeDayMYY() {
        return sdfDMYY.format(date.getTime());
    }
    public String getNowFormattedAsTimeDayMYYYY() {
        return sdfDMYYYY.format(date.getTime());
    }

    public String getNowFormattedAsDateYYMMDD() {
        return sdfYYMMDD.format(date.getTime());
    }

    public String getNowFormattedAsDateYYYYMMDD() {
        return sdfYYYYMMDD.format(date.getTime());
    }

    public String getNowFormattedAsDateDDMMYY() {
        return sdfDDMMYY.format(date.getTime());
    }

    public String getNowFormattedAsDateDDMMYYYYY() {
        return sdfDDMMYYYY.format(date.getTime());
    }

}
