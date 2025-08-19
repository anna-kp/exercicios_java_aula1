import java.util.LinkedList;

public class HistoricoNavegacao {
    private LinkedList<String> historico = new LinkedList<>();
    private int indiceAtual = -1;

    public void visitar(String url) {
        while (historico.size() > indiceAtual + 1) {
            historico.removeLast();
        }
        historico.add(url);
        indiceAtual++;
        System.out.println("Visitando: " + url);
    }

    public void voltar() {
        if (indiceAtual > 0) {
            indiceAtual--;
            System.out.println("Voltando para: " + historico.get(indiceAtual));
        } else {
            System.out.println("Não há página anterior");
        }
    }

    public void avancar() {
        if (indiceAtual < historico.size() - 1) {
            indiceAtual++;
            System.out.println("Avançando para: " + historico.get(indiceAtual));
        } else {
            System.out.println("Não há página seguinte");
        }
    }

    public static void main(String[] args) {
        HistoricoNavegacao navegador = new HistoricoNavegacao();
        navegador.visitar("site1.com");
        navegador.visitar("site2.com");
        navegador.visitar("site3.com");
        navegador.voltar();
        navegador.voltar();
        navegador.avancar();
    }
}
