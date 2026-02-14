package JAVA.Aula06;

public class Strings {

    public static void main(String[] args) {
      
      
       String fruta = "banAna";
        char letra;

            for(int i = 0; i <= fruta.length(); i++){   
            letra = fruta.charAt(i);

            
            System.out.println(letra);
                if(letra == 'A' ){
                    System.out.println("Achamos o  Azão");
                }
            }
        


        /*for (char c = 'A' ; c <= 'z'; c++){
            System.out.print(c);
            if(c == 'Z'){
                System.out.print(" ");
                c += 6;
                }
            }
            */

            




    }
                

}
