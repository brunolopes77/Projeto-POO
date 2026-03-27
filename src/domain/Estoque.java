package domain;

public class Estoque {

    String[][] arrayProduto = new String[4][4];
    int count = 1;
    int aux = 1;
    String nome;
    float preco;
    int quantidade;

    public void addProduto(Produto produto) {
        for (count = aux; count < aux + 1; count++) {
            for (int i = 1; i < 4; i++) {
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

    public void removeProduto(){
        System.out.println("Qual produto deseja remover?");
        for (int i = 1; i < 4; i++) {
            System.out.println(i+". "+arrayProduto[i][1]);
        }
    }

    public void imprimeProdutos() {
        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 4; j++) {
                System.out.println(arrayProduto[i][j]);
            }
            System.out.println();
        }
    }
}




