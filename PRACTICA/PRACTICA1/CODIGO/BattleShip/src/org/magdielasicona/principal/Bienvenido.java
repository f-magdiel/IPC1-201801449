
package org.magdielasicona.principal;

/**
 *
 * @author FRANMAGDIEL_PC
 */
public class Bienvenido {
    public static void main(String[] args) {
        System.out.println("" +
        "*********          ****       **************     **************     ***           **********        ******        ***       ***      *************    *********       \n"+
        "***    ***       ***   ***          ***               ***           ***           ***             ***    ***      ***       ***           ***         ***     ***     \n"+
        "***    ***      ***     ***         ***               ***           ***           ***             ***             ***       ***           ***         ***     ***     \n"+
        "**********     *************        ***               ***           ***           *********       *********       *************           ***         *********       \n"+
        "***     ***   ***        ***        ***               ***           ***           ***                    ***      ***       ***           ***         ***             \n"+
        "***     ***   ***        ***        ***               ***           ***           ***             ***      ***    ***       ***           ***         ***             \n"+
        "***    ***    ***        ***        ***               ***           ***           ***             ***    ***      ***       ***           ***         ***             \n"+
        "*********     ***        ***        ***               ***           *********     *********         ******        ***       ***      *************    ***             \n"
        
        
        );
        
        MenuPrincipal menu = MenuPrincipal.getInstancia();
        menu.mostrarMenuPrincipal();
    }
}
