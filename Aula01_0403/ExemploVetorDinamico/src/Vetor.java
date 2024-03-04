public class Vetor {

    // Vetor
    int[] numeros;

    // Construtor
    public Vetor() {
        // Inicializa o vetor com tamanho 0
        this.numeros = new int[0];
    }

    // Método para cadastro
    public void cadastrar(int num) {
        // Incrementa o tamanho
        int tamanho = this.numeros.length;
        tamanho += 1;

        // Cria um vetor temporário com o novo tamanho
        int[] vetorTemp = new int[tamanho];

        // Copia os elementos do vetor original para o vetor temporário
        for (int i = 0; i < this.numeros.length; i++) {
            vetorTemp[i] = this.numeros[i];
        }

        // Cadastrar o número no vetor temporário
        vetorTemp[tamanho - 1] = num;

        // Atribuir o vetor temporário ao vetor de números
        this.numeros = vetorTemp;

        // Exibir os registros contidos no vetor
        for (int n : numeros) {
            System.out.println(n);
        }
    }

}