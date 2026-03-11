package JAVA.PROJETOS;

public class Meteorologica {

// public static double temperaturaMediaGeral(){

// }



//  MEDIA PONDERADA.

// public static double calcularMediaPonderada( double umi1, double umi2, double umi3){            

//     double umiTotal = umi1 + umi2 + umi3;
//     double max;
//     double min;
//     double resultado = 0;



//     //return max * 0.7 + min * 0.3;    

//     return resultado
// }

// CALCULO MEDIA SIMPLES,

        public static double umidadeMedia(double umi1, double umi2, double umi3){
             double media = (umi1 + umi2 + umi3) / 3;
            
             return media;

            
        }



       
  // Classificação do clima
    public static String classificarClima(double tempMedia, int umidadeMedia) {

        if (tempMedia > 30 && umidadeMedia > 75) {
            return "MUITO QUENTE E ÚMIDO";
        } else if (tempMedia >= 20 && tempMedia <= 25 && umidadeMedia >= 50 && umidadeMedia <= 70) {
            return "CONFORTAVEL";
        } else if (tempMedia < 15 && umidadeMedia < 50) {
            return "FRIO E SECO";
        } else {
            return "NORMAL";
        }
    }     


    // Gerar alertas
    public static String gerarAlertas( double temperatura, double umidade) {
        
        if(temperatura > 30 || umidade > 90){
            return "VERMELHO";
        }else if(temperatura > 30 && temperatura < 35 || umidade > 80)
            return "AMARELO";
        return "VERDE";
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


System.out.println("-------------------------------------------------------------------------------------------");
System.err.println(" ---------------------- SISTEMA DE ANALISE METEOROLIGICO INTELIGENTE ----------------------");
System.out.println("-------------------------------------------------------------------------------------------");
System.out.println("-------------------------------------ANALISE DETALHADA-------------------------------------");
System.out.println("CIDADES,    TEMP MAX,    TEMP MIN,    TEMP MED,    UMIDADE,   CLASSIFICAÇÃO,         ALERTA, ");
System.out.println("Cidade 1,      " + temperaturas[0][0] + ",      " + temperaturas[0][1] + ",         " + (String.format("%.2f", (temperaturas[0][0] + temperaturas[0][1]) / 2)) + ",     " + String.format("%.2f", umidadeMedia(umidades[0][0], umidades[0][1], umidades[0][2])) + ",     " + classificarClima((temperaturas[0][0] + temperaturas[0][1]) / 2, (umidades[0][0] + umidades[0][1]) / 2) + ",                "+ gerarAlertas((temperaturas[0][0] + temperaturas[0][1]) / 2, (umidades[0][0] + umidades[0][1]) / 2));
System.out.println("Cidade 2,      " + temperaturas[1][0] + ",      " + temperaturas[1][1] + ",         " + (String.format("%.2f", (temperaturas[1][0] + temperaturas[1][1]) / 2)) + ",     " + String.format("%.2f", umidadeMedia(umidades[1][0], umidades[1][1], umidades[1][2])) + ",     " + classificarClima((temperaturas[1][0] + temperaturas[1][1]) / 2, (umidades[1][0] + umidades[1][1]) / 2) + ",           "+ gerarAlertas((temperaturas[1][0] + temperaturas[1][1]) / 2, (umidades[1][0] + umidades[1][1]) / 2));
System.out.println("Cidade 3,      " + temperaturas[2][0] + ",      " + temperaturas[2][1] + ",         " + (String.format("%.2f", (temperaturas[2][0] + temperaturas[2][1]) / 2)) + ",     " + String.format("%.2f", umidadeMedia(umidades[2][0], umidades[2][1], umidades[2][2])) + ",     " + classificarClima((temperaturas[2][0] + temperaturas[2][1]) / 2, (umidades[2][0] + umidades[2][1]) / 2) + ",  "+ gerarAlertas((temperaturas[2][0] + temperaturas[2][1]) / 2, (umidades[2][0] + umidades[2][1]) / 2));
System.out.println("Cidade 4,      " + temperaturas[3][0] + ",      " + temperaturas[3][1] + ",         " + (String.format("%.2f", (temperaturas[3][0] + temperaturas[3][1]) / 2)) + ",     " + String.format("%.2f", umidadeMedia(umidades[3][0], umidades[3][1], umidades[3][2])) + ",     " + classificarClima((temperaturas[3][0] + temperaturas[3][1]) / 2, (umidades[3][0] + umidades[3][1]) / 2) + ",                "+ gerarAlertas((temperaturas[3][0] + temperaturas[3][1]) / 2, (umidades[3][0] + umidades[3][1]) / 2));
System.out.println("Cidade 5,      " + temperaturas[4][0] + ",      " + temperaturas[4][1] + ",         " + (String.format("%.2f", (temperaturas[4][0] + temperaturas[4][1]) / 2)) + ",     " + String.format("%.2f", umidadeMedia(umidades[4][0], umidades[4][1], umidades[4][2])) + ",     " + classificarClima((temperaturas[4][0] + temperaturas[4][1]) / 2, (umidades[4][0] + umidades[4][1]) / 2) + ",           "+ gerarAlertas((temperaturas[4][0] + temperaturas[4][1]) / 2, (umidades[4][0] + umidades[4][1]) / 2));
System.out.println("-------------------------------------------------------------------------------------------");
System.out.println("-------------------------------------ESTATISTICA GERAIS------------------------------------");
System.out.println("-------------------------------------------------------------------------------------------");
//System.out.println("TEMPERATURA MEDIA GERAL" + temperaturaMediaGeral());



 /* quero calcular todas as temperaturas e pegar a media de todas, sendo assim, preciso puxar todas
    as temperaturas [][] 
    antes do FOR, criamos uma variavel
    para percorrer as 5 linhas, e 2 colunas, precisamos criar dois FOR

    */

    double soma = 0;

    for (int i = 0; i < 5; i++);
    for (int j = 0; j < 1; j++);

    soma = soma + temperaturas[i][j];






    };
};
  





















