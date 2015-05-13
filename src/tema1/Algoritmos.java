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
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        int opcion;
        String opc;
        opc = JOptionPane.showInputDialog(null, "Selecciona un algoritmo 1-15: "
                , "Algoritmos: Tema 1", -1);
        opcion = Integer.parseInt(opc);
        if (opcion == 1) {
            uno();
        } else if (opcion == 2) {
            dos();
        } else if (opcion == 3) {
            tres();
        } else if (opcion == 4) {
            cuatro();
        } else if (opcion == 5) {
            cinco();
        } else if (opcion == 6) {
            seis();
        } else if (opcion == 7) {
            siete();
        } else if (opcion == 8) {
            ocho();
        } else if (opcion == 9) {
            nueve();
        } else if (opcion == 10) {
            diez();
        } else if (opcion == 11) {
            once();
        } else if (opcion == 12) {
            doce();
        } else if (opcion == 13) {
            trece();
        } else if (opcion == 14) {
            catorce();
        } else if (opcion == 15) {
            quince();
        } else {
            JOptionPane.showMessageDialog(null, "Opción Invalida", "ERROR", -1);
        }
    }

    /**
     * Imprime los numeros del 1 al 100.
     *
     */
    public static void uno() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
    }

    /**
     * Imprime los numeros del 100 al 0 en orden descendente.
     */
    public static void dos() {
        for (int i = 100;
                i >= 0; i--) {
            System.out.println(i);
        }
    }

    /**
     * Imprime los numeros pares entre 0 y 100.
     */
    public static void tres() {
        for (int i = 0;
                i <= 100; i = i + 2) {
            System.out.println(i);
        }
    }

    /**
     * Imprime la suma de los 100 primeros numeros.
     */
    public static void cuatro() {
        int suma = 0;
        for (int i = 0;
                i <= 100; i++) {
            suma = suma + i;
        }

        System.out.println(suma);
    }

    /**
     * Imprime los numeros impares hasta el 100 y dice cuantos son.
     */
    public static void cinco() {
        int impares = 0;
        for (int i = 1;
                i <= 100; i = i + 2) {
            impares = impares + 1;
            System.out.println(i);
        }

        System.out.println(impares);
    }

    /**
     * Imprime todos los numeros naturales hasta un numero introducido por el
     * teclado.
     */
    public static void seis() {
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

    /**
     * Contador de frases introducidas por el teclado.
     */
    public static void siete() {
        String frase = "";
        String respuesta = "si";
        String res = "si";
        int contador = 0;
        while (respuesta.equalsIgnoreCase(res)) {
            frase = frase + JOptionPane.showInputDialog(null,
                    "Escribe una frase: ", "Entrada", -1) + " ";
            contador++;
            respuesta = JOptionPane.showInputDialog(null, "Desea seguir"
                    + " escribiendo frases: ", "", -1);
        }
        JOptionPane.showMessageDialog(null, "Total de frases escritas: "
                + contador + "\n\n" + "Frases escritas: \n" + frase, "", -1);
    }
    
    /**
     * Solo permite introducir S ó N.
     */
    public static void ocho() {
        String si = "S";
        String no = "N";
        String entrada = "S";
        while (entrada.equalsIgnoreCase(si) | entrada.equalsIgnoreCase(no)) {
            entrada = JOptionPane.showInputDialog(null, "Escribe S ó N: ", "",
                    -1);
        }
    }
    
    /**
     * Identifica si el numero introducido es positivo o negativo.
     */
    public static void nueve() {
        String num;
        int numero;
        num = JOptionPane.showInputDialog(null, "Escribe un numero: ", "", -1);
        numero = Integer.parseInt(num);
        if (numero >= 0) {
            JOptionPane.showMessageDialog(null, "Numero Positivo", "", -1);            
        } else {
            JOptionPane.showMessageDialog(null, "Numero Negativo", "", -1);
        }
    }
    
    /**
     * Idetifica si el numero introducido es par o impar.
     */
    public static void diez() {
        String num;
        int numero;
        num = JOptionPane.showInputDialog(null, "Escribe un numero: ", "", -1);
        numero = Integer.parseInt(num);
        if (numero == ((numero/2)*2)) {
            JOptionPane.showMessageDialog(null, "Es Par", "", -1);            
        } else {
            JOptionPane.showMessageDialog(null, "Es Impar", "", -1);
        }
    }
    
    /**
     * Imprime todos los numeros naturales hasta un numero introducido por el
     * teclado.
     */
    public static void once() {
        
    }
    
    /**
     * Imprime todos los numeros naturales hasta un numero introducido por el
     * teclado.
     */
    public static void doce() {
        
    }
    
    /**
     * Imprime todos los numeros naturales hasta un numero introducido por el
     * teclado.
     */
    public static void trece() {
        
    }
    
    /**
     * Imprime todos los numeros naturales hasta un numero introducido por el
     * teclado.
     */
    public static void catorce() {
        
    }
    
    /**
     * Imprime todos los numeros naturales hasta un numero introducido por el
     * teclado.
     */
    public static void quince() {
        
    }
}
