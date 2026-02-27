package JAVA.PROJETOS;



public class Meteoro {

        static final int    cidades =  5;
        static final double TempMax = -50;
        static final double TempMin =  60;

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
        
              
        public static double calcularMediaPonderadaTemperatura(double max, double min) {

            if(max < TempMin){
                System.out.println("invalido");
            }
            else if()
                


            //     if (max < TEMP_MIN_LIMITE || max > TEMP_MAX_LIMITE ||
            // min < TEMP_MIN_LIMITE || min > TEMP_MAX_LIMITE) {
            // throw new IllegalArgumentException("Temperatura fora do intervalo permitido.");
            
            
            
            //-Retorna média ponderada (70% máxima, 30% mínima)
            //-Deve validar se temperaturas estão em intervalo razoável
            //(-50°C a 60°C)
       };

        // public static String identificarCidadeComMaiorAmplitudeTermica(){
            
        // };

        // public static String calcularIndiceCalor(double temp, int umidade){


        // };

        public static void gerarAlertas(int cidadeIndex) {

            // * Alerta VERMELHO: temp > 35 OU umidade > 90 
            // * Alerta AMARELO: (temp entre 30-35 E umidade > 80) OU variação > 15°C 
            // * Alerta VERDE: condições normais 
           
        };

        // public static void calcularEstatisticasAvancadas() {
           
        // };

        // public static void gerarRelatorioDetalhado() {
           
        // };

        

    public static void main(String[] args) {

   

    }
    
}






//      "MUITO QUENTE E ÚMIDO" se temp > 30 e umidade > 75 
//      "CONFORTAVEL" se temp entre 20-25 e umidade 50-70 
//      "FRIO E SECO" se temp < 15 e umidade < 50 