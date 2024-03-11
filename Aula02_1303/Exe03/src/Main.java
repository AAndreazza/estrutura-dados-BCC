/*Utilizando um ArrayList, crie um algoritmo com as seguintes funcionalidades:

Cadastrar (Deverá cadastrar o nome de um produto e o segmento, pode adicionar mais características, caso queira).
Selecionar todos os registros.
Quantidade de segmentos: Exiba o nome e a quantidade de produtos em cada segmento.
Alterar dados (Realize uma validação para garantir que será alterado).
Remoção (Realize uma validação para garantir que será removido).

Essa estrutura ficará em uma estrutura de repetição e poderão ser registradas inúmeras informações.
*/

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<Produto> listaProdutos = new ArrayList<>();

        int opcao = 0;
        while (opcao != 6) {
            System.out.println(
                    "Escolha uma opção: \n 1 - Cadastrar \n 2 - Listar todos os registros \n 3 - Listar quantidade de segmentos \n 4 - Alterar \n 5 - Remover \n 6 - Finalizar");
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
                listarQtdeSegmentos(listaProdutos);
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
        String nome = inputC.nextLine();
        System.out.println("Informe o segmento do produto: ");
        String segmento = inputC.nextLine();

        listaProdutos.add(new Produto(nome, segmento));
    }

    public static void listar(List<Produto> listaProdutos) {
        if (listaProdutos.isEmpty()) {
            System.out.println("Não há produtos cadastrados...");
        }
        for (Produto p : listaProdutos) {
            System.out.println(p.toString());
        }
    }

    public static void listarQtdeSegmentos(List<Produto> listaProdutos) {

        List<Segmento> listaSegmentos = new ArrayList<>();
        
        for (Produto p : listaProdutos) {
            String segmentoAtual = p.getSegmento();
            int indiceSegmento = -1;

            // Verificando se o segmento ja existe
            for(int i = 0; i < listaSegmentos.size(); i++){
                if(listaSegmentos.get(i).getNomeSegmento().equalsIgnoreCase(segmentoAtual)){
                    indiceSegmento = i;
                    break;
                }
            }

            // Caso o segmento não exista, criamos um
            if(indiceSegmento == -1){
                Segmento s = new Segmento(segmentoAtual, 1);

                listaSegmentos.add(s);
            }
            // Caso já exista, adicionamos +1 na quantidade
            else {
                Segmento s = listaSegmentos.get(indiceSegmento);
                s.setNomeSegmento(segmentoAtual);
                s.setQuantidade(s.getQuantidade() + 1);

                listaSegmentos.set(indiceSegmento, s);
            }
        }

        // Listando os segmentos e respectiva quantidade
        for (Segmento s : listaSegmentos) {
            System.out.println(s.toString());
        } 
    }

    public static void alterar(List<Produto> listaProdutos) {

        Scanner inputA = new Scanner(System.in);

        System.out.print("Informe o nome do produto que você deseja alterar: ");
        String nomeAntigo = inputA.nextLine();
        boolean encontrado = false;

    
        for (Produto p : listaProdutos) {
            if (p.getNome().equalsIgnoreCase(nomeAntigo)) {
                System.out.print("Informe o novo nome do produto: ");
                String nomeNovo = inputA.nextLine();
                System.out.print("Informe o novo segmento do produto: ");
                String segmentoNovo = inputA.nextLine();

                p.setNome(nomeNovo);
                p.setSegmento(segmentoNovo);

                encontrado = true;
                System.out.println("Produto alterado com sucesso!");
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


