package boletin31_3;

import java.util.ArrayList;

/**
 *
 * @author Yasmín
 */
public class Boletin31_3 {

    public static void main(String[] args) {
         ArrayList <SeleccionFutbol> listaEquipo = new ArrayList();
       SeleccionFutbol xogador = new Futbolista(1,"futbolista",1,30,"Xogador1","Apelido1");
       SeleccionFutbol entrenador = new Entrenador(2,2,20,"Entrenador1","Apelido2");
       SeleccionFutbol masaxista = new Masaxista("Masaxista",30,3,50,"Masaxista1","Apelido3");
       
       listaEquipo.add(xogador);
       listaEquipo.add(entrenador);
       listaEquipo.add(masaxista);
       for(SeleccionFutbol s:listaEquipo)
           System.out.println(s.toString());
       
       Futbolista f = new Futbolista();
            f.entrenar();
            f.jugarPartido();
            f.concentrarse();
            f.viajar();
       Entrenador e = new Entrenador();
            e.entrenar();
            e.jugarPartido();
            e.concentrarse();
            e.viajar();
       Masaxista m = new Masaxista();
            m.entrenar();
            m.jugarPartido();
            m.concentrarse();
            m.viajar();

    }
    
}