// System.out.printf("Cidade 5\t%.1f\t\t%.1f\t\t%.2f\t\t%.2f\t\t%s\t\t%s%n",
//     temperaturas[4][0],
//     temperaturas[4][1],
//     (temperaturas[4][0] + temperaturas[4][1]) / 2,
//     umidadeMedia(umidades[4][0], umidades[4][1], umidades[4][2]),
//     classificarClima((temperaturas[4][0] + temperaturas[4][1]) / 2, (umidades[4][0] + umidades[4][1]) / 2),
//     gerarAlertas((temperaturas[4][0] + temperaturas[4][1]) / 2, (umidades[4][0] + umidades[4][1]) / 2)
// );









// System.out.println("Cidade 1,      " + temperaturas[0][0] + ",      " + temperaturas[0][1] + ",         " + (String.format("%.2f", (temperaturas[0][0] + temperaturas[0][1]) / 2)) + ",     " + String.format("%.2f", umidadeMedia(umidades[0][0], umidades[0][1], umidades[0][2])) + "," + classificarClima((temperaturas[0][0] + temperaturas[0][1]) / 2, (umidades[0][0] + umidades[0][1]) / 2) + ",        "+ gerarAlertas((temperaturas[0][0] + temperaturas[0][1]) / 2, (umidades[0][0] + umidades[0][1]) / 2));
// System.out.println("Cidade 2,      " + temperaturas[1][0] + ",      " + temperaturas[1][1] + ",         " + (String.format("%.2f", (temperaturas[1][0] + temperaturas[1][1]) / 2)) + ",     " + String.format("%.2f", umidadeMedia(umidades[1][0], umidades[1][1], umidades[1][2])) + "," + classificarClima((temperaturas[1][0] + temperaturas[1][1]) / 2, (umidades[1][0] + umidades[1][1]) / 2) + ",        "+ gerarAlertas((temperaturas[1][0] + temperaturas[1][1]) / 2, (umidades[1][0] + umidades[1][1]) / 2));
// System.out.println("Cidade 3,      " + temperaturas[2][0] + ",      " + temperaturas[2][1] + ",         " + (String.format("%.2f", (temperaturas[2][0] + temperaturas[2][1]) / 2)) + ",     " + String.format("%.2f", umidadeMedia(umidades[2][0], umidades[2][1], umidades[2][2])) + "," + classificarClima((temperaturas[2][0] + temperaturas[2][1]) / 2, (umidades[2][0] + umidades[2][1]) / 2) + ",        "+ gerarAlertas((temperaturas[2][0] + temperaturas[2][1]) / 2, (umidades[2][0] + umidades[2][1]) / 2));
// System.out.println("Cidade 4,      " + temperaturas[3][0] + ",      " + temperaturas[3][1] + ",         " + (String.format("%.2f", (temperaturas[3][0] + temperaturas[3][1]) / 2)) + ",     " + String.format("%.2f", umidadeMedia(umidades[3][0], umidades[3][1], umidades[3][2])) + "," + classificarClima((temperaturas[3][0] + temperaturas[3][1]) / 2, (umidades[3][0] + umidades[3][1]) / 2) + ",        "+ gerarAlertas((temperaturas[3][0] + temperaturas[3][1]) / 2, (umidades[3][0] + umidades[3][1]) / 2));
// System.out.println("Cidade 5,      " + temperaturas[4][0] + ",      " + temperaturas[4][1] + ",         " + (String.format("%.2f", (temperaturas[4][0] + temperaturas[4][1]) / 2)) + ",     " + String.format("%.2f", umidadeMedia(umidades[4][0], umidades[4][1], umidades[4][2])) + "," + classificarClima((temperaturas[4][0] + temperaturas[4][1]) / 2, (umidades[4][0] + umidades[4][1]) / 2) + ",        "+ gerarAlertas((temperaturas[4][0] + temperaturas[4][1]) / 2, (umidades[4][0] + umidades[4][1]) / 2));

