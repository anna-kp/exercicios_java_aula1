import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class InverterFrase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();

        Deque<String> pilha = new ArrayDeque<>();
        for (String palavra : frase.split(" ")) {
            pilha.push(palavra);
        }

        System.out.print("Frase invertida: ");
        while (!pilha.isEmpty()) {
            System.out.print(pilha.pop() + " ");
        }

        sc.close();
    }
}
