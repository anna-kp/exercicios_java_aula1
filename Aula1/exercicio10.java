import java.util.ArrayList;
import java.util.Collections;

public class OrdenandoNumeros {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(12);
        numeros.add(3);
        numeros.add(8);
        numeros.add(20);
        numeros.add(7);
        numeros.add(15);
        numeros.add(1);
        numeros.add(10);
        numeros.add(9);

        Collections.sort(numeros);
        System.out.println(numeros);
    }
}
