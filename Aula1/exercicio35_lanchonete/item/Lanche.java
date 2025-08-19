package item;
import java.time.LocalDate;

public class Lanche extends Item {
    private String pao;
    private String recheio;
    private String molho;

    public Lanche(String nome,double preco,double peso,LocalDate validade,
                  String pao,String recheio,String molho){
        super(nome,preco,peso,validade);
        this.pao=pao;
        this.recheio=recheio;
        this.molho=molho;
    }

    @Override
    public String descricao(){
        return "Lanche de pão " + pao + " com " + recheio + " e molho " + molho;
    }
}
