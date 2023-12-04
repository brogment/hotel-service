package edu.wgu.d387_sample_code.i18n;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class PresentationService {

    public String convertTime() {
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");
        ZonedDateTime ET = ZonedDateTime.now().withZoneSameInstant(ZoneId.of("America/New_York"));
        ZonedDateTime MT = ZonedDateTime.now().withZoneSameInstant(ZoneId.of("America/Denver"));
        ZonedDateTime UTC = ZonedDateTime.now().withZoneSameInstant(ZoneId.of("UTC"));

        return "Join us for an online live presentation held at the Landon Hotel at " +
                ET.format(timeFormatter) + " Eastern Time | " +
                MT.format(timeFormatter) + " Mountain Time | " +
                UTC.format(timeFormatter) + " UTC";
    }

}
