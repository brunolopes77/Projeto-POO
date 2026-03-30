package domain;

import java.util.Scanner;

public class Estoque {
    Scanner scanner = new Scanner(System.in);
    String[][] arrayProduto = new String[4][4];
    int count = 1;
    int aux = 1;
    String nome;
    float preco;
    int quantidade;

    public void addProduto(Produto produto) {
        nome = produto.getNome();
        arrayProduto[aux][1] = nome;

        preco = produto.getPreco();
        arrayProduto[aux][2] = String.valueOf(preco);

        quantidade = produto.getQuantidade();
        arrayProduto[aux][3] = String.valueOf(quantidade);

        aux++;
    }


    public void removeProduto() {
        int i;
        System.out.println("Qual produto deseja remover?");
        for (i = 1; i < 4; i++) {
            System.out.println(i + ". " + arrayProduto[i][1]);
        }
        System.out.print("(coloque a posição dele): ");
        i = scanner.nextInt();
        for (int j = 1; j < 4; j++) {
            arrayProduto[i][j] = "-------";
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





