package org.magdielasicona.controlador;

import java.text.DecimalFormat;
import org.magdielasicona.carga.DatosObtenidos;
import org.magdielasicona.carga.Tipo;

/**
 *
 * @author FRANMAGDIEL_PC
 */
public class CalculoSolicitante {
    
     DecimalFormat df = new DecimalFormat("#.##");
     private static CalculoSolicitante instanciaCalculoSolicitante;

    public static CalculoSolicitante getInstancia() {
        if (instanciaCalculoSolicitante == null) {
            instanciaCalculoSolicitante = new CalculoSolicitante();
        }
        return instanciaCalculoSolicitante;
    }
    
    private double cobroEmpresa;//cobra el 10%
    
    private double valorCarro;
    
    private double valorReal;
    private double porcentajeTotalRiesgo;
    private double costoPrima;
    private double prima;
    private double costoDeducible;

    private double valorEstablecido;
    private double polizaUso;
    private double polizaMarca;
    private double polizaLinea;
    private double depreciacionModelo;
    
    private double posiblePrima;
    private double posibleDeducible;

    public double getPosiblePrima() {
        return posiblePrima;
    }

    public void setPosiblePrima(double posiblePrima) {
        this.posiblePrima = posiblePrima;
    }

    public double getPosibleDeducible() {
        return posibleDeducible;
    }

    public void setPosibleDeducible(double posibleDeducible) {
        this.posibleDeducible = posibleDeducible;
    }

    
    
    
    public double getValorCarro() {
        return valorCarro;
    }

    public void setValorCarro(double valorCarro) {
        this.valorCarro = valorCarro;
    }

    
    public double getCobroEmpresa() {
        return cobroEmpresa;
    }

    public void setCobroEmpresa(double cobroEmpresa) {
        this.cobroEmpresa = cobroEmpresa;
    }

    
    public double getValorReal() {
        return valorReal;
    }

    public void setValorReal(double valorReal) {
        this.valorReal = valorReal;
    }

    public double getPorcentajeTotalRiesgo() {
        return porcentajeTotalRiesgo;
    }

    public void setPorcentajeTotalRiesgo(double porcentajeTotalRiesgo) {
        this.porcentajeTotalRiesgo = porcentajeTotalRiesgo;
    }

    public double getCostoPrima() {
        return costoPrima;
    }

    public void setCostoPrima(double costoPrima) {
        this.costoPrima = costoPrima;
    }

    public double getPrima() {
        return prima;
    }

    public void setPrima(double prima) {
        this.prima = prima;
    }

    public double getCostoDeducible() {
        return costoDeducible;
    }

    public void setCostoDeducible(double costoDeducible) {
        this.costoDeducible = costoDeducible;
    }

    public double getValorEstablecido() {
        return valorEstablecido;
    }

    public void setValorEstablecido(double valorEstablecido) {
        this.valorEstablecido = valorEstablecido;
    }

    public double getPolizaUso() {
        return polizaUso;
    }

    public void setPolizaUso(double polizaUso) {
        this.polizaUso = polizaUso;
    }

    public double getPolizaMarca() {
        return polizaMarca;
    }

    public void setPolizaMarca(double polizaMarca) {
        this.polizaMarca = polizaMarca;
    }

    public double getPolizaLinea() {
        return polizaLinea;
    }

    public void setPolizaLinea(double polizaLinea) {
        this.polizaLinea = polizaLinea;
    }

    public double getDepreciacionModelo() {
        return depreciacionModelo;
    }

    public void setDepreciacionModelo(double depreciacionModelo) {
        this.depreciacionModelo = depreciacionModelo;
    }

  

