import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Produto {
    String nome;
    double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return nome + " - R$" + preco;
    }
}

public class CatalogoProdutos {
    public static void main(String[] args) {
        Map<String, List<Produto>> catalogo = new HashMap<>();

        List<Produto> eletronicos = new ArrayList<>();
        eletronicos.add(new Produto("Notebook", 3500));
        eletronicos.add(new Produto("Smartphone", 2000));

        List<Produto> livros = new ArrayList<>();
        livros.add(new Produto("Java Básico", 120));
        livros.add(new Produto("Python Avançado", 150));

        catalogo.put("Eletrônicos", eletronicos);
        catalogo.put("Livros", livros);

        String categoria = "Eletrônicos";
        System.out.println("Produtos da categoria " + categoria + ":");
        for (Produto p : catalogo.get(categoria)) {
            System.out.println(p);
        }
    }
}
