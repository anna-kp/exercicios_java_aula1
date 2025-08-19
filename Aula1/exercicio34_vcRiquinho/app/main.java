package app;
import cliente.*;
import conta.*;
import produto.*;

public class Main {
    public static void main(String[] args){
        Cliente pf = new PessoaFisica("Ana","ana@mail","123");
        ContaInvestimento ci = new ContaInvestimento();
        ci.depositar(1000);
        ci.adicionarProduto(new RendaFixa("Tesouro","Seguro",50,60));
        ci.adicionarProduto(new RendaVariavel("Ações","Risco",80));
        pf.adicionarConta(ci);

        double resultado = ci.simular(90,pf);
        System.out.println("Saldo após 90 dias: " + resultado);
    }
}
