package conta;
import cliente.Cliente;

public abstract class Conta {
    protected double saldo;

    public void depositar(double v){saldo+=v;}
    public double getSaldo(){return saldo;}

    public abstract double simular(int dias, Cliente cliente);
}
