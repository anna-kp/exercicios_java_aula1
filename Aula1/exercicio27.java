import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sorteio {
    public static void main(String[] args) {
        List<String> participantes = new ArrayList<>();
        participantes.add("Ana");
        participantes.add("Bruno");
        participantes.add("Carlos");
        participantes.add("Ana");
        participantes.add("Diana");
        participantes.add("Bruno");

        Set<String> unicos = new HashSet<>(participantes);
        List<String> listaUnicos = new ArrayList<>(unicos);

        Collections.shuffle(listaUnicos);

        System.out.println("Ganhadores:");
        for (int i = 0; i < 3 && i < listaUnicos.size(); i++) {
            System.out.println(listaUnicos.get(i));
        }
    }
}
