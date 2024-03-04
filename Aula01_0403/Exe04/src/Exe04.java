/*Escolha uma das opções de estrutura de dados: Array, Fila, Lista ou Pilha.
Desenvolva um sistema para atendimento (ficará em uma estrutura de repetição), este projeto terá as seguintes funcionalidades:

Cadastrar atendimento (informe o nome da pessoa).
Remover (deverá remover em ordem de chegada).
Finalizar (encerrar o sistema).

No cabeçalho do projeto, utilizando comentários, explique o motivo de ter utilizado determinada estrutura de dado.
*/

/*Eu decidi utilizar a estrutura de dados em fila porque ela segue o princípio FIFO - First-In-First-Out, e é justamente 
isso que o sistema deve fazer, removendo sempre a primeira "pessoa" da fila, pois foi a primeira a chegar e por 
ser um atendimento, faz sentido ser dessa forma. */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exe04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Queue<String> filaNomes = new LinkedList<>(); 

        int opcao = 0;
        while (opcao != 3) {
            System.out.println(
                    "Escolha uma opção: \n 1 - Cadastrar \n 2 - Remover \n 3 - Finalizar");
            opcao = input.nextInt();

            while (opcao != 1 && opcao != 2 && opcao != 3) {
                System.out.print("Opção inválida. Digite novamente: ");
                opcao = input.nextInt();
            }

            if (opcao == 1) {
                cadastrar(filaNomes);
            } else if (opcao == 2) {
                remover(filaNomes);
            }
        }
    }

    public static void cadastrar(Queue<String> filaNomes) {
        Scanner inputC = new Scanner(System.in);

        System.out.println("Informe o nome: ");
        String nome = inputC.next();

        filaNomes.add(nome);
        System.out.println("Atendimento cadastrado com sucesso!");
    }

    public static void remover(Queue<String> filaNomes) {
        filaNomes.remove();
    }
}
