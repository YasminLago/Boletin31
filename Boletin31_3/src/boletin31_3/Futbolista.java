package boletin31_3;

/**
 *
 * @author Yasmín
 */
public class Futbolista extends SeleccionFutbol implements DeportistaInterface,IntegranteInterface{
    private int dorsal;
    private String demarcacion;

    public Futbolista() {
        super();
    }

    public Futbolista(int dorsal, String demarcacion, int id, int idade, String nome, String apelidos) {
        super(id, idade, nome, apelidos);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }
    
    public void entrevista(){
        System.out.println("O futbolista fai unha entrevista");
    }

    @Override
    public String toString() {
        return "Futbolista: "+"\n" +
                "Nome:"+getNome()+ 
                ", Apelido:"+getApelidos() + 
                ", Dorsal:" + dorsal + 
                ", Demarcacion:" + demarcacion+
                ", ID:"+getId()+
                ", Idade:"+getIdade();
    }
    
    
}
