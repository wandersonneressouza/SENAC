package JAVA.Aula01;

//import javax.xml.transform.OutputKeys;

public class variavel {

    public static void main(String[] args) {
        /*
        declaração de variavel em JS:
        let nome_var;  
        var nome_var;
        */  
        String nome;
        int x,y;
        String sobrenome;
        int hora, minuto;
        String mensagem;

        mensagem = "OLA, TUDO BOM?" ;
        hora = 11;
        minuto = 56;
        nome = "Wanderson";
        sobrenome = "Neres";

        x=3;
        y=x; // qual o valor de Y ?

        System.out.println("IMPRIMINDO O VALOR DE Y QUE É = " + y); // se x = 3 , y = x , entao Y e igual a 3
        System.out.println("IMPIMINDO O VALOR DA HORA E MINUTO QUE E IGUAL A: \n " + hora + ":" + minuto );
        System.out.println("AGORA, IMPRIMINDO O NOME E SOBRENOME\n" + nome + " " + sobrenome );
        System.out.println("imprimindo a mensagem declarada inicial: " + mensagem);
        
        mensagem = nome;

        System.out.println("mensagem recebe valor de nome: " + mensagem);

        System.out.println("QUANTOS MINUTOS TEM NA HORA = MINUTOS ?");
        System.out.println(( hora*60) + minuto );
        
       
        



    }
    
}
