package cliente;

public class PessoaFisica extends Cliente {
    private String cpf;

    public PessoaFisica(String nome, String email, String cpf){
        super(nome, email);
        this.cpf = cpf;
    }

    @Override
    public double taxa(){return 0.001;}
}
