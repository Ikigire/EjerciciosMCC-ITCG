/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

/**
 *
 * @author asm_1
 */
public class Funciones {
    /**
     * Método para corregir un string que representa una operación matemática simple
     * @param operacion String que contiene la operación matemática
     * @param a_resolver Booleano que indica si se debe corregir para resolver = true o no - false
     * @return operación corregida sin errores
     */
    public static String corregirOperacion(String operacion, boolean a_resolver){
        String operadores = "";
        String numeros [] = operacion.replace('-', ' ').replaceAll("[/*+]", " ").split("[ ]");
        
        operadores = operacion.replaceAll("[1234567890.]", "");
        
        if (operadores.length() >= numeros.length -1) {
            int i = 0;
            if (!a_resolver) {
                while (i < operacion.length() - 1){
                    if (!Character.isDigit(operacion.charAt(i)) && !Character.isDigit(operacion.charAt(i+1)) && operacion.charAt(i+1)!= '.') {
                        String buscar = "" + operacion.charAt(i) + operacion.charAt(i+1);
                        String remplazo = "" + operacion.charAt(i+1);
                            operacion = operacion.replace(buscar, remplazo);
                            operadores = operacion.replaceAll("[1234567890.]", "");
                    }
                    i++;
                }
            } else {
                operacion = operacion.substring(0, operacion.length() -1);
                operadores = operacion.replaceAll("[1234567890.]", "");
            }
        }
        
        String []numeros_validos = new String[numeros.length];
        for (int i=0; i<numeros.length; i++){
            String numero = numeros[i];
            
            String dots = numero.replaceAll("[1234567890/*-+]", "");
            
            if (!a_resolver && dots.length() > 1){
                int last_dot_index = numero.lastIndexOf(".");
                numero = numero.substring(0, last_dot_index);
            } 
            else if (a_resolver && dots.length() > 0){
                if (numero.split("[.]").length != 2){
                    numero = numero.substring(0, numero.length()-1);
                }
            }
            
            numeros_validos[i] = numero;
        }
        
        String operacion_corregida = "";
        int longitud = operadores.length() > numeros.length ? operadores.length() : numeros.length;
        
        for (int i=0; i<longitud; i++) {
            try{
                operacion_corregida += numeros_validos[i];
            } catch(Exception e) {}
            try{
                operacion_corregida += operadores.charAt(i);
            } catch(Exception e) {}
        }
        
        return operacion_corregida;
    }
    
    /**
     * Método recursivo para la solución de una operación matemática
     * @param operacion String con la operación matemática a realizar
     * @return el resultado final de realizar la operación
     */
    public static double resolverOperacion(String operacion){
        double resultado = 0;
        String operadores = operacion.replaceAll("[1234567890.! ]", "");
        String numeros [] = operacion.replace('-', ' ').replaceAll("[/*+]", " ").split("[ ]");
        if (operadores.length() == 0){
            if (operacion.contains("!")) {
                operacion = operacion.replace('!', '-');
            } 
            return Double.parseDouble(operacion);
        }
        
        int i = 0;
        int operacion_a_realizar = 0;

        while (i<operadores.length()) {
            if (operadores.charAt(i) == '*' || operadores.charAt(i) == '/'){
                operacion_a_realizar = i;
                break;
            }
            i++;
        }
        String numero1 = numeros[operacion_a_realizar], numero2 = numeros[operacion_a_realizar +1];

        if (numero1.contains("!")) {
            numero1 = numero1.replace('!', '-');
        } 
        if (numero2.contains("!")) {
            numero2 = numero1.replace('!', '-');
        }
        switch (operadores.charAt(operacion_a_realizar)){
            case '+':
                resultado = Double.parseDouble(numero1) + Double.parseDouble(numero2);
                break;
                
            case '-':
                resultado = Double.parseDouble(numero1) - Double.parseDouble(numero2);
                break;
                
            case '*':
                resultado = Double.parseDouble(numero1) * Double.parseDouble(numero2);
                break;
                
            case '/':
                if (Double.parseDouble(numero2) == 0){
                     return 0;
                }
                resultado = Double.parseDouble(numero1) / Double.parseDouble(numero2);
                break;
        }

        String buscar = numeros[operacion_a_realizar] + operadores.charAt(operacion_a_realizar) + numeros[operacion_a_realizar +1];
        String remplazo;
        if (resultado < 0){
            remplazo = Double.toString(resultado).replace('-', '!');
        } else{
            remplazo = Double.toString(resultado);
        }

        operacion = operacion.replace(buscar, remplazo);
        return resolverOperacion(operacion);
    }
}
