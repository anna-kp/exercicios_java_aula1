package item;
import java.time.LocalDate;

public abstract class Item {
    protected String nome;
    protected double preco;
    protected double peso;
    protected LocalDate validade;

    public Item(String nome, double preco, double peso, LocalDate validade){
        this.nome = nome;
        this.preco = preco;
        this.peso = peso;
        this.validade = validade;
    }

    public double getPreco(){return preco;}
    public String getNome(){return nome;}

    public abstract String descricao();
}
