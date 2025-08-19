import java.lang.reflect.Field;

class Configuracao {
    private String urlConexao = "localhost:5432";
}

public class Main {
    public static void main(String[] args) throws Exception {
        Configuracao config = new Configuracao();

        Field campo = Configuracao.class.getDeclaredField("urlConexao");
        campo.setAccessible(true);

        String valorAntes = (String) campo.get(config);
        System.out.println("Antes da alteração: " + valorAntes);

        campo.set(config, "db.producao.com:5432");

        String valorDepois = (String) campo.get(config);
        System.out.println("Depois da alteração: " + valorDepois);
    }
}
