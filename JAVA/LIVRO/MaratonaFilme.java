package JAVA.LIVRO;

import java.util.Scanner;

public class MaratonaFilme {


    //METODO DO CABEÇALHO----------------------------------------
    public static void exibirCabecalho(){
        System.out.println();
        System.out.printf(" \n \t BEM ViNDO A MARATONA FILMES, VAMOS COMEÇAR!");
        System.out.println();
        System.out.println();
    }
    //-------------------------------------------------------------

    //METODO DO CALCULO--------------------------------------------

       public static double calcularTempoTotal(double fdouble, double duracao){
       return fdouble * duracao;
       }

    //-------------------------------------------------------------

    //METODO DE CLASSIFICAÇÃO -------------------------------------

    public static String classificarMaratona(double tempoTotal){

        if(tempoTotal <= 4.0)
            {
            return("Maratona Leve.");
            }

        else if(tempoTotal > 8.0)
            {
            return("Maratona Épica!");
            }

        else{
            return("Maratona Moderada!");
            }

    }


    //-------------------------------------------------------------






    public static void main(String[] args) {

        String nome;
        int filmes;
        double duracao;
        double tempoTotal;
        String classificacao;

        Scanner in = new Scanner(System.in);

        exibirCabecalho();

        //Entrada de Dados..
        System.out.print("Digite seu Nome: ");
        nome = in.nextLine();

        System.out.print("Filmes Planejados: ");
        filmes = in.nextInt();

        System.out.print("Duração Média por Filme: ");
        duracao = in.nextDouble();

        double fdouble = new Double(filmes); 
        
        //chamando o calculo .............
        tempoTotal = calcularTempoTotal(fdouble , duracao);
        //System.out.println("resultado Metodo: " + tempoTotal);
       

        //chamando a classificação
        classificacao = classificarMaratona(tempoTotal);
        //System.out.println(classificacao);

        
        in.close();

        
        System.out.println();
        System.out.println();
        System.out.printf( "|-------------------------------------|" ); 
        System.out.println(" \n \t SEU NIVEL DE MARATONA ");
        System.out.printf( "|-------------------------------------|" ); 
        System.out.println();
        System.out.println();
        System.out.printf("\n TEMPO TOTAL É: "+ tempoTotal + " Horas");
        System.out.printf("\n CLASSIFICADO COMO: "+ classificacao);
        System.out.println();
        System.out.println();
        
        
    }
    
}
