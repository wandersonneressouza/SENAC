package JAVA.IF_LIST;

import java.util.Scanner;

public class Comparador {

    public static void main(String[] args) {

        int numeroA;
        int numeroB;

        Scanner in = new Scanner(System.in);

        System.out.print("DIGITE NUMERO A: ");
        numeroA = in.nextInt();

        System.out.print("DIGITE NUMERO B: ");
        numeroB = in.nextInt();

        if (numeroA == numeroB) {
            System.out.println("NUMEROS IGUAIS!");
        } else if (numeroA > numeroB) {
            System.out.println("Numero A e maior que numero B");

        } else {
            System.out.println("Numero A e menor que numero B");
        }

        in.close();

    }

}

/* Receba dois números e informe qual é o maior, ou se são iguais. */