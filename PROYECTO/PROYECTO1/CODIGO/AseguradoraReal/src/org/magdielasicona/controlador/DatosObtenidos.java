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
    

    private String[] datos;

    public static Tipo tipo[] = new Tipo[30];

    public void obtenerDatos(String datosObtenidos) {
        String datosNuevos = datosObtenidos.replaceAll("\n", ",");

        datos = datosNuevos.split(",");
        for (int contador = 0; contador < datos.length; contador++) {

            if (datos[contador].equalsIgnoreCase("TIPO")) {
               agregarTipo(new Tipo(datos[contador+1],datos[contador+2]));
            } else if (datos[contador].equalsIgnoreCase("MODELO")) {

            } else if (datos[contador].equalsIgnoreCase("MARCA")) {

            } else if (datos[contador].equalsIgnoreCase("LINEA")) {

            } else if (datos[contador].equalsIgnoreCase("USO")) {

            } else if (datos[contador].equalsIgnoreCase("MECANICA")) {

            } else if (datos[contador].equalsIgnoreCase("REPUESTO")) {

            }

        }
    }
    
    
    public void agregarTipo(Tipo obj) {
        for (int i = 0; i < 30; i++) {
            if (tipo[i] == null) {
                tipo[i] = obj;
                tipo[i].imprimir();
                return;
            }
        }
    }
    
    
}
