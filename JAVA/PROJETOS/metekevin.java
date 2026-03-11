package JAVA.PROJETOS;



    

import java.util.ArrayList;
import java.util.List;

// ===== ENUMS Lista fixas de opções =====

enum NivelAlerta {
    VERDE, AMARELO, VERMELHO
}

enum ClassificacaoClima {
    MUITO_QUENTE, CONFORTAVEL, FRIO_E_SECO, QUENTE_MODERADO, QUENTE_LEVE
}

// São listas fixas de opções. NivelAlerta define os 3 níveis de perigo possíveis.
// ClassificacaoClima define os 5 tipos de clima.
// O sistema só pode retornar um desses valores, evitando erros com textos soltos.

// ===== CLASSE CIDADE =====

class Cidade {
    private String nome;
    private double temperaturaMaxima;
    private double temperaturaMinima;
    private int[] umidades;

    // São os dados que cada cidade guarda. Todos são private para que só a própria classe os manipule.
    //  umidades é um array pois cada cidade tem várias medições de umidade no dia.

    /**
     * Construtor da cidade. Valida os dados antes de criar o objeto.
     */
    public Cidade(String nome, double temperaturaMaxima, double temperaturaMinima, int[] umidades) {
        // Validação: temperatura fora do intervalo permitido
        if (temperaturaMaxima < -50 || temperaturaMaxima > 60 || temperaturaMinima < -50 || temperaturaMinima > 60) {
            System.out.println("Aviso: Temperatura fora do intervalo permitido para " + nome + ".");
        }
        // Validação: mínima maior que máxima
        if (temperaturaMinima > temperaturaMaxima) {
            System.out.println("Aviso: Temperatura mínima não pode ser maior que a máxima para " + nome + ".");

            // É chamado quando você escreve new Cidade(...).
            // Primeiro valida os dados — se algo estiver errado, avisa mas não trava o programa.
            // Depois o this.x = x salva cada valor recebido dentro do objeto.
        }

        this.nome = nome; // "guarde o valor recebido no atributo interno desta cidade".
        this.temperaturaMaxima = temperaturaMaxima;
        this.temperaturaMinima = temperaturaMinima;
        this.umidades = umidades;
    }

    // Getters
    public String getNome() { return nome; }
    public double getTemperaturaMaxima() { return temperaturaMaxima; }
    public double getTemperaturaMinima() { return temperaturaMinima; }

    // Como os atributos são private, esses métodos são a única forma de ler os valores de fora da classe.
    // Cada um simplesmente devolve o valor do atributo correspondente.

    /**
     * Calcula a média ponderada da temperatura (70% máx + 30% mín).
     */
    public double calcularMediaPonderadaTemperatura() {
        return (temperaturaMaxima * 0.7) + (temperaturaMinima * 0.3);
    }

    /**
     * Calcula a média simples das umidades registradas.
     */
    public int calcularUmidadeMedia() {
        int soma = 0;
        for (int u : umidades) soma += u; // Percorre o array de umidades somando todos os valores, depois divide pelo total de medições.
        return soma / umidades.length;
    }

    /**
     * Classifica o clima da cidade com base na temperatura e umidade médias.
     */
    public ClassificacaoClima classificarClima() {
        double tempMedia = calcularMediaPonderadaTemperatura();
        int umidadeMedia = calcularUmidadeMedia();

        if (tempMedia > 30 && umidadeMedia > 75) return ClassificacaoClima.MUITO_QUENTE;
        if (tempMedia >= 20 && tempMedia <= 25 && umidadeMedia >= 50 && umidadeMedia <= 70) return ClassificacaoClima.CONFORTAVEL;
        if (tempMedia < 15 && umidadeMedia < 50) return ClassificacaoClima.FRIO_E_SECO;
        if (tempMedia > 25) return ClassificacaoClima.QUENTE_MODERADO;
        return ClassificacaoClima.QUENTE_LEVE;
    }  // Usa a temperatura e umidade médias para enquadrar a cidade em uma das 5 classificações. As condições são verificadas em ordem a primeira que for verdadeira ganha.

    /**
     * Gera um alerta com base na temperatura máxima, umidade e variação térmica.
     */
    public NivelAlerta gerarAlerta() {
        double variacao = calcularAmplitudeTermica();
        int umidadeMedia = calcularUmidadeMedia();

        if (temperaturaMaxima > 35 || umidadeMedia > 90) return NivelAlerta.VERMELHO;
        if ((temperaturaMaxima >= 30 && temperaturaMaxima <= 35 && umidadeMedia > 80) || variacao > 15) return NivelAlerta.AMARELO;
        return NivelAlerta.VERDE;
    }

    /**
     * Calcula a diferença entre temperatura máxima e mínima.
     */
    public double calcularAmplitudeTermica() {
        return temperaturaMaxima - temperaturaMinima;
    }
}

