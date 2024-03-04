# Aula 01 - 04/03

## O que é estrutura de dados?
É uma maneira de organizar, gerenciar e armazenar dados de forma que permita o **acesso e manipulação de maneira eficiente** desses dados, proporcionando um bom desempenho ao serem processados. </br> 
Também pode ser descrito como um **conjunto de formatos e regras** que define como os dados são organizados e como diferentes operações podem ser realizadas neles. </br>

## Qual sua importância?
São de grande importância, pois são projetadas para **otimizar o tempo** de excecução e o uso de memória para operações comuns, facilitando o desenvolvimento de softwares eficientes e robustos. Além disso, é importante para saber organizar os dados da maneira correta para fazer sentido para a aplicação em questão. 

## Explique e exemplifique as estruturas: array (estático e dinâmico), lista, fila e pilha.

## Array 
Array é uma estrutura que permite armanezar uma coleção de elementos do mesmo tipo sob um único nome. </br>
- Existem arrays **unidimensionais** (vetores) e **multidimensionais** (matrizes). 
Deve-se tomar cuidado com o espaço de armazenamento, já que o tamanho deve ser informado. </br>
Quando **pré-dinimos a quantidade máxima de registros**, criamos uma **array estática**. Quando **existe um método para aumentar a capacidade** dinamicamente, **array dinâmica**. </br>
Exemplo de utilização: lista de notas dos alunos da turma x, lista dos feriados brasileiros...

## Lista
List é uma **interface** que define um contrato para uma lista **ordenada** de elementos (cada um tem um índice associado). As classes mais comuns que implementam a interface List são:
- ArrayList: baseada em array (fornece a implementação de um vetor dinâmico)
- LinkedList - duplamente encadeada </br></br>

Os elementos são mantidos em uma ordem específica e é possível selecionar, remover e alterar registros através do índice. </br>
Alguns comandos são: size(), isEmpty(), contains(Object elemento), add(), remove(), etc... </br>
Exemplo de utilização: lista de compras, lista de gastos em um app financeiro </br>

OBS: a maneira correta de criar uma arraylist é: </br>
- List<<String>> nomes = new ArrayList<>(); </br>
- > Com isso, pode-se trocar a implementação subjacente para outras classes que também implementam List, sem alterar o restante do código, tornando o código mais flexível e fácil de manter.

## Fila
Também conhecido como **Queue**, segue o princípio FIFO (First-In-First-Out). O 1º elemento inserido será o 1º a ser removido. </br>
Queue em Java é uma **coleção** que não permite duplicatas e possui métodos específicos de FIFA, como: 
- add(E elemento), remove(), peek(), etc.. </br>
Exemplo de utilização: controle de documentos para impressão

## Pilha
Diferente da Fila, o padrão pilha segue o princípio LIFO (Last-In-First-Out), ou seja, o último elemento adicionado será o primeiro a ser removido. </br>
Principais operações da classe Stack:
- push: adiciona um elemento ao topo da pilha
- pop: remove e retorna o elemento no topo da pilha
- peek (ou top): retorna o elemento no topo da pilha sem removê-lo </br>

Exemplo de utilização: operação de desfazer ações, opção de voltar na navegação entre páginas web </br>