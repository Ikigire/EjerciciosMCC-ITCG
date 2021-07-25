/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author asm_1
 */
public class Ejercicio2Main {
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int numero = 0;
        
        System.out.println("Bienvenido al convertidor de números decimales a Binario, Octal y Hexadecimal:");

        do{
            try {
                System.out.print("\nPara comenzar ingresa un número: ");
                numero = Integer.parseInt(lector.nextLine());

                if (numero < 0) {
                    System.out.println("El número debe ser mayor a 0");
                }
            } catch (Exception e) {
                System.out.println("\nDebe ingresar un número y este debe ser mayor a 0");
            }
        }   while(numero <= 0);

        System.out.println("\n\nEl número ingresado es: " + numero);
        System.out.println("El número convertido a Binario es: " + decimalABinario(numero));
        System.out.println("El número convertido a Octal es: " + decimalAOctal(numero));
        System.out.println("El número convertido a Hexadecimal es: " + decimalAHexadecimal(numero));
        lector.close();
    }

    private static String decimalABinario(int numero) {
        return Integer.toBinaryString(numero);
    }

    private static String decimalAHexadecimal(int numero){
        return Integer.toHexString(numero);
    }

    private static String decimalAOctal(int numero){
        return Integer.toOctalString(numero);
    }
}
