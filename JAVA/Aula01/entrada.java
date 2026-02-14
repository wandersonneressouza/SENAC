package JAVA.Aula01;

import java.util.Scanner;

public class entrada {

        public static void main(String[] args) {
            
            String line;

            Scanner in = new Scanner(System.in);

            System.out.println("DIGITE ALGO");
            line = in.nextLine();
            
            System.out.println("VC DISSE: " + line);
         
            in.close();
        }
    
       
}
