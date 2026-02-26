 import java.util.Scanner;
 
 public class nome{
    public static void main (String[] args) {
      
      Scanner entrada = new Scanner(System.in);
      
      //String dado = "Neres";
      
      /* pergunte o nome do usuario e imprima "ola [nome]!" */
      
      System.out.println("DIGITE SEU NOME: ");
      
      String dado = entrada.nextLine();
      
      System.out.println("Seja bem vindo " + dado);
      
      entrada.close();
    
    }
    
  }
