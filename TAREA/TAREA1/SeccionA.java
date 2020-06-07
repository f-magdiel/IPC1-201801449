/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipc1.tarea1;

/**
 *
 * @author FRANMAGDIEL_PC
 */
public class SeccionA extends Estudiante {

    public SeccionA(String nombre, String carnet) {
        super(nombre, carnet);
    }
    
    public void mostrarDatos(){
        
        System.out.println(getNombre()+" "+getCarnet());
        
    }
}
