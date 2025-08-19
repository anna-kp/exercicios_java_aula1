package pedido;
import item.Item;
import java.util.*;

public class Pedido {
    private String cliente;
    private List<Item> itens = new ArrayList<>();
    private final double taxaServico = 0.1; // 10%

    public Pedido(String cliente){
        this.cliente=cliente;
    }

    public void adicionarItem(Item i){itens.add(i);}

    public double calcularTotal(){
        double soma=0;
        for(Item i: itens) soma+=i.getPreco();
        return soma + soma*taxaServico;
    }

    public double calcularTroco(double recebido){
        return recebido - calcularTotal();
    }

    public void gerarNotaFiscal(double recebido){
        System.out.println("Cliente: " + cliente);
        for(Item i: itens){
            System.out.println(i.getNome()+" - "+i.descricao()+" - R$"+i.getPreco());
        }
        double total=calcularTotal();
        System.out.println("Total com taxa: R$"+total);
        System.out.println("Pago: R$"+recebido);
        System.out.println("Troco: R$"+calcularTroco(recebido));
    }
}
