package conta;
import cliente.Cliente;
import produto.Produto;
import java.util.*;

public class ContaInvestimento extends Conta {
    private List<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(Produto p){produtos.add(p);}

    @Override
    public double simular(int dias, Cliente cliente){
        double total = saldo;
        double ganhos = 0;
        for(Produto p: produtos) ganhos += p.rendimento(dias);
        total += ganhos;
        return total - ganhos*cliente.taxa();
    }
}
