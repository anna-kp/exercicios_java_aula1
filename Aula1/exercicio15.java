import java.util.LinkedHashSet;

public class DiasSemana {
    public static void main(String[] args) {
        LinkedHashSet<String> dias = new LinkedHashSet<>();
        dias.add("Quarta");
        dias.add("Segunda");
        dias.add("Sexta");
        dias.add("Terça");

        for (String dia : dias) {
            System.out.println(dia);
        }
    }
}
