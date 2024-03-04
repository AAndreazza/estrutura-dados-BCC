/*Utilizando um array dinâmico, desenvolva um algoritmo para gerenciar produtos, contendo as seguintes funcionalidades:
Cadastro: Informar nome do produto e valor.
Listagem: Listar todos os produtos (nome e valor).
Pesquisa: Será pedido um termo, localize os produtos que contenham aquele termo no seu nome.
Alterar: Será pedido o nome do produto que será alterado. Informe um novo nome e o valor.
Remover: Através do nome do produto, realize a exclusão.
Finalizar: Encerra o sistema.
*/

package Exe03.src;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<Produto> listaProdutos = new ArrayList<>();

        int opcao = 0;
        while (opcao != 6) {
            System.out.println(
                    "Escolha uma opção: \n 1 - Cadastrar \n 2 - Listar todos os produtos \n 3 - Pesquisa \n 4 - Alterar \n 5 - Remover \n 6 - Finalizar");
            opcao = input.nextInt();

            while (opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4 && opcao != 5 && opcao != 6) {
                System.out.print("Opção inválida. Digite novamente: ");
                opcao = input.nextInt();
            }

            if (opcao == 1) {
                cadastrar(listaProdutos);
            } else if (opcao == 2) {
                listar(listaProdutos);
            } else if (opcao == 3) {
                pesquisar(listaProdutos);
            } else if (opcao == 4) {
                alterar(listaProdutos);
            } else if (opcao == 5) {
                remover(listaProdutos);
            }
        }
    }

    public static void cadastrar(List<Produto> listaProdutos) {
        Scanner inputC = new Scanner(System.in);

        System.out.println("Informe o nome do produto: ");
        String nome = inputC.next();
        System.out.println("Informe o valor do produto: ");
        double valor = inputC.nextDouble();

        listaProdutos.add(new Produto(nome, valor));
    }

    public static void listar(List<Produto> listaProdutos) {
        if (listaProdutos.isEmpty()) {
            System.out.println("Não há produtos cadastrados...");
        }
        for (Produto p : listaProdutos) {
            System.out.println(p.toString());
        }
    }

    public static void pesquisar(List<Produto> listaProdutos) {
        Scanner inputP = new Scanner(System.in);

        System.out.print("Digite o termo para pesquisar: ");
        String termo = inputP.next();
        boolean encontrado = false;

        for (Produto p : listaProdutos) {
            if (p.getNome().toUpperCase().contains(termo.toUpperCase())) {
                System.out.println("Produto encontrado!! \n" + p.toString());
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Produto não encontrado...");
        }
    }

    public static void alterar(List<Produto> listaProdutos) {
        Scanner inputA = new Scanner(System.in);

        System.out.print("Informe o nome do produto que você deseja alterar: ");
        String nomeAntigo = inputA.next();
        boolean encontrado = false;

        for (Produto p : listaProdutos) {
            if (p.getNome().equalsIgnoreCase(nomeAntigo)) {
                System.out.print("Informe o novo nome do produto: ");
                String nomeNovo = inputA.next();
                System.out.print("Informe o novo valor do produto: ");
                double valorNovo = inputA.nextDouble();

                p.setNome(nomeNovo);
                p.setValor(valorNovo);

                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Produto não encontrado...");
        }
    }

    public static void remover(List<Produto> listaProdutos) {
        Scanner inputR = new Scanner(System.in);

        System.out.print("Insira o nome do elemento a remover: ");
        String nome = inputR.next();
        boolean encontrado = false;

        for (Produto p : listaProdutos) {
            if (p.getNome().equalsIgnoreCase(nome)) {
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
