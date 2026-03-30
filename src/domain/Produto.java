package domain;


import java.util.Scanner;

public class Produto {
    private String nome;
    private float preco;
    private int quantidade;

    Scanner scanner = new Scanner(System.in);

    public void cadastroProduto(){
        System.out.print("Digite o nome desse produto: ");
        setNome(scanner.next());//Só armazena um nome por causa do next();
        System.out.print("Digite o preço: ");
        setPreco(scanner.nextFloat());
        System.out.print("Digite a quantidade: ");
        setQuantidade(scanner.nextInt());
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
