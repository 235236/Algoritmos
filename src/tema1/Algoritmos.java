package tema1;

/**
 *
 * @author David Alberto Torres Real 235236 Tema 1 de la tarea 52 Algoritmos
 * @version 1.0
 */
public class Algoritmos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
        //int suma = 0;
        for (int i = 0; i <= 100; i++) {
            suma = suma + i;
        }
        System.out.println(suma);
    }

}
