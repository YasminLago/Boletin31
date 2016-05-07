package boletin31_2;

/**
 *
 * @author Yasmín
 */
public class Futbolista extends SeleccionFutbol{
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
    public void concentrarse() {
        System.out.println("Concentrarse o futbolista");
    }

    @Override
    public void viaxar() {
        System.out.println("Viaxar o futbolista");
    }

    @Override
    public void entrenar() {
        System.out.println("Entrenar o futbolista");
    }

    @Override
    public void xogarPartido() {
        System.out.println("Xogar partido o futbolista");
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
