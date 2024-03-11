/*Utilizando um Vector, crie um algoritmo com as seguintes funcionalidades:

Cadastrar (Não poderá haver registros iguais).
Selecionar todos os registros.
Realizar uma pesquisa através de um termo (Se o nome possui A, por exemplo).
Alterar dados (Realize uma validação para garantir que será alterado).
Remoção (Realize uma validação para garantir que será removido).

Essa estrutura ficará em uma estrutura de repetição e poderão ser registradas inúmeras informações.
*/

import java.util.Scanner;
import java.util.List;
import java.util.Vector;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<String> listaProdutos = new Vector<>();

        int opcao = 0;
        while (opcao != 6) {
            System.out.println(
                    "Escolha uma opção: \n 1 - Cadastrar \n 2 - Listar todos os produtos \n 3 - Pesquisar através de um termo \n 4 - Alterar \n 5 - Remover \n 6 - Finalizar");
            opcao = input.nextInt();

            while (opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4 && opcao != 5 && opcao != 6) {
                System.out.print("Opção inválida. Digite novamente: ");
                opcao = input.nextInt();
            }

            if (opcao == 1) {
                cadastrar(listaProdutos, input);
            } else if (opcao == 2) {
                listar(listaProdutos);
            } else if (opcao == 3) {
                pesquisar(listaProdutos, input);
            } else if (opcao == 4) {
                alterar(listaProdutos, input);
            } else if (opcao == 5) {
                remover(listaProdutos, input);
            }
        }
    }

    public static void cadastrar(List<String> listaProdutos, Scanner input) {

        System.out.println("Informe o nome do produto: ");
        String nome = input.next();

        listaProdutos.add(nome);
    }

    public static void listar(List<String> listaProdutos) {
        if (listaProdutos.isEmpty()) {
            System.out.println("Não há produtos cadastrados...");
        }
        for (String p : listaProdutos) {
            System.out.println(p.toString());
        }
    }

    public static void pesquisar(List<String> listaProdutos, Scanner input) {

        System.out.print("Digite o termo para pesquisar: ");
        String termo = input.next();
        boolean encontrado = false;

        for (String p : listaProdutos) {
            if (p.toUpperCase().contains(termo.toUpperCase())) {
                System.out.println("Produto encontrado!! \n" + p.toString());
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Produto não encontrado...");
        }
    }

    public static void alterar(List<String> listaProdutos, Scanner input) {

        System.out.print("Informe o nome do produto que você deseja alterar: ");
        String nomeAntigo = input.next();
        boolean encontrado = false;

        for (String p : listaProdutos) {
            if (p.equalsIgnoreCase(nomeAntigo)) {
                System.out.print("Informe o novo nome do produto: ");
                String nomeNovo = input.next();

                listaProdutos.set(listaProdutos.indexOf(p), nomeNovo);

                encontrado = true;
                System.out.println("Produto alterado com sucesso!");
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Produto não encontrado...");
        }
    }

    public static void remover(List<String> listaProdutos, Scanner input) {

        System.out.print("Insira o nome do elemento a remover: ");
        String nome = input.next();
        boolean encontrado = false;

        for (String p : listaProdutos) {
            if (p.equalsIgnoreCase(nome)) {
                listaProdutos.remove(p);
                System.out.println("Produto removido com sucesso!");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Produto não encontrado...");
        }
    }
}

