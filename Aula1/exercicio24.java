import java.util.LinkedList;
import java.util.Queue;

public class FilaImpressao {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();
        fila.add("Documento1.pdf");
        fila.add("Foto.png");
        fila.add("Relatorio.docx");
        fila.add("Apresentacao.pptx");
        fila.add("Planilha.xlsx");

        while (!fila.isEmpty()) {
            String doc = fila.poll();
            System.out.println("Imprimindo: " + doc);
        }
    }
}
