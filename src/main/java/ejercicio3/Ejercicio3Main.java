/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author asm_1
 */
public class Ejercicio3Main {
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String entrada;
        int numero = 0, suma_divisores = 0, contador = 1;
        
        System.out.println("Bienvenido a la calculadora de números perfectos:");

        do{
            try {
                System.out.print("\nPara comenzar necesitamos el ingreso de un número: ");
                entrada = lector.nextLine();
                numero = Integer.parseInt(entrada);

                if (numero < 0) {
                    System.out.println("El número debe ser mayor a 0");
                }
            } catch (Exception e) {
                System.out.println("\nDebe ingresar un número y este debe ser mayor a 0");
            }
        }   while(numero <= 0);
        
        while(contador < numero) {
            if(numero % contador == 0){
                suma_divisores+= contador;
            }

            contador++;
        }

        if(suma_divisores == numero){
            System.out.println("\nEl número " + numero + " es un NÚMERO PREFECTO" );
        } else {
            System.out.println("\nEl número " + numero + " NO es un NÚMERO PREFECTO" );
        }

        lector.close();
    }
}
