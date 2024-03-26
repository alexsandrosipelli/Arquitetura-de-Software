package exercicio3Strategy.cliente;

import exercicio3Strategy.modelo.DadosOrdenacao;
import exercicio3Strategy.SortEstrategy;
import java.util.InputMismatchException;
import java.util.Scanner;

/*aqui o cliente comparado com o exemplo do professor seria a classe Cliente*/
public class Cliente {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int escolha = 0;

        while (escolha < 1 || escolha > 3) {
            try {

                System.out.println("Escolha o algoritmo de ordenação:");
                System.out.println("1 - Insertion Sort");
                System.out.println("2 - Selection Sort");
                System.out.println("3 - Bubble Sort");
                escolha = sc.nextInt();
                /*aqui tratando para que nao seja possivel digitar algo que nao queremos*/
                if (escolha < 1 || escolha > 3) {
                    System.out.println("Opção inválida. Escolha um número entre 1 e 3.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Opção inválida. Digite um número inteiro.");
                sc.next(); // Limpar o buffer do scanner para evitar loop infinito
            }
        }
        /*criando a intancia da classe enum que contem os metodos de odernaçao
            que estao implementando a interface Estrategia e mudando os metodos de acordo com cada tipo de ordenaçao*/
 /*.values(): É um método de enum que retorna um array contendo todos os valores do enum. */
 /*Portanto nessa linha esta sendo criado a instancia e ja esta sendo passado qual a constante da classe enum que vai ser usada*/
        SortEstrategy estrategia = SortEstrategy.values()[escolha - 1];
        /*criando um vetor, em seguida passando esse vetor para o modelo*/
        int[] vetor = {5, 3, 8, 1, 2, 7, 4, 6}; // Vetor de exemplo
        DadosOrdenacao dados = new DadosOrdenacao(vetor);

        System.out.println("Vetor original:");
        imprimirVetor(dados.getDados());
        /*aqui a estrategia de acordo com a qual o usuario escolheu irá ordenar o vetor*/
        estrategia.ordenar(dados.getDados());

        System.out.println("Vetor ordenado:");
        imprimirVetor(dados.getDados());
    }

    /* Método para imprimir o vetor */
    private static void imprimirVetor(int[] vetor) {
        for (int num : vetor) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
