package domain;

public class Estoque {

    Produto[] produtos = new Produto[3];
    int count = 0;
    int aux = 0;
    public void addProduto(Produto produto) {

        for (count = aux  ; count < aux + 1; count++) {
            produtos[count] = produto;

        }
        aux++;
        count = aux;
    }
    public void imprimeEstoque(){
        System.out.println(produtos[0].getQuantity());
        System.out.println(produtos[1].getQuantity());
        System.out.println(produtos[2].getQuantity());
    }


}
