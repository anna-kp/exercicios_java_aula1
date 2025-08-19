package cliente;
import conta.Conta;
import java.util.*;

public abstract class Cliente {
    protected String nome;
    protected String email;
    protected List<Conta> contas = new ArrayList<>();

    public Cliente(String nome, String email){
        this.nome = nome;
        this.email = email;
    }

    public void adicionarConta(Conta c){contas.add(c);}
    public List<Conta> getContas(){return contas;}

    public abstract double taxa();

    @Override
    public String toString(){
        return nome + " - " + email;
    }
}
