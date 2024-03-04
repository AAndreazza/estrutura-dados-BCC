/*Utilizando um array estático de dez posições, desenvolva um algoritmo com as seguintes funcionalidades:
Cadastrar; Listar todos os nomes; Alterar; Remover; Finalizar.
Essa estrutura ficará em um laço de repetição.
*/
import java.util.Scanner;

public class Exe02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] arrayNomes = new String[10];

        int opcao = 0;
        while (opcao != 5) {
            System.out.println(
                    "Escolha uma opção: \n 1 - Cadastrar \n 2 - Listar todos os nomes \n 3 - Alterar \n 4 - Remover \n 5 - Finalizar");
            opcao = input.nextInt();

            while (opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4 && opcao != 5) {
                System.out.print("Opção inválida. Digite novamente: ");
                opcao = input.nextInt();
            }

            if (opcao == 1) {
                cadastrar(arrayNomes);
            } else if (opcao == 2) {
                listar(arrayNomes);
            } else if (opcao == 3) {
                alterar(arrayNomes);
            } else if (opcao == 4) {
                remover(arrayNomes);
            }
        }
    }

    public static void cadastrar(String[] arrayNomes) {
        Scanner inputC = new Scanner(System.in);
        System.out.println("Informe o nome para cadastrar: ");
        String nome = inputC.next();

        int index = 0;
        for (int i = 0; i < arrayNomes.length; i++) {
            if (arrayNomes[i] != null) {
                index++;
            }
        }
        if (index <= 9) {
            arrayNomes[index] = nome;
        } else {
            System.out.println("Não há mais espaço no vetor para cadastrar...");
        }
    }

    public static void listar(String[] arrayNomes) {
        for (int i = 0; i < arrayNomes.length; i++) {
            System.out.println("[" + i + "] = " + arrayNomes[i]);
        }
    }

    public static void alterar(String[] arrayNomes) {
        Scanner inputA = new Scanner(System.in);
        System.out.print("Informe o index do produto que você deseja alterar: ");
        int index = inputA.nextInt();
        if (index >= 0 && index <= 9) {
            System.out.print("Digite o novo nome para alterar: ");
            String nome = inputA.next();
            arrayNomes[index] = nome;
        } else {
            System.out.println("Não foi possível acessar o index informado...");
        }
    }

    public static void remover(String[] arrayNomes) {
        Scanner inputR = new Scanner(System.in);
        System.out.println("Insira o index do elemento a remover: ");
        int index = inputR.nextInt();
        if (index >= 0 && index <= 9) {
            arrayNomes[index] = null;
        } else {
            System.out.println("Não foi possível acessar o index informado...");
        }
    }
}
