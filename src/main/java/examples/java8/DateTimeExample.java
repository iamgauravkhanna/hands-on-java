package examples.java8;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class DateTimeExample {

    public static void main(String[] args) {
        System.out.println(LocalDate.now());

        System.out.println(LocalDate.of(2022, 2, 4));

        System.out.println(LocalDate.parse("2015-02-20"));

        LocalDate tomorrow = LocalDate.now().plusDays(1);
        System.out.println(tomorrow);

        LocalDate previousMonthSameDay = LocalDate.now().minus(1, ChronoUnit.MONTHS);
        System.out.println(previousMonthSameDay);

        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(LocalDate.now().atStartOfDay(zoneId).toEpochSecond());

    }
}
