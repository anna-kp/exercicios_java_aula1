import java.util.ArrayList;
import java.util.Scanner;

public class BuscaCidade {
    public static void main(String[] args) {
        ArrayList<String> cidades = new ArrayList<>();
        cidades.add("São Paulo");
        cidades.add("Rio de Janeiro");
        cidades.add("Belo Horizonte");
        cidades.add("Curitiba");
        cidades.add("Porto Alegre");

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome de uma cidade: ");
        String cidade = sc.nextLine();

        if (cidades.contains(cidade)) {
            System.out.println("Cidade encontrada no índice " + cidades.indexOf(cidade));
        } else {
            System.out.println("Cidade não encontrada");
        }

        sc.close();
    }
}
