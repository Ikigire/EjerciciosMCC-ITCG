/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

/**
 *
 * @author asm_1
 */
public class FuncionesString {
    public static int getCantidadVocales(String texto){
        //Preparación de la cadena de texto para trabajar solo minúsculas
        texto = texto.toLowerCase();

        //Removiendo todos los caracteres no necesarios y los espacios
        texto = texto.replaceAll("[bcdfghjklmnñpqrstvyz ]", "");
    
        return texto.length();
    }

    public static int getCantidadConsonantes(String texto){
        //Preparación de la cadena de texto para trabajar solo minúsculas
        texto = texto.toLowerCase();

        //Removiendo todos los caracteres no necesarios y los espacios
        texto = texto.replaceAll("[aeiou ]", "");
        
        return texto.length();
    }
}
