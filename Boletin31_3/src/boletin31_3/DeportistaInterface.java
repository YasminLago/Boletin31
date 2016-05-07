package boletin31_3;

/**
 *
 * @author Yasmín
 */
public interface DeportistaInterface {
    default void entrenar(){
        System.out.println("Entrenar default");
    }
    
    default void jugarPartido(){
        System.out.println("Jugar partido default");
    }
}
