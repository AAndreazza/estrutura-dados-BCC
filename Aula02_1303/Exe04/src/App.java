/*Utilizando LinkedList, implemente uma estrutura de nós. Haverá um laço de repetição com as funcionalidades:

Cadastrar (cadastre um nome);
Listar (liste todos os nomes informados);
Finalizar (encerra o laço).
*/

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<String> lista = new LinkedList<>();

        int opcao = 0;
        while (opcao != 3) {
            System.out.println(
                    "Escolha uma opção: \n 1 - Cadastrar \n 2 - Listar todos os registros \n 3 - Finalizar");
            opcao = input.nextInt();

            while (opcao != 1 && opcao != 2 && opcao != 3) {
                System.out.print("Opção inválida. Digite novamente: ");
                opcao = input.nextInt();
            }

            if (opcao == 1) {
                cadastrar(lista, input);
            } else if (opcao == 2) {
                listar(lista);
            }
        }
    }

    public static void cadastrar(List<String> lista, Scanner input) {

        System.out.println("Informe o nome: ");
        String nome = input.next();

        lista.add(nome);
    }

    public static void listar(List<String> lista) {
        if (lista.isEmpty()) {
            System.out.println("Não há produtos cadastrados...");
        }
        for (String l : lista) {
            System.out.println(l);
        }
    }
}



