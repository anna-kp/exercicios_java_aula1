package item;
import java.time.LocalDate;

public class Salgadinho extends Item {
    private String tipo;
    private String massa;
    private String recheio;

    public Salgadinho(String nome,double preco,double peso,LocalDate validade,
                      String tipo,String massa,String recheio){
        super(nome,preco,peso,validade);
        this.tipo=tipo;
        this.massa=massa;
        this.recheio=recheio;
    }

    @Override
    public String descricao(){
        return "Salgadinho " + tipo + " de massa " + massa + " com recheio " + recheio;
    }
}
