import java.util.Scanner;
import java.util.Random;

public class AdivinheNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int numeroSecreto = rand.nextInt(100) + 1;
        int tentativas = 0;
        int palpite = 0;

        System.out.println("Adivinhe o número (entre 1 e 100):");

        while (palpite != numeroSecreto) {
            System.out.print("Digite seu palpite: ");
            palpite = sc.nextInt();
            tentativas++;

            if (palpite > numeroSecreto) {
                System.out.println("Muito alto!");
            } else if (palpite < numeroSecreto) {
                System.out.println("Muito baixo!");
            } else {
                System.out.println("Parabéns! Você acertou em " + tentativas + " tentativas.");
            }
        }

        sc.close();
    }
}
