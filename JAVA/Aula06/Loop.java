package JAVA.Aula06;

public class Loop {

// metodo de contagem regressiva
    public static void countdown (int n){
    //while e o que faz a contagem, ou, repete o codigo infinita vezes ate que paramos.
        while (n > 0) {
            
            System.out.println(n);
            // metodo para para esse codigo, subtrai 1 cada vez que passa aqui.
            n = n -1;

        }
        //// quando finaliza a contagem, vai para esse aqui e o de baixo.
        System.out.println("BOOM!");

    }


    public static void main(Strings[] args) {
        
        // nesse caso estou dando um valor pro programa começar.
        int num = 10;
        countdown(num);
        // quando finaliza a contagem, vai para aqui e o de cima.
        System.out.println("Sistema Finalizado");


        
    }
}
