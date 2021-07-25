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
public class Revista extends PublicacionPeriodica {
    private String ISSN;
    private int numero;
    private int anio;

    public Revista(String ISSN, int numero, int anio, String periodicidad, int id_publicacion, String titulo, float precio, int num_paginas) {
        super(periodicidad, id_publicacion, titulo, precio, num_paginas);
        this.ISSN = ISSN;
        this.numero = numero;
        this.anio = anio;
    }

    public Revista(int id_publicacion) {
        super(id_publicacion);
    }

    public String getISSN() {
        return ISSN;
    }

    public void setISSN(String ISSN) {
        this.ISSN = ISSN;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
}