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
    DatosObtenidos[] datosAlmacenados = new DatosObtenidos[21];
    private String tipo, nombreTipo, valorMaximoTipo;
    private String modelo, añoModelo, porcentajeDepreaciacionModelo;
    private String marca, nombreMarca, porcetajePolizaMarca;
    private String linea, nombreLinea, porcentajePolizaLinea;
    private String uso, nombreUso, porcentajePolizaUso;
    private String mecanica, nombreMecanica, precioMecanica;
    private String respuesto, nombreRepuesto, precioRepuesto;
    private String[] datos;
    private String[] listaDatos;

    public void obtenerDatos(String datosObtenidos) {
        String datosNuevos = datosObtenidos.replaceAll("\n", ",");
        
        datos = datosNuevos.split(",");
        for (int contador = 0; contador < datos.length; contador++) {
            System.out.println("Vector: " + contador + " - " + datos[contador]);
            if (datos[contador].equalsIgnoreCase("MODELO")) {
                System.out.println("SI MODELO");

            }

        }
    }

    public void obtenerLista() {

    }

}
