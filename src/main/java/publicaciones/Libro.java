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
public class Libro extends Publicacion{
    private String ISBN;
    private String edicion;
    private String autor;

    public Libro(String ISBN, String edicion, String autor, int id_publicacion, String titulo, float precio, int num_paginas) {
        super(id_publicacion, titulo, precio, num_paginas);
        this.ISBN = ISBN;
        this.edicion = edicion;
        this.autor = autor;
    }

    public Libro(int id_publicacion) {
        super(id_publicacion);
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}