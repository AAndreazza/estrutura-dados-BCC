# Atividade Avaliativa Remota - 18/03


## Explicação do uso da estrutura Fila
Eu decidi usar a **estrutura de dados em fila** (interface Queue) porque ela segue o princípio **FIFO** (First-In-First-Out), o que significa que o 1º elemento a ser inserido, será o 1º a ser removido, assim por diante. </br>

Pensando em um sistema de gerenciamento de tarefas, faz sentido que as tarefas sigam esse princípio, já que são concluídas (no caso, removidas da fila) na ordem em que foram cadastradas. </br>

A Fila fornece métodos diretos e eficazes que possibilitam a adição, remoção ou retorno do elemento de uma maneira fácil e ágil, como por exemplo: 'remove()', 'add()', 'peek()', etc. </br>

O último método apresentado acima ( 'peek()' ) retorna o 1º elemento da lista, sem removê-lo e sem precisar percorrer toda a lista de tarefas, o que mantém a eficiência do sistema. </br>

Um dos requisitos do sistema é a escabilidade, e a fila resolve o mesmo, já que é escalável conforme a adição de mais elementos nela. </br>

Usar Fila como estrutura de dados no sistema proposto atende os requisitos do sistema de gerenciamento de tarefas e cumpre com todas as operações necessárias de uma maneira organizada e eficiente, por isso ela foi a minha escolha de uso. 

## Descrição da atividade
Você foi contratado para desenvolver um **sistema de gerenciamento de tarefas** para uma equipe de desenvolvimento de software na linguagem Java. O sistema deve permitir que os membros da equipe adicionem tarefas, removam tarefas concluídas e visualizem as próximas tarefas a serem realizadas.

### O sistema deve ser capaz de lidar com as seguintes operações:
- Adicionar uma nova tarefa à lista.
- Concluir uma tarefa, removendo-a da lista.
- Visualizar a próxima tarefa a ser realizada.

### Requisitos adicionais:
- As tarefas devem ser armazenadas em uma estrutura de dados que permita a fácil adição e remoção de elementos.
- A visualização da próxima tarefa deve ser feita de forma eficiente, sem a necessidade de percorrer toda a lista de tarefas.
- O sistema deve ser escalável e capaz de lidar com um grande número de tarefas.

### Instruções:
- Projete e implemente o sistema de gerenciamento de tarefas usando uma das seguintes estruturas de dados: lista, fila ou pilha.
- Ao implementar a estrutura de dados escolhida, forneça uma explicação detalhada do motivo pelo qual você escolheu essa estrutura em particular (crie um README para isso).
- Teste o sistema com diferentes cenários para garantir que ele funcione conforme o esperado.

