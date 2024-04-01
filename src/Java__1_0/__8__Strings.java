package Java__1_0;

import Java__1_0.Strings.StringBuilder;
import Java__1_0.Strings.StringFormatting;
import Java__1_0.Strings.StringManipulation;

public class __8__Strings {

    public static void main(final String[] args) {

        final StringManipulation stringManipulation = new StringManipulation();

        // Simple Printing
        stringManipulation.sysout();
        stringManipulation.trim();
        stringManipulation.replace();
        stringManipulation.concat();
        stringManipulation.substring();

        // String Formatting
        final StringFormatting stringFormatting = new StringFormatting();
        stringFormatting.stringFormat();

        // String Builder
        final StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.stringBuilder();
    }

}