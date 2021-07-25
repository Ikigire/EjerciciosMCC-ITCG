/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

/**
 *
 * @author asm_1
 */
public class StringOperations {
    public static boolean esAnagrama(String palabra1, String palabra2){
        palabra1 = palabra1.toLowerCase().trim();
        palabra2 = palabra2.toLowerCase().trim();

        String cadena_restante = palabra1.replaceAll("[" + palabra2 + " ]", "");

        if (cadena_restante.length() == 0) {
            return true;
        } else {
            return false;
        }
    }
}
