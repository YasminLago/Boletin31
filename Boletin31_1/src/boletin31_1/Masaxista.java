package boletin31_1;

/**
 *
 * @author Yasmín
 */
public class Masaxista extends SeleccionFutbol{
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
    public void concentrarse() {
        System.out.println("Concentrarse o masaxista");
    }

    @Override
    public void viaxar() {
        System.out.println("Viaxar o masaxista");
    }

    @Override
    public void entrenar() {
        System.out.println("Entrenar o masaxista");
    }

    @Override
    public void xogarPartido() {
        System.out.println("Xogar partido o masaxista");
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
