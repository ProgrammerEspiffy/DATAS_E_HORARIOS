package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program_II {

    public static void main(String[] args) {

        //Variáveis de Data-Hora
        LocalDate d01 = LocalDate.parse("2024-02-20");
        LocalDateTime d02 = LocalDateTime.parse("2024-03-29T03:33:33");
        Instant d03 = Instant.parse("2006-06-05T00:00:00Z");

        //Formatação de Data-Hora Customizada
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

        //Formatação de Data-Hora em ISO 8601
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;


        //Imprimindo o LocalDate
        System.out.println("d01 = " + d01.format(fmt1));
        System.out.println("d01 = " + fmt1.format(d01));
        System.out.println("d01 = " + d01.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        //Imprimindo LocalDateTime
        System.out.println("d02 = " + d02.format(fmt1));
        System.out.println("d02 = " + d02.format(fmt2));
        System.out.println("d02 = " + d02.format(fmt4));

        //Imprimindo Instant
        System.out.println("d03 = " + fmt3.format(d03));
        System.out.println("d03 = " + fmt5.format(d03));

    }
}