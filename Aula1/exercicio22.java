import java.util.TreeMap;

public class NotasAlunos {
    public static void main(String[] args) {
        TreeMap<String, Double> notas = new TreeMap<>();
        notas.put("Carlos", 7.5);
        notas.put("Ana", 9.0);
        notas.put("Fernando", 6.8);
        notas.put("Beatriz", 8.4);
        notas.put("Daniel", 7.0);

        for (String aluno : notas.keySet()) {
            System.out.println(aluno + " - " + notas.get(aluno));
        }
    }
}
