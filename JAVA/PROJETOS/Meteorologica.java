package JAVA.PROJETOS;

public class Meteorologica {




/* quero calcular todas as temperaturas e pegar a media de todas, sendo assim, preciso puxar todas
    as temperaturas [][] 
    antes do FOR, criamos uma variavel
    para percorrer as 5 linhas, e 2 colunas, precisamos criar dois FOR
*/
public static double temperaturaMediaGeral(double[][] temperaturas){

   double soma = 0;

    for (int L = 0; L < 5; L++){
        for (int C = 0; C < 2; C++){

    soma = soma + temperaturas[L][C];
    
        }
    }
    return soma / 10;
}

//  MEDIA PONDERADA.
// public static double calcularMediaPonderada( double umi1, double umi2, double umi3){ 
//     double umiTotal = umi1 + umi2 + umi3;
//     double max;
//     double min;
//     double resultado = 0;
//     //return max * 0.7 + min * 0.3;    

//     return resultado
// }


// CIDADES MAIS QUENTE..
/* PARA ISSO , PRECISO PERCORRER A TABELA DE TEMPERATURA, E PUXAR SOMENTE A MAIOR
PARA ISSO, VAMOS DE FOR*/


 public static double maisQuente(double[][] temperaturas){

    double maior = temperaturas[0][0];
   

    for(int Q = 0; Q < temperaturas.length ; Q++ ){
    
        if (temperaturas[Q][0] > maior){

            maior = temperaturas[Q][0];
        }

    }

return maior;

 }

  public static double maisfria(double[][] temperaturas){

    double menor = temperaturas[0][1];
   
    for(int Q = 0; Q < temperaturas.length ; Q++ ){
    
        if (temperaturas[Q][1] < menor){

            menor = temperaturas[Q][1];
        }

    }

return menor;

 }







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

    String[] cidades = {"Cidade-1", "Cidade-2", "Cidade-3", "Cidade-4", "Cidade-5"};

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
System.out.println("TEMPERATURA MEDIA GERAL: " + temperaturaMediaGeral(temperaturas));
System.out.println("CIDADE MAIS QUENTE: " + maisQuente(temperaturas));
System.out.println("CIDADE MAIS FRIA: " + maisfria(temperaturas));
System.out.println("MAIOR AMPLITUDE: ");
System.out.println("INDICE DE CALOR MAIS ALTO: ");







    };
};
  
