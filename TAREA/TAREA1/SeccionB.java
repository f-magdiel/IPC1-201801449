package ipc1.tarea1;

/**
 *
 * @author FRANMAGDIEL_PC
 */
public class SeccionB extends Estudiante {

    public SeccionB(String nombre, String carnet) {
        super(nombre, carnet);
    }

    public void mostrarDatos() {
        
        System.out.println(getNombre()+" "+getCarnet());
    }

}
