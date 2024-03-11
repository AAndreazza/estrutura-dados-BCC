/*
EXEMPLO:
Utilizando um ArrayList, crie um algoritmo com as seguintes funcionalidades:
Quantidade de segmentos: Exiba o nome e a quantidade de produtos em cada segmento.
*/

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        
        // Produtos
        Produto p1 = new Produto("Monitor 32", "Áudio e Vídeo");
        Produto p2 = new Produto("Notebook Dell", "Informática");
        Produto p3 = new Produto("iphone 15", "Telefonia");
        Produto p4 = new Produto("Galaxy S24", "Telefonia");

        // ArrayList contendo os produtos
        List<Produto> lista = new ArrayList<>();

        // Adicionar produtos
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);

        // ArrayList de segmentos
        List<Segmento> segmentos = new ArrayList<>();

        // Laço
        for (Produto l : lista) {
            
            // Nome do segmento atual
            String segmentoAtual = l.segmento;

            // Obter o índice do segmento encontrado
            int existeSegmento = -1;

            // Verificar se o segmento já existe
            for(int indice = 0; indice < segmentos.size(); indice++){
                if(segmentos.get(indice).nome.equals(segmentoAtual)){
                    existeSegmento = indice;
                    break;
                }
            }

            // Caso não exista o segmento
            if(existeSegmento == -1){
                Segmento s = new Segmento();
                s.nome = segmentoAtual;
                s.quantidade = 1;

                segmentos.add(s);
            }else{     
                Segmento s = segmentos.get(existeSegmento);
                s.nome = segmentoAtual;
                s.quantidade = s.quantidade + 1;

                segmentos.set(existeSegmento, s);
            }

        }


        // Listar os segmentos
        for (Segmento segmento : segmentos) {
            System.out.println(segmento.nome + " - " + segmento.quantidade);
        }
    }
}