// System.out.printf("Cidade 1, "+ "\t" + temperaturas[0][0] + "\t"+ temperaturas[0][1] + "\t" + (String.format("%.2f", (temperaturas[0][0] + temperaturas[0][1]) / 2)) + "\t"+ String.format("%.2f", umidadeMedia(umidades[0][0], umidades[0][1], umidades[0][2])) + "\t"+ classificarClima((temperaturas[0][0] + temperaturas[0][1]) / 2, (umidades[0][0] + umidades[0][1]) / 2) + "\t"+ gerarAlertas((temperaturas[0][0] + temperaturas[0][1]) / 2, (umidades[0][0] + umidades[0][1]) / 2));
// System.out.printf("Cidade 2, "+ "\t" + temperaturas[1][0] + "\t"+ temperaturas[1][1] + "\t" + (String.format("%.2f", (temperaturas[1][0] + temperaturas[1][1]) / 2)) + "\t"+ String.format("%.2f", umidadeMedia(umidades[1][0], umidades[1][1], umidades[1][2])) + "\t"+ classificarClima((temperaturas[1][0] + temperaturas[1][1]) / 2, (umidades[1][0] + umidades[1][1]) / 2) + "\t"+ gerarAlertas((temperaturas[1][0] + temperaturas[1][1]) / 2, (umidades[1][0] + umidades[1][1]) / 2));
// System.out.printf("Cidade 3, "+ "\t" + temperaturas[2][0] + "\t"+ temperaturas[2][1] + "\t" + (String.format("%.2f", (temperaturas[2][0] + temperaturas[2][1]) / 2)) + "\t"+ String.format("%.2f", umidadeMedia(umidades[2][0], umidades[2][1], umidades[2][2])) + "\t"+ classificarClima((temperaturas[2][0] + temperaturas[2][1]) / 2, (umidades[2][0] + umidades[2][1]) / 2) + "\t"+ gerarAlertas((temperaturas[2][0] + temperaturas[2][1]) / 2, (umidades[2][0] + umidades[2][1]) / 2));
// System.out.printf("Cidade 4, "+ "\t" + temperaturas[3][0] + "\t"+ temperaturas[3][1] + "\t" + (String.format("%.2f", (temperaturas[3][0] + temperaturas[3][1]) / 2)) + "\t"+ String.format("%.2f", umidadeMedia(umidades[3][0], umidades[3][1], umidades[3][2])) + "\t"+ classificarClima((temperaturas[3][0] + temperaturas[3][1]) / 2, (umidades[3][0] + umidades[3][1]) / 2) + "\t"+ gerarAlertas((temperaturas[3][0] + temperaturas[3][1]) / 2, (umidades[3][0] + umidades[3][1]) / 2));
// System.out.printf("Cidade 5, "+ "\t" + temperaturas[4][0] + "\t"+ temperaturas[4][1] + "\t" + (String.format("%.2f", (temperaturas[4][0] + temperaturas[4][1]) / 2)) + "\t"+ String.format("%.2f", umidadeMedia(umidades[4][0], umidades[4][1], umidades[4][2])) + "\t"+ classificarClima((temperaturas[4][0] + temperaturas[4][1]) / 2, (umidades[4][0] + umidades[4][1]) / 2) + "\t"+ gerarAlertas((temperaturas[4][0] + temperaturas[4][1]) / 2, (umidades[4][0] + umidades[4][1]) / 2));



        // double temperatura  [][] = new double[5][2];
        // double umidade      [][] = new double[5][3]; 
        // System.out.println(temperatura[0][0]);
        // System.out.println(umidade[0][0]);