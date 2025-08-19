import java.util.LinkedHashMap;

public class Produtos {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> produtos = new LinkedHashMap<>();
        produtos.put(101, "Arroz");
        produtos.put(102, "Feijão");
        produtos.put(103, "Macarrão");
        produtos.put(104, "Leite");
        produtos.put(105, "Café");

        for (Integer codigo : produtos.keySet()) {
            System.out.println(codigo + " - " + produtos.get(codigo));
        }
    }
}
