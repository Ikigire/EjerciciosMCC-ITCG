/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author asm_1
 */
public class Ejercicio1Main {
    
    public static void main(String args[]){
        Scanner lector = new Scanner(System.in);
        int numero_empleado = 0;
        String nombre_empleado, direccion_empleado, entrada;
        float salario_hora_empleado = 0;
        
        System.out.println("Bienvenido a la calculadora de salario:");
        System.out.println("\nPara comenzar necesitamos dar de alta al empleado.");

        do{
            try{
                System.out.print("\nIngrese el No. de empleado: ");
                entrada = lector.nextLine();
                numero_empleado = Integer.parseInt(entrada);
            }catch(Exception e){
                System.out.println("\nDebe ingresar un número y este debe ser mayor a 0");
            }
        }while (numero_empleado <= 0);
        
        
        System.out.print("\nIngrese el nombre del empleado: ");
        entrada = lector.nextLine();
        nombre_empleado = entrada;
        
        System.out.print("\nIngrese la dirección del empleado: ");
        entrada = lector.nextLine();
        direccion_empleado = entrada;
        
        do{
            try{
                System.out.print("\nIngrese el salario por hora del empleado: ");
                entrada = lector.nextLine();
                salario_hora_empleado = Float.parseFloat(entrada);
            }catch(Exception e){
                System.out.println("\nDebe ingresar un número y este debe ser mayor a 0");
            }
        }while (salario_hora_empleado <= 0);
        
        
        Empleado empleado = new Empleado(numero_empleado, nombre_empleado, direccion_empleado, salario_hora_empleado);
        
        System.out.println("\nAhora calculemos el salario a pagar al empleado.");
        System.out.print("\nIngrese la cantidad de horas trabajadas por el empleado: ");
        
        System.out.println("\nEl salario que deberá ser pagado al empleado:" + empleado.getNombre_empleado() + " es de: $" + empleado.calcularSalario(Integer.parseInt(lector.nextLine())));
        lector.close();
    }
    
    
}
