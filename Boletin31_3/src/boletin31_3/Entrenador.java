package boletin31_3;

/**
 *
 * @author Yasmín
 */
public class Entrenador extends SeleccionFutbol implements DeportistaInterface,IntegranteInterface{
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
    public String toString() {
        return "Entrenador:"+"\n"+
                "Nome:"+getNome() +
                ", Apelido:"+getApelidos() + 
                ", IdFederacion:" + idFederacion + 
                ", Idade:"+getIdade()+
                ", ID:"+getId();           
    }   
}
