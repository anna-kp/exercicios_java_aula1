package conta;
import cliente.Cliente;

public class ContaCDI extends Conta {
    @Override
    public double simular(int dias, Cliente cliente){
        double ganho = saldo*(dias/30.0)*(0.01);
        return saldo+ganho-(ganho*0.0007);
    }
}