    public void obteniedoValoresDeSolicitante(String tipo, String uso, String marca, String linea, String modelo, double valorVehiculo) {
        this.valorCarro = valorVehiculo;

        for (int i = 0; i < 30; i++) {
            if (DatosObtenidos.tipo[i].getNombreTipo() == tipo) {
                setValorEstablecido(DatosObtenidos.tipo[i].getValorMaximoTipo());
                System.out.println(getValorEstablecido());//YA
                break;
            } 
        }
        
        for (int i = 0; i < 30; i++) {
             if (DatosObtenidos.uso[i].getNombreUso() == uso) {
                setPolizaUso(DatosObtenidos.uso[i].getPorcentajePolizaUso());
                System.out.println(getPolizaUso());//YA
                break;
            }
        }
        
        for (int i = 0; i < 30; i++) {
             if (DatosObtenidos.marca[i].getNombreMarca() == marca) {
                setPolizaMarca(DatosObtenidos.marca[i].getPorcentajePolizaMarca());
                System.out.println(getPolizaMarca());
                break;
            }
        }
        
        for (int i = 0; i < 30; i++) {
            if (DatosObtenidos.linea[i].getNombreLinea() == linea) {
               setPolizaLinea(DatosObtenidos.linea[i].getPorcentajePolizaLinea());
                System.out.println(getPolizaLinea());
                break;
            }
        }
        
        for (int i = 0; i < 30; i++) {
            if (DatosObtenidos.modelo[i].getAñoModelo() == modelo) {
                setDepreciacionModelo(DatosObtenidos.modelo[i].getPorcentajeDepreciaciónModelo());
                System.out.println(getDepreciacionModelo());
                break;
            }
        }

    }
    
    public void realizandoCalculos(){
        //calculando valor real
     valorReal = valorEstablecido - depreciacionModelo* valorEstablecido;
     valorReal = Double.parseDouble(df.format(valorReal));
     
     
     //porcentaje total de riego
     porcentajeTotalRiesgo = polizaMarca + polizaUso + polizaLinea;
     porcentajeTotalRiesgo = Double.parseDouble(df.format(porcentajeTotalRiesgo));
     
     
     
     // la empresa cobra el 10%
     cobroEmpresa = 0.10* valorCarro;
     cobroEmpresa = Double.parseDouble(df.format(cobroEmpresa));
   
     
     
     
     //calculando prima total
     prima = valorCarro *(0.1+porcentajeTotalRiesgo);
     prima = Double.parseDouble(df.format(prima));
     
     
     
     //calculando costo prima
     costoPrima = prima/12;
    costoPrima = Double.parseDouble(df.format(costoPrima));
        System.out.println(costoPrima);
     
     
     //calculando costo deducible
     costoDeducible = 0.07*valorCarro;
     costoDeducible = Double.parseDouble(df.format(costoDeducible));
        System.out.println(costoDeducible);
    }
    
    public void menosDeducible(String posibleDeducibleSolicitante,String posiblePrimaSolicitante){
        double deducibleRecibido;
        double primaRecibido;
    deducibleRecibido = Double.parseDouble(posibleDeducibleSolicitante);
    primaRecibido = Double.parseDouble(posiblePrimaSolicitante);
    
    
    //Se  le resta el 10% al deducible y se le suma 3% al costoprima
    posibleDeducible = deducibleRecibido - (0.10*deducibleRecibido);
    posiblePrima =primaRecibido + (0.03*primaRecibido); 
    
    //transformada de 2 decimales
    posibleDeducible = Double.parseDouble(df.format(posibleDeducible));
    posiblePrima = Double.parseDouble(df.format(posiblePrima));
    
    
    
    }
    
    public void masDeducible(String posibleDeducibleSolicitante,String posiblePrimaSolicitante){
        double deducibleRecibido;
        double primaRecibido;
    deducibleRecibido = Double.parseDouble(posibleDeducibleSolicitante);
    primaRecibido = Double.parseDouble(posiblePrimaSolicitante);
    
     //Se  le resta el 10% al deducible y se le suma 3% al costoprima
    posibleDeducible = deducibleRecibido + (0.10*deducibleRecibido);
    posiblePrima = primaRecibido - (0.03*primaRecibido); 
    
    //transformada de 2 decimales
    posibleDeducible = Double.parseDouble(df.format(posibleDeducible));
    posiblePrima = Double.parseDouble(df.format(posiblePrima));
    }
}
