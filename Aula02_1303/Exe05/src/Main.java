/*Tema livre, utilizando HashMap. Além das funcionalidades padrões de um CRUD:

Cadastro, Seleção, Alteração e Exclusão.

Implemente uma opção de estatísticas, retornando alguns contadores, exemplo:
30 alunos registros
20 aprovados
10 reprovados */

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Map<Integer, Aluno> lista = new HashMap<>();

        int opcao = 0;
        while (opcao != 7) {
            System.out.println(
                    "Escolha uma opção: \n 1 - Cadastrar \n 2 - Listar todos os alunos \n 3 - Selecionar aluno \n 4 - Alterar \n 5 - Remover \n 6 - Verificar estatística \n 7 - Finalizar");
            opcao = input.nextInt();

            while (opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4 && opcao != 5 && opcao != 6 && opcao != 7) {
                System.out.print("Opção inválida. Digite novamente: ");
                opcao = input.nextInt();
            }

            if (opcao == 1) {
                cadastrar(lista);
            } else if (opcao == 2) {
                listar(lista);
            } else if (opcao == 3) {
                selecionarAluno(lista);
            } else if (opcao == 4) {
                alterar(lista);
            } else if (opcao == 5) {
                remover(lista);
            } else if (opcao == 6){
                verificarEstatistica(lista);
            }
        }
    }

    public static void cadastrar(Map<Integer, Aluno> lista) {

        Scanner inputC = new Scanner(System.in);

        System.out.println("Informe o id do aluno: ");
        Integer id = inputC.nextInt();
        System.out.println("Informe o nome do aluno: ");
        String nome = inputC.next();

        System.out.println("Informe a 1ª nota do aluno: ");
        Float nota1 = inputC.nextFloat();
        while (nota1 < 0 || nota1 > 10) {
            System.out.println("Nota inválida! A nota deve estar entre 0 e 10.");
            System.out.println("Informe a 1ª nota do aluno novamente: ");
            nota1 = inputC.nextFloat();
        }

        System.out.println("Informe a 2ª nota do aluno: ");
        Float nota2 = inputC.nextFloat();
        while (nota2 < 0 || nota2 > 10) {
            System.out.println("Nota inválida! A nota deve estar entre 0 e 10.");
            System.out.println("Informe a 2ª nota do aluno novamente: ");
            nota2 = inputC.nextFloat();
        }
        System.out.println("Informe a 3ª nota do aluno: ");
        Float nota3 = inputC.nextFloat();
        while (nota3 < 0 || nota3 > 10) {
            System.out.println("Nota inválida! A nota deve estar entre 0 e 10.");
            System.out.println("Informe a 3ª nota do aluno novamente: ");
            nota3 = inputC.nextFloat();
        }

        lista.put(id, new Aluno(nome, nota1, nota2, nota3));
    }

    public static void listar(Map<Integer, Aluno> lista) {
        if (lista.isEmpty()) {
            System.out.println("Não há produtos cadastrados...");
        }
        for (Integer a : lista.keySet()) {
            System.out.println(a + " - " + lista.get(a));
        }
    }

    public static void selecionarAluno(Map<Integer, Aluno> lista) {
        Scanner inputS = new Scanner(System.in);

        System.out.println("Informe o id do aluno: ");
        Integer id = inputS.nextInt();

        if(lista.containsKey(id)){
            System.out.println(id + " - " + lista.get(id));
        }
        else {
            System.out.println("Aluno não encontrado...");
        }
    }

    public static void alterar(Map<Integer, Aluno> lista) {

        Scanner inputA = new Scanner(System.in);

        System.out.println("Informe o id do aluno: ");
        Integer id = inputA.nextInt();

        boolean encontrado = false;
    
        for (Integer a : lista.keySet()) {
            if (a == id) {
                System.out.println("Pronto para alterar!!");
                System.out.println("Informe o nome do aluno: ");
                String nome = inputA.next();

                System.out.println("Informe a 1ª nota do aluno: ");
                Float nota1 = inputA.nextFloat();
                while (nota1 < 0 || nota1 > 10) {
                    System.out.println("Nota inválida! A nota deve estar entre 0 e 10.");
                    System.out.println("Informe a 1ª nota do aluno novamente: ");
                    nota1 = inputA.nextFloat();
                }

                System.out.println("Informe a 2ª nota do aluno: ");
                Float nota2 = inputA.nextFloat();
                while (nota2 < 0 || nota2 > 10) {
                    System.out.println("Nota inválida! A nota deve estar entre 0 e 10.");
                    System.out.println("Informe a 2ª nota do aluno novamente: ");
                    nota2 = inputA.nextFloat();
                }

                System.out.println("Informe a 3ª nota do aluno: ");
                Float nota3 = inputA.nextFloat();
                while (nota3 < 0 || nota3 > 10) {
                    System.out.println("Nota inválida! A nota deve estar entre 0 e 10.");
                    System.out.println("Informe a 3ª nota do aluno novamente: ");
                    nota3 = inputA.nextFloat();
                }

                encontrado = true;

                lista.put(id, new Aluno(nome, nota1, nota2, nota3));
                System.out.println("Dados do aluno alterados com sucesso!");
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Aluno não encontrado...");
        }
    }

    public static void remover(Map<Integer, Aluno> lista) {
        Scanner inputR = new Scanner(System.in);

        System.out.println("Informe o id do aluno: ");
        Integer id = inputR.nextInt();
        boolean encontrado = false;

        for (Integer a : lista.keySet()) {
            if (a == id) {
                lista.remove(a);
                System.out.println("Aluno removido com sucesso!");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Aluno não encontrado...");
        }
    }

    public static void verificarEstatistica(Map<Integer, Aluno> lista) {
        int qtdeAlunos = lista.size();
        int qtdeReprovados = 0;
        int qtdeAprovados = 0;

        for (Aluno a : lista.values()) {
            float media = (a.getNota1() + a.getNota2() + a.getNota3()) / 3;
            if(media >= 6){
                qtdeAprovados++;
            }
            else {
                qtdeReprovados++;
            }
        }

        System.out.println(qtdeAlunos + " aluno(s) registrados \n" + qtdeAprovados + " aluno(s) aprovados \n" + qtdeReprovados + " aluno(s) reprovados");
        
    }
}


