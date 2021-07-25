/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author asm_1
 */
public class Empleado {
    //Definición de variables
    private int numero_empleado;
    private String nombre_empleado, direccion_empleado;
    private float salario_hora_empleado;
    
    public Empleado(){}
    
    public Empleado(int numero_empleado, String nombre_empleado, String direccion_empleado, float salario_hora_empleado){
        this.numero_empleado = numero_empleado;
        this.nombre_empleado = nombre_empleado;
        this.direccion_empleado = direccion_empleado;
        this.salario_hora_empleado = salario_hora_empleado;
    }

    public int getNumero_empleado() {
        return numero_empleado;
    }

    public void setNumero_empleado(int numero_empleado) {
        this.numero_empleado = numero_empleado;
    }

    public String getNombre_empleado() {
        return nombre_empleado;
    }

    public void setNombre_empleado(String nombre_empleado) {
        this.nombre_empleado = nombre_empleado;
    }

    public String getDireccion_empleado() {
        return direccion_empleado;
    }

    public void setDireccion_empleado(String direccion_empleado) {
        this.direccion_empleado = direccion_empleado;
    }

    public float getSalario_hora_empleado() {
        return salario_hora_empleado;
    }

    public void setSalario_hora_empleado(float salario_hora_empleado) {
        this.salario_hora_empleado = salario_hora_empleado;
    }
    
    /**
     * Método para calcular el salario de un empleado
     * @param horas_trabajadas Horas trabajadas por el empleado
     * @return Salario total a pagar al empleado por su trabajo
     */
    public float calcularSalario(int horas_trabajadas){
        return horas_trabajadas * this.salario_hora_empleado;
    }
}
