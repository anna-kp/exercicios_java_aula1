import java.util.HashMap;
import java.util.Scanner;

public class Agenda {
    public static void main(String[] args) {
        HashMap<String, String> agenda = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("1 - Adicionar contato");
            System.out.println("2 - Buscar telefone");
            System.out.println("3 - Listar contatos");
            System.out.println("0 - Sair");
            opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 1) {
                System.out.print("Nome: ");
                String nome = sc.nextLine();
                System.out.print("Telefone: ");
                String tel = sc.nextLine();
                agenda.put(nome, tel);
            } else if (opcao == 2) {
                System.out.print("Nome: ");
                String nome = sc.nextLine();
                if (agenda.containsKey(nome)) {
                    System.out.println("Telefone: " + agenda.get(nome));
                } else {
                    System.out.println("Contato não encontrado");
                }
            } else if (opcao == 3) {
                for (String nome : agenda.keySet()) {
                    System.out.println(nome + " - " + agenda.get(nome));
                }
            }
        } while (opcao != 0);

        sc.close();
    }
}
