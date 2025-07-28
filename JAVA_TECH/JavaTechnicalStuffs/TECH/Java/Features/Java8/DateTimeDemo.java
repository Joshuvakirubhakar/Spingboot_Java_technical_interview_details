package JAVA_TECH.DesignPatterns.TECH.Java.Features.Java8;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeDemo {

    public static void main(String args[]){
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Current Date and Time: " + now);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDateTime = now.format(formatter);
        System.out.println("Formatted Date and Time: " + formattedDateTime);
    }
}
