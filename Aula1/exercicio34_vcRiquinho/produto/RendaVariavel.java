package produto;

public class RendaVariavel extends Produto {
    private double esperado;

    public RendaVariavel(String nome,String desc,double esperado){
        super(nome,desc);
        this.esperado=esperado;
    }

    @Override
    public double rendimento(int dias){
        return esperado*(dias/30.0);
    }
}
