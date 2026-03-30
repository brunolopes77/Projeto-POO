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
        String outraAcao;
        do {
            menu.imprimeMenu();
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    produto.cadastroProduto();
                    estoque.addProduto(produto);
                    break;
                case 2:
                    estoque.removeProduto();
                    break;
                case 3:
                    estoque.imprimeProdutos();
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
            System.out.println("Deseja volta para o menu para fazer outra ação? [S/N]");
            outraAcao = scanner.next();
        }while(outraAcao.equalsIgnoreCase("S"));
    }
}
