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

        menu.imprimeMenu();
        int option = scanner.nextInt();
        char cadastrarOutro;

        do {
            switch (option) {
                case 1:
                    produto.cadastroProduto();
                    estoque.addProduto(produto);
            }
            System.out.println("Deseja adicionar outro produto ao estoque? [s/n]");
            cadastrarOutro = scanner.next().charAt(0);
        }while(cadastrarOutro.equals("s"));
        estoque.imprimeProdutos();
    }
}

