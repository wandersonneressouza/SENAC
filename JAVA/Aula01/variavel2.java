package JAVA.Aula01;

public class variavel2 {

        public static void main(String[] args) {
            
            String teste,teste2,espaco;
            teste = "HELLO";
            teste2 = "WORD";
            espaco = " ";


                    /*
                        não pode...
                        "HELLO" - 1
                        "MUNDO" / 123
                        "HELLO" - "mundo"                   
                    */
            
            System.out.println( 1 + 2 + "HELLO");
            System.out.println("HELLO" + 1 + 2);
            System.out.println(teste + espaco + teste2 );

        }
    
}
