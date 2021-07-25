/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author asm_1
 */
public class Funciones {
    public static boolean esNumeroPrimo(int numero){
        boolean es_primo = true;
        int contador = 2;

        while (es_primo && contador < numero){
            if(numero % contador == 0){
                es_primo = false;
            }
            contador++;
        }
        
        return es_primo;
    }

    public static int[] solicitarNumeros(int cantidad){
        Scanner lector = new Scanner(System.in);
        int [] numeros = new int[cantidad];
        int contador = 0, numero = 0;

        while(contador < cantidad){
            do{
                try {
                    System.out.print("\nIngresa un número: ");
                    numero = Integer.parseInt(lector.nextLine());
    
                    if (numero < 0) {
                        System.out.println("El número debe ser mayor a 0");
                    }
                } catch (Exception e) {
                    System.out.println("\nDebe ingresar un número y este debe ser mayor a 0");
                }
            }   while(numero <= 0);
            numeros[contador] = numero;
            contador++;
        }

        lector.close();
        return numeros;
    }
}
