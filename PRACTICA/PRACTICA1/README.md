# IPC1-201801449
Practica 1 de IPC1 Vacas Junio 2020
# MANUAL TECNICO DE BATTLESHIP




### REQUISITOS 📋
Procesador: Intel® Core™ i5-7200U (2,5 GHz hasta 3,1 GHz Intel® Turbo Boost, 3 MB de caché, 2 núcleos)
Memoria Ram: 8 GB DDR4 a 2400 MHz
Tarjeta de video: Intel HD Graphics 620
S.O:  Windows 10 , Windows 8.1 , Windows 7




## CLASES UTILIZADOS
## CLASES UTILIZADOS EN EL PAQUETE org.magdielasicona.principal
### Bienvenido
Clase que se utilió para dar la bienvenida la usuario cuando ejecuta el programa.
### MenuPrincipal
Clase que se utilizó para gestionar el Menu Principal, donde se puede acceder atraves de el en el sub menu.
### SubMenu
Clase que se utilizó para gestionar el SubMenu, donde se puede acceder atraves de él en el menu del juego.
## CLASES UTILIZADOS EN EL PAQUETE org.magdielasicona.juego
### Controlador
Clase que se utilizó para controlar la cantidad de intentos, visualizar el tablero y reiniciar el tablero.
### Partida
Clase que se utilizó para gestionar el menu del juego, donde se indica la hora, fecha , cantidad de intentos, barcos hunidos, y en donde se puede visualizar el tablero en tiempo real.
### Tablero
Clase que se utilizó para gestionar el disparo que hace el usuario, donde se le indica si gana, piede o abandona la partida.



## METODOS IMPLEMENTADOS
### MenuPrincipal.mostrarMenuPrincipal()
Metodo para imprimir las 4 opciones del Menu

### SubMenu.crearTablero()
Metodo para imprimir el subMenu, 


### SubMenu.reporteCompleto()
Metodo para imprimir el reporte de todos los jugadores, y en donde se utilizó el ciclo for para imprimir.

### SubMenu.reporteVictorias()
Metodo para imprimir el reporte de todos los jugadores ganadores, y en donde se utilizó el ciclo for para imprimir.

### Controlador.cantidadDeIntentos()
Metodo que se utilizo para asignar la nueva cantidad de intentos
### Controlador.visualizarTablero()
Metodo que se utilizo para imprimir y visualizar el tablero
### Controlador.reiniciarTablero()
Metodo que se utulizo para reiniciar el tablero.
### Controlador.setearControlador()
Metodo que se utilizo para resetear el valor de las variables al ganar, perder o abandonar la partida.
### Partida.resetearGeneral()
Metodo que se utilizo para resetear todos los valores de las variables utilizados y los arreglos.
### Partida.validacionAbandonar()
Metodo que se utilizo para cuando el usuario abandone haga una acción
### Partida.validacionIniciarJugar()
Metodo que se utilizo para validar si el jugador tiene todavia intentos, de contrario toma una accion para avisar, si gano ó perdio.
### Partida.ingresoNombre()
Metodo que permite pedirle al usuario su nickname
### Partida.validacionTablero()
Metodo que verifica si el tablero esta completo de contrario, manda un mensaje que dice que esta incompleto.
### Partida.empezarJugar()
Metodo que imprime el tablero, fecha, hora, intentos, barcos hundidos, y el menu para atacar.
### Partida.disparaMisil()
Metodo que gestiona la cantidad de disparos fallados y acertadas.
### Partida.quitarParentesis
Metodo que quita el parentesis ala coordenada ingresada.
### Tablero.rellenadoTablero()
Metodo que se encarga de rellenar el tablero con "-" para distingir los espacios
### Tablero.creandoTablero()
Metodo que se encarga de crear el tablero de forma presentada para guiar al usuario con coordenadas.

### Tablero.signarBarcos()
Metodo que gestiona la colocacion de los barcos en el tablero.

### Tablero.posicionPortavion()
Metodo que se encarga de colocar la poscion del portaavion en el arreglo.
### Tablero.asignarSubmarino()
Metodo que se encarga de colocar la poscion del submarino en el arreglo.
### Tablero.asignarDestructor()
Metodo que se encarga de colocar la poscion del destructor en el arreglo.
### Tablero.asignarFragata()
Metodo que se encarga de colocar la poscion del fragata en el arreglo.
### Tablero.asignarEaster()
Metodo que se encarga de colocar la poscion del portaavion en el arreglo.
### Tablero.quitarParentesis()
Metodo que se encarga de quitar los parentesis a las coodenadas ingresadas
### Tablero.reemplazadorPortaavion()
Metodo que se encarga de reemplezar el portacion si se desea cambiar de lugar
### Tablero.reemplezarEgg().
Metodo que se encarga de reemplezae el Easter Egg si se desea cambiar de lugar.




## Autor ✒️
201801449
FRANCISCO MAGDIEL ASICONA MATEO









