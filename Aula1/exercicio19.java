import java.util.HashMap;

public class FrequenciaPalavras {
    public static void main(String[] args) {
        String texto = "Java é uma linguagem de programação. Java é simples e poderosa.";
        String[] palavras = texto.toLowerCase().replace(".", "").split(" ");
        HashMap<String, Integer> contagem = new HashMap<>();

        for (String p : palavras) {
            contagem.put(p, contagem.getOrDefault(p, 0) + 1);
        }

        for (String chave : contagem.keySet()) {
            System.out.println(chave + ": " + contagem.get(chave));
        }
    }
}
