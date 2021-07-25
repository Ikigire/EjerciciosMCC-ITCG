/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author asm_1
 */
public class Ejercicio4Main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String entrada;
        int numero = 0, rango_inferior = 0, rango_superior = 0;
        ArrayList<int[]> tabla;
        
        System.out.println("Bienvenido al generador de tablas de multiplicación:");

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

        System.out.println("\nAhora ingrese el rango de la tabla de multiplicación");
        do{
            try {
                System.out.print("\nInicia en: ");
                entrada = lector.nextLine();
                rango_inferior = Integer.parseInt(entrada);

                if (rango_inferior < 0) {
                    System.out.println("El rango debe ser mayor a 0");
                }
            } catch (Exception e) {
                System.out.println("\nDebe ingresar un número y este debe ser mayor a 0");
            }
        }   while(rango_inferior <= 0);

        do{
            try {
                System.out.print("\nTermina en: ");
                entrada = lector.nextLine();
                rango_superior = Integer.parseInt(entrada);

                if (rango_superior < 0) {
                    System.out.println("El rango debe ser mayor a 0");
                }

                if(rango_inferior > rango_superior){
                    System.out.println("El número de terminación de la tabla debe ser mayor al número de inicio");
                }
            } catch (Exception e) {
                System.out.println("\nDebe ingresar un número y este debe ser mayor a 0");
            }
        }   while(rango_superior <= 0);

        tabla = TablaMultiplicar.calcularTabla(numero, rango_inferior, rango_superior);

        TablaMultiplicar.imprimirTabla(tabla);

        lector.close();
    }
}
