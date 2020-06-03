package org.magdielasicona.juego;

/**
 *
 * @author FRANMAGDIEL_PC
 */
public class Tablero {

    private static Tablero instanciaTablero;

    public static Tablero getInstancia() {
        if (instanciaTablero == null) {
            instanciaTablero = new Tablero();
        }
        return instanciaTablero;
    }
    //Variables
    private String[][] tableroPrincipal = new String[10][10];
    private int x;
    private int y;
    private int portaavion =1;
    private int submarino = 3;
    private int destructor = 3;
    private int fragata = 2;
    private int easter = 1;
            
    

    public void creandoTablero() {

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                tableroPrincipal[i][j] = " ";

            }
        }
        
        //Imprimiendo el Tablero Vacio
        System.out.println("******************TABLERO VACIO*******************");
        for (int i = 0; i < 10; i++) {
            System.out.print("    "+i+"");
        }
        System.out.println("");
        for (int i = 0; i < 10; i++) {
            System.out.print(i+" ");
            for (int j = 0; j < 10; j++) {

                System.out.print("| " + tableroPrincipal[i][j] + " |");

            }
            System.out.println("");
        }

    }

    public void asignarBarcos() {
        System.out.println("");
        System.out.println("**************BARCOS DISPONIBLES***************");
        System.out.println("*   1. PORTAAVION = "+portaavion+"  (OCUPA 4 CASILLAS)     *");
        System.out.println("*   2. SUBMARINO  = "+submarino+"  (OCUPA 3 CASILLAS)     *");
        System.out.println("*   3. DESTRUCTOR = "+destructor+"  (OCUPA 2 CASILLAS)     *");
        System.out.println("*   4. FRAGATA    = "+fragata+"  (OCUPA 1 CASILLAS)     *");
        System.out.println("*   5. EASTER EGG = "+easter+"  (OCUPA 1 CASILLAS)     *");
        System.out.println("***********************************************");
    }
}
