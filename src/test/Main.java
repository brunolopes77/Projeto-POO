package test;

import domain.Estoque;
import domain.Menu;
import domain.Produto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Produto produto = new Produto();
        Menu menu = new Menu();
        Estoque estoque = new Estoque();

        for (int i = 0; i < 2; i++) {
            menu.imprimeMenu();
            int option = scanner.nextInt();

            for (int j = 0; j < 3; j++) {
                switch (option) {
                    case 1:
                        produto.cadastroProduto();
                        estoque.addProduto(produto);
                        break;
                    case 2:
                        estoque.removeProduto();
                }
                break;
            }
        }
        //estoque.imprimeProdutos();
    }
}
