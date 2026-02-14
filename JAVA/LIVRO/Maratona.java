package JAVA.LIVRO;

import java.util.Scanner;


public class Maratona {

    
public static void main(String[] args) {


   String nome;
   int filmes;
   double duração;
   double calcularTempoTotal;
   
    Scanner in = new Scanner(System.in);
    
    System.out.println();
    System.out.printf(" \n \t BEM ViNDO A MARATONA FILMES, VAMOS COMEÇAR!");
    System.out.println();
    System.out.println();

    //pegando informaçoes do usuario.
        System.out.print("Digite seu nome: ");
        nome = in.nextLine();

        System.out.print("Filmes planejados: ");
        filmes = in.nextInt();

        System.out.print("Duração média por filme: ");
        duração = in.nextDouble();
        
    //converter int em double.
        double fdouble = new Double(filmes); 
        

        System.out.println();
        System.out.println();

        //calculo.
        calcularTempoTotal = fdouble * duração;
    
    System.out.println(calcularTempoTotal + "Horas");


        // RESPOSTA AO USUARIO.
        if (calcularTempoTotal <= 4.0)
            {
            System.out.print("Maratona Leve.");
            }

        else if(calcularTempoTotal > 8.0)
            {
            System.out.print("Maratona Épica!");
            }

        else{
            System.out.print("Maratona Moderada!");
            }

            in.close();
    }
}
