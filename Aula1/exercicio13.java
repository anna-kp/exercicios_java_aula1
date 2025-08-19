import java.util.ArrayList;
import java.util.HashSet;

public class RemovendoDuplicatas {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(4);
        numeros.add(5);

        HashSet<Integer> semDuplicatas = new HashSet<>(numeros);
        System.out.println("Original: " + numeros);
        System.out.println("Sem duplicatas: " + semDuplicatas);
    }
}
