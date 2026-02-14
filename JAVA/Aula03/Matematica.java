package JAVA.Aula03;

import java.util.Scanner;

public class Matematica {
    public static void main(String[] args) {
     //area circulo: Pi r^2   
    
    Scanner entradaUsuario = new Scanner(System.in);
    double x;
    double diam;
    double raio;
    double resultado;
    
        x = Math.PI;


        System.out.print("DIGITE O DIAMETRO: ");
        diam = entradaUsuario.nextDouble();
        raio = diam/2;
        resultado=(Math.pow(raio, 2.0) * x);
        System.out.println("Area do circulo é: " + resultado);

        entradaUsuario.close();
    }
    
}
