package domain;

public class Estoque {

    String[][] arrayProduto = new String[3][];
    int count = 0;
    int aux = 0;
    String nome;
    float preco;
    int quantidade;

    public void addProduto(Produto produto) {
        for (count = aux; count < aux + 1; count++) {
            for (int i = 0; i < 3; i++) {
                nome = produto.getNome();
                arrayProduto[count][i] = nome;
                i++;
                preco = produto.getPreco();
                arrayProduto[count][i] = String.valueOf(preco);
                i++;
                quantidade = produto.getQuantidade();
                arrayProduto[count][i] = String.valueOf(quantidade);
            }
        }
        aux++;
        count = aux;
    }

    public void imprimeProdutos() {
        for (int i = 0; i < 3; i++) {
           // for (int j = 0; j < 3; j++) {
                System.out.println(arrayProduto[i]);

        }
    }
}




