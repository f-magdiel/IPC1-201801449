
package org.magdielasicona.tarea;

/**
 *
 * @author FRANMAGDIEL_PC
 */
public class Caballo extends Transporte{



    @Override
    public void avanzar(String dato1, String dato2, String dato3) {
        System.out.println("AVANCE - "+"CABALLO - "+dato1+" "+dato2+" "+dato3);
    }

    @Override
    public void frenar(String dato1, String dato2, String dato3) {
           System.out.println("FRENE - "+"CABALLO - "+dato1+" "+dato2+" "+dato3);
    }
    
}
