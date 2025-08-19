package conta;
import cliente.Cliente;

public class ContaCorrente extends Conta {
    @Override
    public double simular(int dias, Cliente cliente){
        return saldo;
    }
}
