import java.util.LinkedList;

public class FilaAtendimento {
    public static void main(String[] args) {
        LinkedList<String> fila = new LinkedList<>();
        fila.add("Ana");
        fila.add("Bruno");
        fila.add("Carlos");
        fila.add("Diana");
        fila.add("Eduardo");

        fila.removeFirst();
        fila.removeFirst();

        fila.addFirst("Paula");
        fila.addFirst("Marcos");

        System.out.println(fila);
    }
}
