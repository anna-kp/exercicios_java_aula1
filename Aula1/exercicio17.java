import java.util.TreeSet;

class Produto implements Comparable<Produto> {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public int compareTo(Produto outro) {
        return Double.compare(this.preco, outro.preco);
    }

    @Override
    public String toString() {
        return nome + " - R$" + preco;
    }
}

public class ProdutosOrdenados {
    public static void main(String[] args) {
        TreeSet<Produto> produtos = new TreeSet<>();
        produtos.add(new Produto("Notebook", 3500.0));
        produtos.add(new Produto("Mouse", 50.0));
        produtos.add(new Produto("Teclado", 120.0));
        produtos.add(new Produto("Monitor", 900.0));
        produtos.add(new Produto("Cadeira", 700.0));

        for (Produto p : produtos) {
            System.out.println(p);
        }
    }
}
