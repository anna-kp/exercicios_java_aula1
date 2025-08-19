package app;
import item.*;
import pedido.Pedido;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Pedido p = new Pedido("Carlos");

        Pizza pizza = new Pizza("Pizza Calabresa",40,0.5,LocalDate.now().plusDays(2),
                                "calabresa","recheada","tomate");
        Lanche lanche = new Lanche("X-Burger",20,0.3,LocalDate.now().plusDays(1),
                                   "francês","carne","maionese");
        Salgadinho salgado = new Salgadinho("Coxinha",8,0.1,LocalDate.now().plusDays(1),
                                            "frito","tradicional","frango");

        p.adicionarItem(pizza);
        p.adicionarItem(lanche);
        p.adicionarItem(salgado);

        p.gerarNotaFiscal(100);
    }
}
