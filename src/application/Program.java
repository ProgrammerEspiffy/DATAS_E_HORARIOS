package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class Program {
    public static void main(String[] args) {

        //https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/format/DateTimeFormatter.html
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        //Data & Hora de Agora
        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        //Data & Hora em Texto ISO 8601
        LocalDate d04 = LocalDate.parse("2024-01-20");
        LocalDateTime d05 = LocalDateTime.parse("2024-01-20T23:30:24");
        Instant d06 = Instant.parse("2024-01-21T02:30:24Z");
        OffsetDateTime d07 = OffsetDateTime.parse("2022-07-20T04:30:26-03:00");

        //Data & Hora em Texto Customizado
        LocalDate d08 = LocalDate.parse("20/01/2024", fmt1);
        LocalDateTime d09 = LocalDateTime.parse("11/04/2024 17:45", fmt2);

        //Data & Hora com Dados Isolados
        LocalDate d10 = LocalDate.of(2024, 04,11);
        LocalDateTime d11 = LocalDateTime.of(2024, 01, 10, 22,30);

        //Imprimindo Data-hora de Agora
        System.out.println("d01 = " + d01);
        System.out.println("d02 = " + d02);
        System.out.println("d03 = " + d03);

        //Imprimindo Data-Hora em Texto ISO 8601
        System.out.println("d04 = " + d04);
        System.out.println("d05 = " + d05);
        System.out.println("d06 = " + d06);
        System.out.println("d07 = " + d07);

        //Imprimindo Data-Hora em texto Customizado
        System.out.println("d08 = " + d08);
        System.out.println("d09 = " + d09);

        //Imprimindo Data-Hora com Dados Isolados
        System.out.println("d10 = " + d10);
        System.out.println("d11 = " + d11);

    }
}
