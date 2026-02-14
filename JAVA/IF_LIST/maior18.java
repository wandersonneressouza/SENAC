package JAVA.IF_LIST;

import java.util.Scanner;

public class maior18 {

    public static void main(String[] args) {

        int numb;

        Scanner in = new Scanner(System.in);
        System.out.print("DIGITE SUA IDADE: ");
        numb = in.nextInt();

        if (numb > 17) {
            System.out.println("VC É DE MAIOR");

        } else {
            System.out.println("VC É DE MENOR!");
        }

        in.close();
    }

}
