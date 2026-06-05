package chapter3;
import java.time.*;

public class DatesandTimeLesson {
    public static void main(String[] args) {
        System.out.println(LocalTime.now());
        System.out.println(LocalDate.now());
        System.out.println(LocalDateTime.now());
        LocalDate date1 = LocalDate.of(1999, 12, 19);
        LocalDate date2 = LocalDate.of(1999, Month.DECEMBER, 19);
        LocalTime time1 = LocalTime.of(14, 45);
        LocalTime time2 = LocalTime.of(14, 45, 30);
        LocalTime time3 = LocalTime.of(14, 45, 30, 400);
        LocalDateTime ldt1 = LocalDateTime.of(1999, 12, 19,14, 45);
        LocalDateTime ldt2 = LocalDateTime.of(date1,time1);
    }
}
