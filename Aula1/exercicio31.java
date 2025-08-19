import java.lang.reflect.Field;
import java.lang.reflect.Method;

class AnalisadorDeClasse {
    public static void inspecionar(Object obj) {
        Class<?> classe = obj.getClass();
        System.out.println("Classe: " + classe.getName());

        Field[] campos = classe.getDeclaredFields();
        System.out.println("Atributos:");
        for (Field f : campos) {
            System.out.println(" - " + f.getName());
        }

        Method[] metodos = classe.getDeclaredMethods();
        System.out.println("Métodos:");
        for (Method m : metodos) {
            System.out.println(" - " + m.getName());
        }
    }
}

class Produto {
    private int codigo;
    public String nome;
    protected double preco;

    public Produto(int codigo, String nome, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }

    private double calcularImposto() {
        return preco * 0.1;
    }
}

public class Main {
    public static void main(String[] args) {
        Produto p = new Produto(101, "Notebook Gamer", 8500.0);
        AnalisadorDeClasse.inspecionar(p);
    }
}
