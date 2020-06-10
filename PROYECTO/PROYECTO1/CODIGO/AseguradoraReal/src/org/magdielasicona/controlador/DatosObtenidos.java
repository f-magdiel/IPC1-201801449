
package org.magdielasicona.controlador;

/**
 *
 * @author FRANMAGDIEL_PC
 */
public class DatosObtenidos {
    
     private static DatosObtenidos instanciaDatosObtenidos;

    public static DatosObtenidos getInstancia() {
        if (instanciaDatosObtenidos == null) {
            instanciaDatosObtenidos = new DatosObtenidos();
        }
        return instanciaDatosObtenidos;
    }
    
    public void obtenerDatos(String datosObtenidos){
    String [] datos;
    datos = datosObtenidos.split(",");
        for (int i = 0; i < datos.length; i+=2) {
            System.out.println(datos[i]);
        }
    
    }
}
