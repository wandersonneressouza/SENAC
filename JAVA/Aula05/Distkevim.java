package JAVA.Aula05;

public class Distkevim {

    public static double calcularDistancia(double t1, double w1, double t2, double w2) {
        double distX,distY,dx,dy,resultado;
        dx = t2 - w1;
        dy = w2 - t1;
        distX = Math.pow(dx, 2.0);
        distY = Math.pow(dy, 2.0);
        resultado = Math.sqrt((distX + distY));
       // System.out.println(resultado);
        return resultado;
    }

    public static void main(String[] args) {
        //exemplo de desenvolvimento incremental:

        // calcular a distancia entre dois pontos

        // distancia dada por :dist = {(x2 -x1)^2 + (y2 - y1)^2}^1/2

        double x1,x2,y1,y2,teste;
        
        x1 = 0;
        y1 = 1;
        x2 = 0;
        y2 = 1;
        teste = calcularDistancia(x1,y1,x2,y2);
        System.out.println(teste);


        
        
        
       //System.out.println("Distancia do eixo:" + distX);
       //System.out.println("Distancia do eixo:" + distY);
        
    }
}
