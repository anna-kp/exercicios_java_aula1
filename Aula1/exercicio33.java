import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Teste {
}

class MinhaClasseDeTeste {

    @Teste
    public void testeSoma() {
        System.out.println("Executando testeSoma: SUCESSO");
    }

    public void metodoComum() {
        System.out.println("Este não é um teste.");
    }

    @Teste
    public void testeLogin() {
        System.out.println("Executando testeLogin: SUCESSO");
    }
}

public class ExecutorDeTestes {

    public static void executarTestes(Object obj) {
        Class<?> classe = obj.getClass();
        Method[] metodos = classe.getDeclaredMethods();

        for (Method m : metodos) {
            if (m.isAnnotationPresent(Teste.class)) {
                try {
                    m.invoke(obj);
                } catch (Exception e) {
                    System.out.println("Erro ao executar " + m.getName() + ": " + e.getMessage());
                }
            }
        }
    }

    public static void main(String[] args) {
        MinhaClasseDeTeste testes = new MinhaClasseDeTeste();
        executarTestes(testes);
    }
}
