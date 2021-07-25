/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publicaciones;

/**
 *
 * @author asm_1
 */
public class PublicacionPeriodica extends Publicacion {
    private String periodicidad;

    public PublicacionPeriodica(String periodicidad, int id_publicacion, String titulo, float precio, int num_paginas) {
        super(id_publicacion, titulo, precio, num_paginas);
        this.periodicidad = periodicidad;
    }

    public PublicacionPeriodica(int id_publicacion) {
        super(id_publicacion);
    }

    public String getPeriodicidad() {
        return periodicidad;
    }

    public void setPeriodicidad(String periodicidad) {
        this.periodicidad = periodicidad;
    }
}