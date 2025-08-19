public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(100);

        try {
            conta.sacar(150);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        System.out.println("Saldo final: " + conta.getSaldo());
    }
}

class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(String mensagem) {
        super(mensagem);
    }
}

class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente");
        }
        saldo -= valor;
    }

    public double getSaldo() {
        return saldo;
    }
}
