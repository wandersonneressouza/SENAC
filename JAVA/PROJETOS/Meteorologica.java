package JAVA.PROJETOS;

public class Meteorologica {

        static String[] cidades = {"Cidade1" , "Cidade2" , "Cidade3" , "Cidade4" , "Cidade5"};

    
            // Temperaturas: [máxima, mínima] para 5 cidades
            double[][] temperaturas = {
                {32.5, 22.1},  // Cidade 1
                {28.3, 18.7},  // Cidade 2
                {35.8, 24.9},  // Cidade 3
                {30.2, 20.5},  // Cidade 4
                {25.7, 15.3}   // Cidade 5
            };

            // Umidades: [manhã, tarde, noite] para 5 cidades
            int[][] umidades = {
                {85, 60, 75},  // Cidade 1
                {78, 55, 70},  // Cidade 2
                {90, 65, 80},  // Cidade 3
                {82, 58, 72},  // Cidade 4
                {75, 50, 68}   // Cidade 5
            };



        //  MEDIA PONDERADA.

            public static double calcularMediaPonderada(){            
                    
                    double max = 32.5;
                    double min = 22.1;

                return max * 0.7 + min * 0.3;                    
            }

        //  CLASSIFICA CLIMA

            public static String classificarClima(double temperatura, int umidade){
            
               
                if (temperatura > 30 && umidade > 75) {
                return "MUITO QUENTE E ÚMIDO";
            } else if (temperatura >= 20 && temperatura <= 25 && umidade >= 50 && umidade <= 70) {
                return "CONFORTAVEL";
            } else {
                return "FRIO E SECO";
            }
                    
            

        // AMPLITUDE DE TEMPERATURA
        
            
               public static double calcularMaiorAmplitude(double[][] temperaturas) {

                double maiorAmplitude = 0;

                 for (int i = 0; i < temperaturas.length; i++) {

                double maxima = temperaturas[i][0];
                double minima = temperaturas[i][1];

                double amplitude = maxima - minima;

                if (amplitude > maiorAmplitude) {
                    maiorAmplitude = amplitude;
                }
            }

    return maiorAmplitude;    
                    
            }
            

    

            





    public static void main(String[] args){

                    double[][] temperaturas = {
                        {32.5, 22.1},  // Cidade 1
                        {28.3, 18.7},  // Cidade 2
                        {35.8, 24.9},  // Cidade 3
                        {30.2, 20.5},  // Cidade 4
                        {25.7, 15.3}   // Cidade 5
                    };

                    int[][] umidades = {
                        {85, 60, 75},  // Cidade 1
                        {78, 55, 70},  // Cidade 2
                        {90, 65, 80},  // Cidade 3
                        {82, 58, 72},  // Cidade 4
                        {75, 50, 68}   // Cidade 5
                    };


                    

        // System.out.println("-----------------------------------------------");
        // System.out.println(calcularMediaPonderada());                               // retornando a média ponderada das temperaturas
        // // System.out.println(classificarClima(temperaturas[0][1], umidades[0][2]));   // retornando a classificação do clima
        // System.out.println("-----------------------------------------------");
        // System.out.println(calcularMaiorAmplitude(temperaturas));                   // retornando a maior amplitude de temperatura entre as cidades

        
        // // calcular indice de calor ?

        







System.out.println("-------------------------------------------------------------------------------------------");
System.err.println(" ---------------------- SISTEMA DE ANALISE METEOROLIGICO INTELIGENTE ----------------------");
System.out.println("-------------------------------------------------------------------------------------------");
System.out.println("-------------------------------------ANALISE DETALHADA-------------------------------------");
System.out.println("CIDADES,    TEMP MAX,    TEMP MIN,    TEMP MED,    UMIDADE,   CLASSIFICAÇÃO,   ALERTA, ");
System.out.println("Cidade 1,      " + temperaturas[0][0] + ",   " + temperaturas[0][1] + ",   " + "MEDIA" + ",     " + umidades[0][0] + ",     " + umidades[0][1] + ",     "+"ALERTA" );
System.out.println("Cidade 2,      " + temperaturas[1][0] + ",   " + temperaturas[1][1] + ",   " + "MEDIA" + ",     " + umidades[1][0] + ",     " + umidades[1][1] + ",     "+"ALERTA" );
System.out.println("Cidade 3,      " + temperaturas[2][0] + ",   " + temperaturas[2][1] + ",   " + "MEDIA" + ",     " + umidades[2][0] + ",     " + umidades[2][1] + ",     "+"ALERTA" );
System.out.println("Cidade 4,      " + temperaturas[3][0] + ",   " + temperaturas[3][1] + ",   " + "MEDIA" + ",     " + umidades[3][0] + ",     " + umidades[3][1] + ",     "+"ALERTA" );
System.out.println("Cidade 5,      " + temperaturas[4][0] + ",   " + temperaturas[4][1] + ",   " + "MEDIA" + ",     " + umidades[4][0] + ",     " + umidades[4][1] + ",     "+"ALERTA" );
System.out.println("-------------------------------------------------------------------------------------------");

               



        System.err.println(" ------------- RODOU ATE O FIM -------------");
    }   
    
}












// double temperatura  [][] = new double[5][2];
        // double umidade      [][] = new double[5][3];  

        // System.out.println(temperatura[0][0]);
        // System.out.println(umidade[0][0]);