package app;
import modelo.*;
import cadastro.*;

public class TestaCadastro {
    public static void main(String[] args){
        CadastroPessoas cad = new CadastroPessoas(10);

        Cliente c = new Cliente("Carlos",new Data(12,5,1990),101);
        Funcionario f = new Funcionario("Mariana",new Data(1,3,1985),3000);
        Gerente g = new Gerente("Paulo",new Data(20,8,1975),6000,"TI");

        cad.cadastraPessoa(c);
        cad.cadastraPessoa(f);
        cad.cadastraPessoa(g);

        cad.imprimeCadastro();
    }
}
