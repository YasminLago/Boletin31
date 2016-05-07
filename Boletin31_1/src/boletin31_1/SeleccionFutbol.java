package boletin31_1;

/**
 *
 * @author Yasmín
 */
public abstract class SeleccionFutbol implements IntegranteSeleccionFutbol{
    private int id,idade;
    private String nome,apelidos;

    public SeleccionFutbol() {
    }

    public SeleccionFutbol(int id, int idade, String nome, String apelidos) {
        this.id = id;
        this.idade = idade;
        this.nome = nome;
        this.apelidos = apelidos;
    }

    public int getId() {
        return id;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public String getApelidos() {
        return apelidos;
    }
}
