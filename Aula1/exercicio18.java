import java.util.HashMap;
import java.util.Scanner;

public class Dicionario {
    public static void main(String[] args) {
        HashMap<String, String> dic = new HashMap<>();
        dic.put("casa", "house");
        dic.put("gato", "cat");
        dic.put("cachorro", "dog");
        dic.put("livro", "book");
        dic.put("carro", "car");

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma palavra em português: ");
        String palavra = sc.nextLine();

        if (dic.containsKey(palavra)) {
            System.out.println("Tradução: " + dic.get(palavra));
        } else {
            System.out.println("Palavra não encontrada");
        }

        sc.close();
    }
}
