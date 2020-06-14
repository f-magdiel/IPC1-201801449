
package org.magdielasicona.tarea;

/**
 *
 * @author FRANMAGDIEL_PC
 */
public class Coche extends Transporte{

    private String marcaAuto;
    private int modeloAuto;
    private String tipoAuto;

    public Coche(String marcaAuto, int modeloAuto, String tipoAuto) {
        this.marcaAuto = marcaAuto;
        this.modeloAuto = modeloAuto;
        this.tipoAuto = tipoAuto;
    }
    
    @Override
    public void avanzar() {
        System.out.println("AVANCE - AUTO - "+getMarcaAuto()+" - "+getModeloAuto()+" - "+getTipoAuto());
    }

    @Override
    public void frenar() {
       System.out.println("FRENE - AUTO - "+getMarcaAuto()+" - "+getModeloAuto()+" - "+getTipoAuto());
    }

    public String getMarcaAuto() {
        return marcaAuto;
    }

    public void setMarcaAuto(String marcaAuto) {
        this.marcaAuto = marcaAuto;
    }

    public int getModeloAuto() {
        return modeloAuto;
    }

    public void setModeloAuto(int modeloAuto) {
        this.modeloAuto = modeloAuto;
    }

    public String getTipoAuto() {
        return tipoAuto;
    }

    public void setTipoAuto(String tipoAuto) {
        this.tipoAuto = tipoAuto;
    }
    
}
