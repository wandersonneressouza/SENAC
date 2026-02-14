/*
 console.log (" Qual seu nome ? ");
    let nome = await input();
    console.log (" Qual seu sobrenome ? ");
    let sobrenome = await input();

    let letra = sobrenome[0].toUpperCase();
    let minusculo = nome.toLowerCase();
    let restonome = minusculo [0].toUpperCase() + minusculo.slice(1);


    console.log (`Ola ${letra}. ${restonome}.`);
*/

package JAVA.Aula01;

import java.util.Scanner;

public class exercicio01 {

    public static void main(String[] args) {
        
        String nome, sobrenome, idade, genero;

            Scanner in = new Scanner(System.in);
            
            System.out.println("QUAL E SEU PRIMEIRO NOME:  ?");
            nome = in.nextLine();

            System.out.println("QUAL E SEU SEGUNDO NOME: ?");
            sobrenome = in.nextLine();

            System.out.println("QUAL SUA IDADE: ?");
            idade = in.nextLine();

            System.out.println("QUAL E SEU GENERO: ?");
            genero = in.nextLine();

            System.out.println(" VC É O " + nome + " " + sobrenome +" , TEM " + idade + " ANOS " + " , É DO SEXO "+ genero +  "\n  SEJA BEM VINDO! " );

            in.close();

    }
    
}
