package tema1;

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
     */
    public static void main(String[] args) throws IOException {
        /**
         * Imprime los numeros del 1 al 100.
         */
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }

        /**
         * Imprime los numeros del 100 al 0 en orden descendente.
         */
        for (int i = 100; i >= 0; i--) {
            System.out.println(i);
        }

        /**
         * Imprime los numeros pares entre 0 y 100.
         */
        for (int i = 0; i <= 100; i = i + 2) {
            System.out.println(i);
        }

        /**
         * Imprime la suma de los 100 primeros numeros.
         */
        int suma = 0;
        for (int i = 0; i <= 100; i++) {
            suma = suma + i;
        }
        System.out.println(suma);

        /**
         * Imprime los numeros impares hasta el 100 y dice cuantos son.
         */
        int impares = 0;
        for (int i = 1; i <= 100; i = i + 2) {
            impares = impares + 1;
            System.out.println(i);
        }
        System.out.println(impares);

        /**
         * Imprime todos los numeros naturales hasta un numero introducido por
         * el teclado.
         */
        String numero;
        int limite;
        numero = JOptionPane.showInputDialog(null, "Escribe el numero final: ",
                "Entrada de datos", -1);
        limite = Integer.parseInt(numero);
        int cont = 1;
        while (cont <= limite) {
            System.out.println(cont);
            cont++;
        }
    }

}