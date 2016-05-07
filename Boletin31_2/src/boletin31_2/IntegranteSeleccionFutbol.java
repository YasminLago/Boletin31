package boletin31_2;

/**
 *
 * @author Yasmín
 */
public interface IntegranteSeleccionFutbol {
    
    public abstract void concentrarse();
    
    public abstract void viaxar();
          
    public abstract void entrenar();
          
    public abstract void xogarPartido();
    
    default void ruedaPrensa(){
        System.out.println("Rueda de prensa default");
    }
    
    default void videoPublicitario(){
        System.out.println("Video publicitario default");
    }
        

}
