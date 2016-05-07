package boletin31_3;

/**
 *
 * @author Yasmín
 */
public interface IntegranteInterface {
    default void concentrarse(){
        System.out.println("Concentrarse default");
    }
    
    default void viajar(){
        System.out.println("Viajar default");
    }
}
