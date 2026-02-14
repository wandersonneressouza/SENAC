package JAVA.Aula01;

public class doblo {

    public static void main(String[] args) {
        
        //double pi;
        double minuto;
        //double balanco; //declaração da variavel var doble, conhecida tbm de variavel  flutuante

        //balanco = 123.45;
        //pi = 3.14159;
        minuto = 53.0;

        System.out.println("fração da hora contida na var minuto");
        System.out.println(minuto/60.0);
        System.out.println("Porcentagem de hora na var minuto");
        System.out.println((minuto/60)*100.0);
        System.out.println("SE TA DOIDO");

        /*
             POSSIVEL ERROS

             int x =1.1             - erro de comunicação
             double y = 1           - não da erro mais nao e uma boa pratica
             double y = 1/3         - vai da erro
             double y = 1.0 / 3.0   - modo correto de declaração de atribuição

                        
            */

        System.out.println(0.1 * 10);
        System.out.println(0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1);
    


    }

            


}
