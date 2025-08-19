package produto;

public class RendaFixa extends Produto {
    private double mensal;
    private int carencia;

    public RendaFixa(String nome,String desc,double mensal,int carencia){
        super(nome,desc);
        this.mensal=mensal;
        this.carencia=carencia;
    }

    @Override
    public double rendimento(int dias){
        if(dias<carencia) return 0;
        return mensal*(dias/30.0);
    }
}
