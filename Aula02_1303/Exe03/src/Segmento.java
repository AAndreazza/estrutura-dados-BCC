public class Segmento {
    private String nomeSegmento;
    private int quantidade;

    public Segmento(String nomeSegmento, int quantidade) {
        this.nomeSegmento = nomeSegmento;
        this.quantidade = quantidade;
    }

    public String getNomeSegmento() {
        return nomeSegmento;
    }
    public void setNomeSegmento(String nomeSegmento) {
        this.nomeSegmento = nomeSegmento;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String toString(){
        return "Segmento: " + getNomeSegmento() + " | Quantidade: " + getQuantidade();
    }
}
