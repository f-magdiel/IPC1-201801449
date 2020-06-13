
package org.magdielasicona.controlador;

/**
 *
 * @author FRANMAGDIEL_PC
 */
public class Solicitante {
    
     private static Solicitante instanciaSolicitante;

    public static Solicitante getInstancia() {
        if (instanciaSolicitante == null) {
            instanciaSolicitante = new Solicitante();
        }
        return instanciaSolicitante;
    }
    
    private double costoPrima;
    private double deducible;
   
   
    private double valorVehiculo;
    Asociado asociado[] = new Asociado[50];
    
    public void solicitarDatos(String nombre,String apellido,String dpi,String telefono,String tipoVehiculo,String usoVehiculo,String marca,String linea,String modelo,String valorVehiculo,String prima,String deducible){
    
    }
    
    public void insertarAsociado(Asociado obj){
        for (int i = 0; i < 10; i++) {
            if (asociado[i]==null) {
                asociado[i] = obj;
                return;
            }
        }
    }
    
}
