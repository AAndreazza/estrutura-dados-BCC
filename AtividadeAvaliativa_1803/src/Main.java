/**
 * @author Alana C. Andreazza
 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        Queue<String> filaTarefas = new LinkedList<>();

        int opcao = 0;
        while (opcao != 4) {
            System.out.println(
                    "Escolha uma opção: \n 1 - Cadastrar tarefa \n 2 - Concluir tarefa \n 3 - Visualizar a próxima tarefa \n 4 - Finalizar");
            opcao = input.nextInt();

            while (opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4) {
                System.out.print("Opção inválida. Digite novamente: ");
                opcao = input.nextInt();
            }

            if (opcao == 1) {
                cadastrar(filaTarefas);
            } else if (opcao == 2) {
                concluir(filaTarefas);
            } else if (opcao == 3) {
                visualizar(filaTarefas);
            }
        }
    }

    public static void cadastrar(Queue<String> filaTarefas) {
        Scanner inputCadastro = new Scanner(System.in);

        System.out.println("Informe a tarefa a ser cadastrada: ");
        String tarefa = inputCadastro.nextLine();

        filaTarefas.add(tarefa);
        System.out.println("Tarefa cadastrada com sucesso!");
    }

    public static void concluir(Queue<String> filaTarefas) {
        Scanner inputConcluir = new Scanner(System.in);

        if (filaTarefas.isEmpty()) {
            System.out.println("Não há tarefas cadastradas...");
        } else {
            System.out.println("Você concluiu a tarefa: " + filaTarefas.peek() + " ? [S/N]");
            String resposta = inputConcluir.next();

            while (!resposta.equalsIgnoreCase("S") && !resposta.equalsIgnoreCase("N")) {
                System.out.print("Digite 'S' se você concluiu a tarefa ou 'N' caso ainda não esteja concluída: ");
                resposta = inputConcluir.next();
            }

            if (resposta.equalsIgnoreCase("S")) {
                filaTarefas.remove();
                System.out.println("Tarefa concluída com sucesso!");
            } else if (resposta.equalsIgnoreCase("N")) {
                System.out.println("Tarefa não concluída...");
            }
        }

    }

    public static void visualizar(Queue<String> filaTarefas) {
        if (filaTarefas.isEmpty()) {
            System.out.println("Não há tarefas cadastradas...");
        } else {
            System.out.println("A próxima tarefa a ser realizada é: " + filaTarefas.peek());
        }
    }

}
