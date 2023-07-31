package udemy.javaapi;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.function.Predicate;

public class MD {

    public static void main(String[] args) {
        LocalDate localDate= LocalDate.now();
        LocalDateTime localDateTime= LocalDateTime.now();
        LocalTime localTime= LocalTime.now();
        ZonedDateTime zonedDateTime= ZonedDateTime.now();

        DateTimeFormatter formatter= DateTimeFormatter.ofPattern("yyyyMMdd");
        LocalDate a = LocalDate.parse("12231112",formatter);
        System.out.println(localDateTime.getYear());
        System.out.println(a);

        Period period= Period.of(2022,04,12);
        LocalDate date= LocalDate.of(2030,02,20);
        System.out.println(date);
        System.out.println(period);

        Period period1= Period.parse("p01y012m032d");
        System.out.println(period1);

       ArrayList myList = new ArrayList<>();
       myList.add(0,"A");
        System.out.println(myList.get(0));
        System.out.println(myList.size());
        String element = myList.get(0).toString();
        System.out.println(element);
//
//        System.out.println(localDate);
//        System.out.println(localTime);
//        System.out.println(localDateTime);
//        System.out.println(zonedDateTime);
    }


//    Predicate<Boolean> myPred= Predicate((int i,int j)->(return i<j));
}
