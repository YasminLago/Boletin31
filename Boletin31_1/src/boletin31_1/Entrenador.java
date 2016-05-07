package boletin31_1;

/**
 *
 * @author Yasmín
 */
public class Entrenador extends SeleccionFutbol{
    private int idFederacion;

    public Entrenador() {
        super();
    }

    public Entrenador(int idFederacion, int id, int idade, String nome, String apelidos) {
        super(id, idade, nome, apelidos);
        this.idFederacion = idFederacion;
    }

    public void planificarEntrenamento(){
        System.out.println("O entrenador planifica o entrenamento");
    }

    @Override
    public void concentrarse() {
        System.out.println("Concentrarse o entrenador");
    }

    @Override
    public void viaxar() {
        System.out.println("Viaxar o entrenador");
    }

    @Override
    public void entrenar() {
        System.out.println("Entrenar o entrenador");
    }

    @Override
    public void xogarPartido() {
        System.out.println("Xogar partido o entrenador");
    }

    @Override
    public String toString() {
        return "Entrenador:"+"\n"+
                "Nome:"+getNome() +
                ", Apelido:"+getApelidos() + 
                ", IdFederacion:" + idFederacion + 
                ", Idade:"+getIdade()+
                ", ID:"+getId();           
    }   
}
