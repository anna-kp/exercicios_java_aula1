package cadastro;
import modelo.*;

public class CadastroPessoas {
    private Pessoa[] pessoas;
    private int qtdAtual;

    public CadastroPessoas(int capacidade){
        pessoas = new Pessoa[capacidade];
        qtdAtual=0;
    }

    public void cadastraPessoa(Pessoa p){
        if(qtdAtual<pessoas.length){
            pessoas[qtdAtual]=p;
            qtdAtual++;
        }
    }

    public void imprimeCadastro(){
        for(int i=0;i<qtdAtual;i++){
            pessoas[i].imprimeDados();
        }
    }
}
