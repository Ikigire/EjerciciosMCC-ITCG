/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

import java.util.Scanner;

/**
 *
 * @author asm_1
 */
public class Ejercicio9Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner reader = new Scanner(System.in);
        String palabra1, palabra2;
        char respuesta = 's';

        System.out.println("Hola, bienvenido al buscador de anagramas");
        do {
            System.out.print("\n\nPara comenzar ingresa una palabra: ");
            palabra1 = reader.nextLine();
            System.out.print("\nAhora ingresa otra palabra para analizar si en un anagrama de la primera: ");
            palabra2 = reader.nextLine();

            if (StringOperations.esAnagrama(palabra1, palabra2)) {
                System.out.println("\n\nLa palabra \"" + palabra2 + "\" es un anagrama de la palabra \"" + palabra1 + "\"");
            } else {
                System.out.println("\n\nLa palabra \"" + palabra2 + "\" NO es un anagrama de la palabra \"" + palabra1 + "\"");
            }

            do {
                Thread.sleep(3000);
                System.out.print("\n\n¿Deseas intentarlo de nuevo?\ns) Si, hacerlo de nuevo\nn) No, deseo salir\nTu repuesta: ");
                respuesta = reader.nextLine().trim().toLowerCase().charAt(0);

                if (respuesta != 's' && respuesta != 'n') {
                    System.out.println("\nEsa no es una opción");
                }
            } while (respuesta != 's' && respuesta != 'n');
        } while (respuesta == 's');

        reader.close();
    }
}
