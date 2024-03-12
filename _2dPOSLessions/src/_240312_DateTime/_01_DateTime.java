package _240312_DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class _01_DateTime {
    public static void main(String[] args) {
        // String -> LocalDate
        String time = "12.03.2020";

        DateTimeFormatter dateTimeFormatter =
                DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate localDate = LocalDate.parse(time, dateTimeFormatter);
        System.out.println(localDate);

        System.out.println("Now(): " + LocalDate.now());
        LocalTime localTime = LocalTime.now();
        System.out.println("Now(): " + localTime);

        // String -> LocalTime
        LocalTime localTimeOther = LocalTime.parse("18:45-45",
                DateTimeFormatter.ofPattern("HH:mm-ss"));
        System.out.println(localTimeOther);

        // to String
        String frank = localTimeOther.toString(); // default
        String marcel = localTimeOther.format(DateTimeFormatter.ofPattern("HH-mm"));
        System.out.println(frank);
        System.out.println(marcel);

        // LocalDateTime
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        // Time measurement
        Long startTime = System.currentTimeMillis();
        for(int i = 0; i < 1_000; ++i){
            System.out.println("Hello Barbie");
        }
        Long diff = System.currentTimeMillis() - startTime;
        System.out.println(String.format("1000 runs in a Loops: %d ms", diff));

        // Some calcs
        LocalDate fridayImInLove = LocalDate.now();
        LocalDate nextFridayInLove = fridayImInLove.plusDays(7);
        System.out.println(nextFridayInLove);
        System.out.println(nextFridayInLove.getDayOfWeek().toString());
        System.out.println(nextFridayInLove.getDayOfYear());
        // Play around with ...

        Period week = Period.ofWeeks(1);

        // your turn: sout all weekly pos-todos starting from today until 7.7.2024.
        LocalDate todo = LocalDate.now();
        int counter = 0;
        do{
            System.out.println(todo);
            todo = todo.plus(week);
            counter++;
        } while(todo.isBefore(LocalDate.of(2024, 7, 7)));
        System.out.println("Counter: " + counter);

    }
}
