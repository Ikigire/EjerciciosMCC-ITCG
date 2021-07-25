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
public class Periodico extends PublicacionPeriodica {
    private String secciones;
    private String editor;

    public Periodico(String secciones, String editor, String periodicidad, int id_publicacion, String titulo, float precio, int num_paginas) {
        super(periodicidad, id_publicacion, titulo, precio, num_paginas);
        this.secciones = secciones;
        this.editor = editor;
    }

    public Periodico(int id_publicacion) {
        super(id_publicacion);
    }

    public String getSecciones() {
        return secciones;
    }

    public void setSecciones(String secciones) {
        this.secciones = secciones;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }
}