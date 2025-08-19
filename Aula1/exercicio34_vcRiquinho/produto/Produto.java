package produto;

public abstract class Produto {
    protected String nome;
    protected String descricao;

    public Produto(String nome, String descricao){
        this.nome = nome;
        this.descricao = descricao;
    }

    public abstract double rendimento(int dias);
}
