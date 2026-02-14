package JAVA.IF_LIST;

import java.util.Scanner;

/* Exercício 8 - Categoria por Idade
Classifique a idade: 0-12 "Criança", 13-17 
"Adolescente", 18-59 "Adulto", 60+ "Idoso".
 */

public class Idade {

    
    public static void main(String[] args) {

        int numb;

        Scanner in = new Scanner(System.in);
        System.out.print("DIGITE SUA IDADE: ");
        numb = in.nextInt();

        if (numb <= 12 ) {
            System.out.println("CRIANÇA");}

        
        else if((numb >= 13 && numb <= 17) ){
            System.out.println("ADOLECENTE");}



         else if((numb >= 18 && numb <= 59) ){
            System.out.println("ADULTO");}


           else{
            System.out.println("IDOSO!");}



        in.close();
    }

}
