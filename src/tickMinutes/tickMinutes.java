package tickMinutes;

import java.time.Clock;
import java.time.ZoneId;
import java.time.ZonedDateTime;

//time demo
public class tickMinutes {

    public static void main(String[] args) {

        // Zone Id with Zone Europe/Paris
        ZoneId zoneId = ZoneId.of("Europe/Paris");

        // create a clock which ticks in whole minute
        Clock clock = Clock.tickMinutes(zoneId);

        // get ZonedDateTime object to print time
        ZonedDateTime time = clock.instant()
                .atZone(clock.getZone());

        // print time variable value
        System.out.println("Date and Time :" + time);
    }
}

