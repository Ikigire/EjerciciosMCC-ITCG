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
public abstract class Publicacion {
    private int id_publicacion;
    private String titulo;
    private float precio;
    private int num_paginas;

    public Publicacion(int id_publicacion, String titulo, float precio, int num_paginas) {
        this.id_publicacion = id_publicacion;
        this.titulo = titulo;
        this.precio = precio;
        this.num_paginas = num_paginas;
    }
    
    public Publicacion(int id_publicacion){
        this.id_publicacion = id_publicacion;
    }

    public int getId_publicacion() {
        return id_publicacion;
    }

    public void setId_publicacion(int id_publicacion) {
        this.id_publicacion = id_publicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getNum_paginas() {
        return num_paginas;
    }

    public void setNum_paginas(int num_paginas) {
        this.num_paginas = num_paginas;
    }
}