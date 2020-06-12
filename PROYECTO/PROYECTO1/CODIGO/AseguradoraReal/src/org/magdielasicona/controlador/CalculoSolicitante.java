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
     
     
     
     //porcentaje total de riego
     porcentajeTotalRiesgo = polizaMarca + polizaUso + polizaLinea;
     
     
     
     
     // la empresa cobra el 10%
     cobroEmpresa = 0.10* valorCarro;
   
     
     
     
     //calculando prima total
     prima = valorCarro *(0.1+porcentajeTotalRiesgo);
     
     
     
     
     //calculando costo prima
     costoPrima = prima/12;
    df.format(costoPrima);
        System.out.println(costoPrima);
     
     
     //calculando costo deducible
     costoDeducible = 0.07*valorCarro;
    df.format(costoDeducible);
    }
}
