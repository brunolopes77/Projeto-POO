package domain;


import java.util.Scanner;

public class Product {
    private String name;
    private float price;
    private int quantity;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    Scanner scanner = new Scanner(System.in);

    public void registrationProduct(){
        System.out.print("Digite o nome desse produto: ");
        setName(scanner.nextLine());
        System.out.print("Digite o preço: ");
        setPrice(scanner.nextFloat());
        System.out.print("Digite a quantidade: ");
        setQuantity(scanner.nextInt());
    }


}
