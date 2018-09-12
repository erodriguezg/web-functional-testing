package com.github.erodriguezguitest.uitest.utils;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberUtils {

    public static double convert(String number) {
        DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getInstance(Locale.GERMAN);
        try {
            return decimalFormat.parse(number).doubleValue();
        } catch (ParseException e) {
            throw new IllegalStateException(e);
        }
    }

}
