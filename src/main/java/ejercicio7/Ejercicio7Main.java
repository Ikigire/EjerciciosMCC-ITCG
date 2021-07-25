/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

import java.util.Scanner;

/**
 *
 * @author asm_1
 */
public class Ejercicio7Main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String texto = "";
        
        System.out.println("Bienvenido al analizador de cadenas de texto. por favor ingrese 10 números:\n");

        System.out.println("Para iniciar ingresa un texto: ");
        texto = lector.nextLine();

        System.out.println("\n\nRESULTADOS///////////////");
        System.out.println("\nLa cadena de texto ingresada tiene " + FuncionesString.getCantidadVocales(texto) + " vocales.");
        System.out.println("\nLa cadena de texto ingresada tiene " + FuncionesString.getCantidadConsonantes(texto) + " consonantes.");
        System.out.println("\nLa cadena de texto tiene una logitud de " + texto.length() + " caracteres.");

        lector.close();
    }
}
