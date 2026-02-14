package JAVA.Aula06;

public class Loop_copy {


    public static void countdown (int n){
    
        while (n <= 10 ) {
            
            System.out.println(n);
         
            // n = n + 1; forma de fazer mais burra!
            n++; // forma de fazer mais esperta!
            //n--; // formula decrementa!

        }
        System.out.println("BOOM!");
    }

    public static void sequence(int n){
//conta matematica muito doida que so para se o numero for igual a 1;
        while (n != 1){
            System.out.println(n);
            if(n%2==0) n = n /2;
            else n=n * 3 + 1;

        }
            System.out.println(n);
    } 

        public static void appreciate(){
            int i = 2;
            while (i <= 8 ){
                System.out.print(i + ",");
                i += 2;
            }
        }

        public static void appreciate2(){
            for (int i = 2; i <= 8; i += 2){
                System.out.print(i+",");
            }
        }

        public static void loopvar(){
            int n;
            for(n=3; n>0; n--){
                System.out.print(n);
            }
        }

        public static void nested(){
            for (int x = 1; x <= 10; x ++){
                for(int y = 1; y <= 10; y++){
                    System.out.printf("%20d" , x + y);
                }
            }
        }

    public static void main(Strings[] args) {
        
        
        //int num = 0;
        //countdown(num);
        //sequence(3);
        //appreciate();
        //appreciate2();
        //loopvar();
        nested();

        System.out.println("Sistema Finalizado");
    }
}
