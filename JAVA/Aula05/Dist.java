package JAVA.Aula05;

public class Dist {


    // exemplo de desenvolvimento incremental.]

    // calcular a distancia entrer dois pontos.

    // distancia dada por: dist = {(x2-x1)^2 + (y2 - y1)^2}^1/2

    public static void main(String[] args) {
        
        //declaração de variavel

        double x1,x2,y1,y2,dx,dy,distX,distY,resultado;

        x1 = 0;
        y1 = 0;
        x2 = 4;
        y2 = 4;
        dx = x2 - x1;
        dy = y2 - y1;

        distX = Math.pow(dx, 2.0);
        distY = Math.pow(dy, 2.0);

        System.out.println(distX);
        System.out.println(distY);

        resultado = Math.sqrt(distX+distY);
        System.out.println(resultado);
    }
    
}
