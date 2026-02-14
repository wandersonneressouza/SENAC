import java.util.Scanner;


public class Atv10{
    public static void main(String[] args) {

    double numero;
    Scanner entrada = new Scanner(System.in);


    System.out.print("DIGITE UM NUMERO COM PONTO E VIRGULA: ");
    numero = entrada.nextDouble();
    System.out.printf( "o numero reduzido é: %.2f", numero);

    /* %.2f e o codigo para reduzir a mumeração depois da virgula,
    no caso, 2 , estou querendo 2 numeros
    lembrando que pra usar essa formula, tenho que usar o
    "printF", se nao tiver o F nao funciona. */
       
    entrada.close();

    }

    
}