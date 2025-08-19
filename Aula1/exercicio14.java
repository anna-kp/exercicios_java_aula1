import java.util.HashSet;

public class EmailsUnicos {
    public static void main(String[] args) {
        HashSet<String> emails = new HashSet<>();
        emails.add("ana@email.com");
        emails.add("bruno@email.com");
        emails.add("ana@email.com");

        System.out.println("Quantidade de e-mails: " + emails.size());
    }
}
