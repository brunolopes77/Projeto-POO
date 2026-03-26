package domain;

public class Estoque {

    String[] arrayNome = new String[3];
    int count = 0;
    int aux = 0;
    String nome;

    public void addProduto(Produto produto) {
        for (count = aux; count < aux + 1; count++) {
            nome = produto.getNome();
            arrayNome[count] = nome;
        }
        aux++;
        count = aux;
    }
    public void imprimeNome(){
        for (int i = 0; i < 3; i++) {
            System.out.println(arrayNome[i]);
        }
    }

}


