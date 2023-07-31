package udemy;

import java.io.FileNotFoundException;
import java.time.*;
public class DateAndTimes {

    public static void main(String[] args) throws FileNotFoundException {

        //STATIC METHODS!!!
        LocalDate localDate= LocalDate.now();
        LocalDateTime localDateTime= LocalDateTime.now();
        LocalTime localTime= LocalTime.now();
        ZonedDateTime zonedDateTime= ZonedDateTime.now();

        LocalDate birthDate = LocalDate.of(1982,07,27);
        LocalDateTime localDateTime1= LocalDateTime.of(birthDate,localTime);
        System.out.println(localDateTime1);//1982-07-27T14:17:34.950
        localDateTime1.plusYears(10);
        System.out.println(localDateTime1);//1982-07-27T14:17:34.950
        //You need to create a new Variable to save the new value:
        LocalDateTime newDate = localDateTime1.plusYears(10);//1992-07-27T14:19:00.243
        System.out.println(newDate);//1992-07-27T14:19:00.243

        ZoneId zoneId= ZoneId.of("America/Sao_Paulo");
        ZoneId ukZone= ZoneId.of("Europe/Paris");
        System.out.println(zoneId);
        ZonedDateTime z1= ZonedDateTime.of(localDateTime1,zoneId);
        ZonedDateTime z2= ZonedDateTime.of(localDateTime1,ukZone);
        System.out.println(z1);
        System.out.println(z2);

        Period p1= Period.ofYears(2);

        Duration duration= Duration.ofDays(3);//PT72H
        System.out.println(duration);



    }

    public String createString (String a ){
        return a;
    }

    DateAndTimes(){

    }


}
