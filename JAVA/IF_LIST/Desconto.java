package JAVA.IF_LIST;

import java.util.Scanner;

/* Exercício 10 - Desconto por Compra
Se o valor da compra for maior que R$ 100,
aplique 10% de desconto. Mostre o valor final. */


public class Desconto {

    
    public static void main(String[] args) {

        double valor;

        Scanner in = new Scanner(System.in);
        System.out.print("DIGITE O VALOR DA COMPRA: ");
        valor = in.nextDouble();

        if (valor <= 0) {
            System.out.println("vc nao gastou nada pois é numero negativo");}

            

        else if (valor <= 99.99) {
            System.out.println("VALOR NAO ENTRA DESCONTO, SEU VALOR É: " + valor + " Reais");}





         else {
            System.out.println("VC GASTOU ACIMA DE 100,00. SEU DESCONTO É: " + valor * 0.1 + " Reais");}
        

        in.close();
    }

    
}
