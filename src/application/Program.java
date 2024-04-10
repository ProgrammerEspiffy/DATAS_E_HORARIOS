package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Program {
    public static void main(String[] args) {

        //Data & Hora de Agora
        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        LocalDate d04 = LocalDate.parse("2024-01-20");
        LocalDateTime d05 = LocalDateTime.parse("2024-01-20T23:30:24");
        Instant d06 = Instant.parse("2024-01-21T02:30:24Z");
        Instant d07 = Instant.parse("2024-01-21T02:30:24-:03:00");

        //Imprimindo Data-hora de Agora
        System.out.println("d01 = " + d01);
        System.out.println("d02 = " + d02);
        System.out.println("d03 = " + d03);

        //Imprimindo Data-Hora em Texto ISO 8601
        System.out.println("d04 = " + d04);
        System.out.println("d05 = " + d05);
        System.out.println("d06 = " + d06);
        System.out.println("d07 = " + d07);


    }
}
