package JAVA.IF_LIST;

import java.util.Scanner;

/* Exercício 17 - Plano de Saúde
Baseado na idade: 0-18 anos = R$ 50, 19-40 = R$ 70, 
41-60 = R$ 90, 61+ = R$ 100. Calcule o valor do plano.

 */

public class Planosaude {

    public static void main(String[] args) {

        int numb;

        Scanner in = new Scanner(System.in);
        System.out.println("------------------------------");
        System.out.println("----Plano de saude NERES----");
        System.out.println("-------Bem vindos-----------");
        System.out.println("------------------------------");
        System.out.print("DIGITE SUA IDADE: ");
        numb = in.nextInt();

        if (numb <= 18 ) {
            System.out.println("seu plano custa R$ 50,00");}

        
        else if((numb >= 19 && numb <= 40) ){
            System.out.println("seu plano custa R$ 70,00");}



         else if((numb >= 41 && numb <= 60) ){
            System.out.println("seu plano custa R$ 90,00");}


           else{
            System.out.println("seu plano custa R$ 100,00");}



        in.close();
    }


    
}
