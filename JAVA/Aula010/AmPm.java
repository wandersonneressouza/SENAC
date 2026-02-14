package JAVA.Aula010;
import java.util.Scanner;

public class AmPm {

    public static String timeString(int hora, int minuto) {
        String amPm = "AM";
        if (hora >= 12) {
            amPm = "PM";
            if (hora > 12) {
                hora -= 12;
            }
        } else if (hora == 0) {
            hora = 12;
        }
        return String.format("%02d:%02d %s", hora, minuto, amPm);
        // Formata a string para exibir a hora, minuto e AM/PM
            }
    

    public static void main(String[] args) {

        int hora;
        int minuto;

        Scanner in = new java.util.Scanner(System.in);
        
        System.out.print("Digite o valor da hora: ");
        
        hora = in.nextInt();
        System.out.print("Digite o valor do minuto: ");
        minuto = in.nextInt();

        String resultado = timeString(hora, minuto);
        System.out.println(resultado);

        in.close();

    }
}
