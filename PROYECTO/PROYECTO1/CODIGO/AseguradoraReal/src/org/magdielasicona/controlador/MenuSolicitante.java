
package org.magdielasicona.controlador;

/**
 *
 * @author FRANMAGDIEL_PC
 */
public class MenuSolicitante {
    
     private static MenuSolicitante instanciaMenuSolicitante;

    public static MenuSolicitante getInstancia() {
        if (instanciaMenuSolicitante == null) {
            instanciaMenuSolicitante = new MenuSolicitante();
        }
        return instanciaMenuSolicitante;
    }
    
    private double costoPrima;
    private double deducible;
    private double posibleCostoPrima;
    private double posibleDeducible;
    private double valorVehiculo;
    Asociado asociado[] = new Asociado[50];
    
    public void solicitarDatos(String nombre,String apellido,String dpi,String telefono,String tipoVehiculo,String usoVehiculo,String marca,String linea,String modelo,String valorVehiculo){
    
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
