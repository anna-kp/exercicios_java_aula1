import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class PilhaLivros {
    public static void main(String[] args) {
        Deque<String> pilha = new ArrayDeque<>();
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            System.out.print("Digite o nome do livro " + i + ": ");
            String livro = sc.nextLine();
            pilha.push(livro);
        }

        String removido = pilha.pop();
        System.out.println("Livro removido: " + removido);

        String topo = pilha.peek();
        System.out.println("Livro no topo: " + topo);

        sc.close();
    }
}
