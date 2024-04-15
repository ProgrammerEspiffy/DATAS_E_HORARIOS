package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Program_III {
    public static void main(String[] args) {

        //Variáveis iniciais de datas
        LocalDate d01 = LocalDate.parse("2024-04-13");
        LocalDateTime d02 = LocalDateTime.parse("2024-04-15T18:01:49");
        Instant d03 = Instant.parse("2024-03-31T02:33:33Z");

        //Covertendo Data-Hora Global para Local
        LocalDate r1 = LocalDate.ofInstant(d03, ZoneId.systemDefault());//Fuso Horário do Sistema
        LocalDate r2 = LocalDate.ofInstant(d03,ZoneId.of("Portugal"));//Fuso Horário de Portugal

        LocalDateTime r3 = LocalDateTime.ofInstant(d03, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d03, ZoneId.of("Portugal"));



        //Imprimindo LocalDate
        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);

        //Imprimindo LocalDateTime
        System.out.println("r3 = " + r3);
        System.out.println("r4 = " + r4);

        /*Obter dados de uma data-hora Local*/

        //LocalDate
        System.out.println("d01 dia = " + d01.getDayOfMonth());
        System.out.println("d01 mês = " + d01.getMonthValue());
        System.out.println("d01 ano = " + d01.getYear());

        //LocalDateTime
        System.out.println("d02 hora = " + d02.getHour());
        System.out.println("d02 minutos = " + d02.getMinute());
    }
}
