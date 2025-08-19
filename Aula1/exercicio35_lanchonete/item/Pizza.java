package item;
import java.time.LocalDate;

public class Pizza extends Item {
    private String recheio;
    private String borda;
    private String molho;

    public Pizza(String nome,double preco,double peso,LocalDate validade,
                 String recheio,String borda,String molho){
        super(nome,preco,peso,validade);
        this.recheio=recheio;
        this.borda=borda;
        this.molho=molho;
    }

    @Override
    public String descricao(){
        return "Pizza de " + recheio + ", borda " + borda + ", molho " + molho;
    }
}
