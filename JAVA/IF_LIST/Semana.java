package JAVA.IF_LIST;

import java.util.Scanner;

public class Semana {

    public static void main(String[] args) {

        int semana;

        Scanner in = new Scanner(System.in);

        System.out.println("DIGITE UM NUMERO DE 1 A 7. ");
        semana = in.nextInt();

        if (semana == 1) {
            System.out.printf("1 = Domingo.");
        } else if (semana == 2) {
            System.out.printf("2 = Segunda.");
        } else if (semana == 3) {
            System.out.printf("3 = Terça.");
        } else if (semana == 4) {
            System.out.printf("4 = Quarta.");
        } else if (semana == 5) {
            System.out.printf("5 = Quinta.");
        } else if (semana == 6) {
            System.out.printf("6 = Sexta.");
        } else if (semana == 7) {
            System.out.printf("7 = Sabado.");
        } else {
            System.out.printf("Numero Invalido!");
        }

        in.close();
    }

}