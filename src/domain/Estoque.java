package domain;

import java.util.Scanner;

public class Estoque {
    Scanner scanner = new Scanner(System.in);
    String[][] arrayProduto = new String[3][3];
    int count = 0;
    int aux = 0;
    String nome;
    float preco;
    int quantidade;

    public void addProduto(Produto produto) {
        nome = produto.getNome();
        arrayProduto[aux][0] = nome;

        preco = produto.getPreco();
        arrayProduto[aux][1] = String.valueOf(preco);

        quantidade = produto.getQuantidade();
        arrayProduto[aux][2] = String.valueOf(quantidade);

        aux++;
    }


    public void removeProduto() {

        System.out.println("Qual produto deseja remover?");
        int count2 = 1;
        for (int i = 0; i < 3; i++) {
            System.out.println(count2 + ". " + arrayProduto[i][0]);
            count2++;
        }
        System.out.print("(coloque a posição dele): ");
        int i =  (scanner.nextInt() - 1);
        for (int j = 0; j < 3; j++) {
            arrayProduto[i][j] = "-------";
        }
    }

    public void imprimeProdutos() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(arrayProduto[i][j]);
            }
            System.out.println();
        }
    }
}





