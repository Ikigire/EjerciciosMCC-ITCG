/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import java.util.Scanner;

/**
 *
 * @author asm_1
 */
public class Ejercicio6Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner reader = new Scanner(System.in);
        String romano;
        int numero;

        char respuesta = 's';

        System.out.println("Hola, bienvenido al convertidor de números romanos");
        do {
            System.out.print("\n\nPara comenzar ingresa un número romano: ");
            romano = reader.nextLine();

            numero = ConvertidorNumeros.romanoADecimal(romano);
            System.out.println("\n\nEl número \"" + romano + "\" es igual a: " + numero);

            do {
                try {
                    Thread.sleep(3000);
                    System.out.print("\n\n¿Deseas intentarlo de nuevo?\ns) Si, hacerlo de nuevo\nn) No, deseo salir\nTu repuesta: ");
                    respuesta = reader.nextLine().trim().toLowerCase().charAt(0);

                    if (respuesta != 's' && respuesta != 'n') {
                        System.out.println("\nEsa no es una opción");
                    }
                } catch (Exception e) {
                    System.out.println("\nNo ingresó nada\n\n");
                }
                
            } while (respuesta != 's' && respuesta != 'n');
        } while (respuesta == 's');

        reader.close();
    }
}
