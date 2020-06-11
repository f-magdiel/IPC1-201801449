package org.magdielasicona.carga;

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
    public static Modelo modelo[] = new Modelo[30];
    public static Marca marca[] = new Marca[30];
    public static Linea linea[] = new Linea[30];
    public static Uso uso[] = new Uso[30];
    public static Mecanica mecanica[] = new Mecanica[30];
    public static Repuesto repuesto[] = new Repuesto[30];
 
    public void obtenerDatos(String datosObtenidos) {
        String datosNuevos = datosObtenidos.replaceAll("\n", ",");

        datos = datosNuevos.split(",");
        for (int contador = 0; contador < datos.length; contador++) {

            if (datos[contador].equalsIgnoreCase("TIPO")) {
                agregarTipo(new Tipo(datos[contador + 1], datos[contador + 2]));

            } else if (datos[contador].equalsIgnoreCase("MODELO")) {
                agregarModelo(new Modelo(datos[contador + 1], datos[contador + 2]));

            } else if (datos[contador].equalsIgnoreCase("MARCA")) {
                agregarMarca(new Marca(datos[contador + 1], datos[contador + 2]));

            } else if (datos[contador].equalsIgnoreCase("LINEA")) {
                agregarLinea(new Linea(datos[contador+1],datos[contador+2]));

            } else if (datos[contador].equalsIgnoreCase("USO")) {
                agregarUso(new Uso(datos[contador+1],datos[contador+2]));

            } else if (datos[contador].equalsIgnoreCase("MECANICA")) {
                agregarMecanica(new Mecanica(datos[contador+1],datos[contador+2]));

            } else if (datos[contador].equalsIgnoreCase("REPUESTO")) {
                 agregarRepuesto(new Repuesto(datos[contador+1],datos[contador+2]));

            }

        }
    }

    public void agregarTipo(Tipo obj) {
        for (int i = 0; i < 30; i++) {
            if (tipo[i] == null) {
                tipo[i] = obj;

                return;
            }
        }
    }

    public void agregarModelo(Modelo obj) {
        for (int i = 0; i < 30; i++) {
            if (modelo[i] == null) {
                modelo[i] = obj;
                return;
            }
        }
    }

    public void agregarMarca(Marca obj) {
        for (int i = 0; i < 30; i++) {
            if (marca[i] == null) {
                marca[i] = obj;
                return;
            }
        }
    }

    public void agregarLinea(Linea obj) {
        for (int i = 0; i < 30; i++) {
            if (linea[i] == null) {
                linea[i] = obj;
                return;
            }
        }
    }
    
    public void agregarUso(Uso obj){
        for (int i = 0; i < 30; i++) {
            if (uso[i]==null) {
                uso[i]=obj;
                return;
            }
        }
    }
    
    public void agregarMecanica(Mecanica obj){
        for (int i = 0; i < 30; i++) {
            if (mecanica[i]==null) {
                mecanica[i]=obj;
                return;
            }
        }
    }
    
     public void agregarRepuesto(Repuesto obj){
        for (int i = 0; i < 30; i++) {
            if (repuesto[i]==null) {
                repuesto[i]=obj;
                return;
            }
        }
    }
    
    

}
