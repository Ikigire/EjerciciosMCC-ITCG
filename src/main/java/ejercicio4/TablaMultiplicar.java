/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.util.ArrayList;

/**
 *
 * @author asm_1
 */
public class TablaMultiplicar {
    public static ArrayList<int[]> calcularTabla(int numero, int inicia, int termina){
        ArrayList<int[]> tabla = new ArrayList<int[]>();
        int contador = inicia;

        while(contador <= termina){
            tabla.add(new int [] {numero, contador, numero*contador});
            contador++;
        }
        return tabla;
    }
    
    public static void imprimirTabla(ArrayList<int[]> tabla) {
        int indice = 0;
        int [] resultado;

        System.out.println("\n\nLa tabla de multiplicar solicitada es:\n\n");
        while(indice < tabla.size()){
            resultado = tabla.get(indice);
            System.out.println(resultado[0] + " X " + resultado[1] + " = " + resultado[2]);
            indice++;
        }
    }
}
