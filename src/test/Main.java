package test;

import domain.Inventory;
import domain.MenuOptions;
import domain.Product;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product product = new Product();
        MenuOptions menuOptions = new MenuOptions();
        Inventory inventory = new Inventory();

        menuOptions.printMenu();
        int option = scanner.nextInt();

        switch (option){
            case 1:
                product.registrationProduct();
                inventory.addInventory(product);
                break;
        }



    }
}
