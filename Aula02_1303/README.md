# Aula 02 - 11/03

## Vector
O Vector foi introduzido em Java na 1ª versão, não sendo mais utilizando atualmente já que existem opções melhores. <br/><br/>
É uma estrutura que trabalha como um vetor / array, implementando uma lista de objetos que cresce ou diminui de tamanho dinamicamente, podendo manipular as informações através do índice.  <br/><br/>
Quando a lista está cheia, o tamanho aé aumentado em 100%, ou seja, se você tem uma lista de 10 elementos cheia, essa lista aumentará para 20, com 10 posições vazias. <br/><br/>
Vector é sincronizado, ou seja, os dados são armanzenados na ordem que foram criados/adicionados. <br/><br/>
O Vector pode ser usado quando não se tem previsão sobre o crescimento da lista, como em uma lista de compras, que pode adicionar ou remover elementos conforme necessidade. 

## ArrayList
O ArrayList possui as mesmas características e até mesmo alguns métodos iguais do Vector, mas é mais perfomática do que ele. <br/><br/><br/><br/>
A alocação do ArrayList é diferente do Vector, aumentando em 50% do tamanho quando a lista está cheia. <br/><br/>
Se o array não for grande o suficiente, um novo array maior será criado para substituir o antigo e o antigo será removido. <br/><br/>
Não é sincronizado... <br/><br/>
Como exemplo de utilização, pode-se usar a lista de compras também, já que não se sabe o tamanho da lista. 

## LinkedList
A estrutura do LinkedList garante mais segurança no encadeamento de dados, sendo mais perfomático que o ArrayList para alterar os registros, mas mais lento para fazer cadasreo, excluções e seleções.. <br/><br/>
Este tipo de lista implementa uma “double linked list”, ou seja, uma lista duplamente "linkada" / "encadeada"<br/><br/>
A lista possui um link para o 1º container (local os itens são armazenados) e cada contêiner possui um link para o próximo contêiner da lista e o anterior também (nesse último caso, o primeiro container indica o último como sendo o anterior). <br/><br/>
Pode ser usado para a criação de uma lista de marca de carros, por exemplo.

## HashMap
Diferente das estruturas explicadas anteriormente, o HashMap não implementa a interface List, mas sim a interface Map. <br/><br/>
É uma estrutura que armazena pares de chave-valor, sendo que cada chave deve ser única, ou seja, não pode ser duplicada. <br/><br/>
O HashMap trabalha com informações vindas de classes, como: HashMap<<Integer, Usuario>> usuarios = new HashMap<>(); <br/><br/>
Para grandes estrutura de dados, é mais perfomático que LinkedList ou ArrayList. <br/><br/>
Além disso, faz o redimensionamento de dados automaticamente. Quando executado, o HashMap retorna um valor de performance entre 0 e 1, e se o registro retornar qualquer valor acima de 0.75, o HashMap realizará melhorias na estrutura para garantir mais velocidade. <br/><br/>
Pode ser usado para para armezenar os livros de uma biblioteca, sendo chave, o código do livro, e valor o nome do mesmo.

#### Site complementar sobre performace
<https://www.devmedia.com.br/diferenca-entre-arraylist-vector-e-linkedlist-em-java/29162>