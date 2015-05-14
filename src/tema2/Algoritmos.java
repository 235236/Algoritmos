package tema2;

import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author David Alberto Torres Real 235236 Tema 1 de la tarea 52 Algoritmos
 * @since 11/05/2015
 * @version 1.0
 */
public class Algoritmos {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        int opcion;
        String opc;
        opc = JOptionPane.showInputDialog(null, "Selecciona un algoritmo 16-21: ", "Algoritmos: Tema 2", -1);
        opcion = Integer.parseInt(opc);
        if (opcion == 16) {
            dieciseis();
        } else if (opcion == 17) {
            diecisiete();
        } else if (opcion == 18) {
            diesiocho();
        } else if (opcion == 19) {
            diesinueve();
        } else if (opcion == 20) {
            veinte();
        } else if (opcion == 21) {
            veintiuno();
        } else {
            JOptionPane.showMessageDialog(null, "Opción Invalida", "ERROR", -1);
        }
    }

    /**
     * Imprime diez veces la serie de numeros del 1 al 10.
     *
     */
    public static void dieciseis() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 100; j++) {
                System.out.println(j);
            }
        }
    }

    /**
     * Imprime, cuenta y suma los multiplos de 2 que hay entre una serie de
     * numeros.
     */
    public static void diecisiete() {
        
    }

    /**
     * Cuenta las veces que aparece una determinada letra en una frase
     * introducida por el teclado.
     */
    public static void diesiocho() {
        
    }

    /**
     * Simulador de un reloj digital.
     */
    public static void diesinueve() {
        
    }

    /**
     * Calula el factorial de un numero.
     */
    public static void veinte() {
        
    }

    /**
     * Calcula la suma de los pares e impares de los numeros entre 1 y 1000.
     */
    public static void veintiuno() {
            
    }
}