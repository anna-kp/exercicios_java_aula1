import java.util.HashMap;

public class VerificaAgenda {
    public static void main(String[] args) {
        HashMap<String, String> agenda = new HashMap<>();
        agenda.put("Ana", "1111-1111");
        agenda.put("Bruno", "2222-2222");
        agenda.put("Carlos", "3333-3333");

        String nome = "Bruno";
        String telefone = "2222-2222";

        if (agenda.containsKey(nome)) {
            System.out.println("Nome encontrado: " + nome);
        } else {
            System.out.println("Nome não encontrado");
        }

        if (agenda.containsValue(telefone)) {
            System.out.println("Telefone encontrado: " + telefone);
        } else {
            System.out.println("Telefone não encontrado");
        }
    }
}
