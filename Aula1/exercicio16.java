import java.util.TreeSet;

public class NomesOrdenados {
    public static void main(String[] args) {
        TreeSet<String> nomes = new TreeSet<>();
        nomes.add("Carlos");
        nomes.add("Ana");
        nomes.add("Beatriz");
        nomes.add("Fernando");
        nomes.add("Daniel");

        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
