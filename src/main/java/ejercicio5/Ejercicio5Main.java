/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

/**
 *
 * @author asm_1
 */
public class Ejercicio5Main {
    public static void main(String[] args) {
        int [] numeros;

        System.out.println("Bienvenido al identificador de números primos. por favcor ingrese 10 números:\n");

        numeros = Funciones.solicitarNumeros(10);

        for (int x = 0; x < numeros.length; x++) {
            if (Funciones.esNumeroPrimo(numeros[x])) {
                System.out.println("El número " + numeros[x] + " ubicado en la posición " + x + " es un Número Primo");
            }
        }
    }
}