// ===== CLASSE SISTEMA METEOROLÓGICO =====
// A lista cidades armazena todos os objetos Cidade criados. 
// O método adicionarCidade recebe um objeto pronto e o coloca na lista.
class SistemaMeteorologico {
    private List<Cidade> cidades = new ArrayList<>();

    public void adicionarCidade(Cidade cidade) {
        cidades.add(cidade);
    }

    /**
     * Gera o relatório completo com todas as cidades e estatísticas globais.
     */
    public void gerarRelatorioDetalhado() {
        // Verifica se há cidades cadastradas antes de gerar o relatório
        if (cidades.isEmpty()) {
            System.out.println("Nenhuma cidade cadastrada.");
            return;
        }

        System.out.println("======================================================");
        System.out.println("   SISTEMA DE ANÁLISE METEOROLÓGICA INTELIGENTE");
        System.out.println("======================================================\n");
        System.out.println("CIDADE     | T.MAX | T.MIN | T.MÉD | UMID% | CLASSIFICAÇÃO     | ALERTA");
        System.out.println("-----------|-------|-------|-------|-------|-------------------|--------");

        for (Cidade c : cidades) {
            System.out.printf("%-10s | %.1f°C| %.1f°C| %.1f°C|  %d  | %-18s| %s\n",
                    c.getNome(),
                    c.getTemperaturaMaxima(),
                    c.getTemperaturaMinima(),
                    c.calcularMediaPonderadaTemperatura(),
                    c.calcularUmidadeMedia(),
                    c.classificarClima(),
                    c.gerarAlerta());
        // Percorre cada cidade da lista e imprime os dados formatados.
        // O %-10s alinha o nome à esquerda em 10 caracteres. O %.1f exibe o número com 1 casa decimal.
        }

        double[] stats = calcularEstatisticasGlobais();
        System.out.printf("\nESTATÍSTICAS GERAIS:\n");
        System.out.printf("- Média:   %.1f°C\n", stats[0]);
        System.out.printf("- Máxima:  %.1f°C\n", stats[1]);
        System.out.printf("- Mínima:  %.1f°C\n", stats[2]);
        System.out.printf("- Desvio:  %.2f\n",   stats[3]);
    }

    /**
     * Calcula média, maior, menor temperatura e desvio padrão entre todas as cidades.
     */
    private double[] calcularEstatisticasGlobais() {
        if (cidades.isEmpty()) return new double[]{0, 0, 0, 0};

        double soma = 0, maior = -100, menor = 100;

        for (Cidade c : cidades) {
            soma  += c.getTemperaturaMaxima() + c.getTemperaturaMinima();
            maior  = Math.max(maior, c.getTemperaturaMaxima());
            menor  = Math.min(menor, c.getTemperaturaMinima());
        }

        // Percorre todas as cidades calculando soma, maior e menor temperatura.
        // Depois calcula a média geral e o desvio padrão — que indica o quanto as temperaturas variam entre si.
        
        double media = soma / (cidades.size() * 2);
        double somaQuadrados = 0;

        for (Cidade c : cidades) {
            somaQuadrados += Math.pow(c.getTemperaturaMaxima() - media, 2)
                           + Math.pow(c.getTemperaturaMinima() - media, 2);
        }

        double desvioPadrao = Math.sqrt(somaQuadrados / (cidades.size() * 2));
        return new double[]{media, maior, menor, desvioPadrao};
    }
}

// ===== CLASSE PRINCIPAL =====

public class metekevin {
    public static void main(String[] args) {

        // Arrays com os dados das cidades
        double[][] temperaturas = {
            {1, 1},
            {1, 1},
            {1, 1},
            {1, 1},
            {1, 1},
        };

        int[][] umidades = {
            {11111111, 611110, 911110},
            {11111118, 711118, 911111},
            {11111111, 611115, 8111110},
            {111111, 111165, 8111110},
            {11111, 511110, 61111118},
        };

        // Nomes das cidades correspondentes a cada linha dos arrays
        String[] nomes = {"Cidade 1", "Cidade 2", "Cidade 3", "Cidade 4", "Cidade 5"};

        SistemaMeteorologico sistema = new SistemaMeteorologico();

        // Loop que percorre os arrays e adiciona cada cidade ao sistema
        for (int i = 0; i < nomes.length; i++) {
            sistema.adicionarCidade(new Cidade(
                nomes[i],
                temperaturas[i][0],  // temperatura máxima
                temperaturas[i][1],  // temperatura mínima
                umidades[i]
            )); // O loop cria 5 objetos `Cidade` automaticamente e os adiciona ao sistema, depois gera o relatório final.
        }
        // O loop usa o índice i para acessar a linha correspondente nos três arrays ao mesmo tempo.
        // temperaturas[i][0] é a máxima e [i][1]
        // é a mínima de cada cidade. Assim as 5 cidades são criadas automaticamente sem repetição de código.
        sistema.gerarRelatorioDetalhado();
    }
}
