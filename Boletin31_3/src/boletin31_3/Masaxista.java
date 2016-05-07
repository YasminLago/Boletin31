package boletin31_3;

/**
 *
 * @author Yasmín
 */
public class Masaxista extends SeleccionFutbol implements DeportistaInterface,IntegranteInterface{
    private String titulacion;
    private int anosExperiencia;

    public Masaxista() {
    }

    public Masaxista(String titulacion, int anosExperiencia, int id, int idade, String nome, String apelidos) {
        super(id, idade, nome, apelidos);
        this.titulacion = titulacion;
        this.anosExperiencia = anosExperiencia;
    }
    
    public void darMasaxe(){
        System.out.println("O masaxista da masaxes");
    }

    @Override
    public String toString() {
        return "Masaxista: "+"\n"
                +"Nome:"+getNome() 
                +", Apelido:"+getApelidos()
                + ", Titulacion:" + titulacion 
                + " ,Anos de Experiencia:" + anosExperiencia
                +", ID:"+getId()
                +", Idade:"+getIdade();
    }
}
