import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Aluno {
    String nome;
    double nota;

    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    @Override
    public String toString() {
        return nome + " - " + nota;
    }
}

public class AgruparAlunos {
    public static void main(String[] args) {
        List<Aluno> alunos = new ArrayList<>();
        alunos.add(new Aluno("Ana", 8.0));
        alunos.add(new Aluno("Bruno", 6.5));
        alunos.add(new Aluno("Carlos", 4.0));
        alunos.add(new Aluno("Diana", 7.2));
        alunos.add(new Aluno("Eduardo", 5.5));

        Map<String, List<Aluno>> agrupados = new HashMap<>();
        agrupados.put("Aprovados", new ArrayList<>());
        agrupados.put("Recuperacao", new ArrayList<>());
        agrupados.put("Reprovados", new ArrayList<>());

        for (Aluno a : alunos) {
            if (a.nota >= 7) {
                agrupados.get("Aprovados").add(a);
            } else if (a.nota >= 5) {
                agrupados.get("Recuperacao").add(a);
            } else {
                agrupados.get("Reprovados").add(a);
            }
        }

        for (String faixa : agrupados.keySet()) {
            System.out.println(faixa + ": " + agrupados.get(faixa));
        }
    }
}
