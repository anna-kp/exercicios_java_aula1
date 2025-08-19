import java.util.ArrayList;
import java.util.Scanner;

public class ListaTarefas {
    public static void main(String[] args) {
        ArrayList<String> tarefas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("1 - Adicionar tarefa");
            System.out.println("2 - Remover tarefa");
            System.out.println("3 - Listar tarefas");
            System.out.println("0 - Sair");
            opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 1) {
                System.out.print("Digite a tarefa: ");
                String tarefa = sc.nextLine();
                tarefas.add(tarefa);
            } else if (opcao == 2) {
                System.out.print("Digite o índice da tarefa: ");
                int indice = sc.nextInt();
                if (indice >= 0 && indice < tarefas.size()) {
                    tarefas.remove(indice);
                }
            } else if (opcao == 3) {
                System.out.println("Tarefas:");
                for (int i = 0; i < tarefas.size(); i++) {
                    System.out.println(i + " - " + tarefas.get(i));
                }
            }
        } while (opcao != 0);

        sc.close();
    }
}
