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
        opc = JOptionPane.showInputDialog(null, "Selecciona un algoritmo 16-21: "
                , "Algoritmos: Tema 2", -1);
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
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
    }

    /**
     * Imprime, cuenta y suma los multiplos de 2 que hay entre una serie de
     * numeros.
     */
    public static void diecisiete() {
        for (int i = 100;
                i >= 0; i--) {
            System.out.println(i);
        }
    }

    /**
     * Cuenta las veces que aparece una determinada letra en una frase
     * introducida por el teclado.
     */
    public static void diesiocho() {
        for (int i = 0;
                i <= 100; i = i + 2) {
            System.out.println(i);
        }
    }

    /**
     * Simulador de un reloj digital.
     */
    public static void diesinueve() {
        int suma = 0;
        for (int i = 0;
                i <= 100; i++) {
            suma = suma + i;
        }

        System.out.println(suma);
    }

    /**
     * Calula el factorial de un numero.
     */
    public static void veinte() {
        int impares = 0;
        for (int i = 1;
                i <= 100; i = i + 2) {
            impares = impares + 1;
            System.out.println(i);
        }

        System.out.println(impares);
    }

    /**
     * Calcula la suma de los pares e impares de los numeros entre 1 y 1000.
     */
    public static void veintiuno() {
        String numero;
        int limite;
        numero = JOptionPane.showInputDialog(null, "Escribe el numero final: ",
                "", -1);
        limite = Integer.parseInt(numero);
        int cont = 1;
        while (cont <= limite) {
            System.out.println(cont);
            cont++;
        }
    }
}