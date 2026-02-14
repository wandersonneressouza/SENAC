package JAVA.Aula05;

public class Dist2 {
    public static void calculeDistancia(){
        

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

public static void main(String[] args) {
        
    calculeDistancia();
   
    }

}
