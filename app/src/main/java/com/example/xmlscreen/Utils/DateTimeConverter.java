package com.example.xmlscreen.Utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class DateTimeConverter {

    public static String convertDateTimeToDDMMYYYY(String inputDateTime) {
        try {
            SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
            inputFormat.setTimeZone(TimeZone.getTimeZone("UTC"));

            SimpleDateFormat outputFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date date = inputFormat.parse(inputDateTime);
            return outputFormat.format(date);
        } catch (ParseException e) {
            e.printStackTrace();
            return ""; // Return empty string or handle the exception accordingly
        }
    }
}
