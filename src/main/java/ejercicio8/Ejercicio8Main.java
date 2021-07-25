/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

import java.util.Scanner;

/**
 *
 * @author asm_1
 */
public class Ejercicio8Main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int opcion = 0;
        String jugador = "";

        System.out.println(JuegoNumeros.SALUDO_STRING);
        
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println("XXXX Ocurrio un error XXXX");
        }
        
        System.out.print("\nPor favor ingresa tu nombre para iniciar: ");
        jugador = lector.nextLine();
        
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println("XXXX Ocurrio un error XXXX");
        }
        
        do {
            try {
                System.out.print("\n\nBienvenid@ " + jugador + ", este es el juego de adivinar números\n\n¿Cómo deseas jugar?\n1) Yo Adivino el número\n2) El ordenador adivina el número\n3) Salir, ya tuve suficiente\nTú respuesta: ");
                opcion = Integer.parseInt(lector.nextLine().trim());
                switch (opcion) {
                    case 1:
                        JuegoNumeros.humanoVSComputadora(jugador);
                        break;
                    
                    case 2:
                        JuegoNumeros.computadoraVSHumano(jugador);
                        break;

                    case 3:
                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n" + JuegoNumeros.DESPEDIDA_STRING);    
                        break;
                
                    default:
                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n" + JuegoNumeros.OPCION_DESCONOCIDA_STRING);
                        try {
                            Thread.sleep(2000);
                        } catch (Exception e) {
                            System.out.println("XXXX Ocurrio un error XXXX");
                        }
                        break;
                }
            } catch (Exception e) {
                opcion = 0;
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n" + JuegoNumeros.ERROR_STRING);
            }
        } while (opcion != 3);
        lector.close();
    }
}
