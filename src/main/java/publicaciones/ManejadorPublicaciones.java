/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publicaciones;

import java.util.ArrayList;

/**
 *
 * @author asm_1
 */
public class ManejadorPublicaciones {
    private ArrayList<Publicacion> publicaciones;
    
    public ManejadorPublicaciones() {
        this.publicaciones = new ArrayList<Publicacion>();
    }
    
    /**
     * Registra una nueva publicación dentro de la lista
     * @param publicacion 
     */
    public void agregarPublicacion(Publicacion publicacion) {
        this.publicaciones.add(publicacion);
    }
    
    /**
     * Obtiene una publicación de la lista
     * @param posicion posición en la cual se encuentra una publicación
     * @return Publicación alojada en la posición indicada
     */
    public Publicacion obtenerPublicacion(int posicion) {
        return this.publicaciones.get(posicion);
    }
    
    /**
     * Busca una publicación dentro de la lista de acuerdo a si ID de publicación
     * @param id_publicacion ID de la publicación a buscar
     * @return Posicion donde se encuentra el elemento con ese ID
     */
    public int buscarPublicacion(int id_publicacion) {
        int posicion = -1;
        int indice = 0;
        while (indice < this.publicaciones.size()){
            if(this.publicaciones.get(indice).getId_publicacion() == id_publicacion){
                posicion = indice;
                break;
            }
            indice++;
        }
        return posicion;
    }
    
    /**
     * Busca una publicación dentro de la lista tomando en cuenta el titulo de publicación
     * @param titulo Titulo de la publicación buscada
     * @return Arreglo que contiene la lista de coincidencias
     */
    public Publicacion[] buscarPublicacion(String titulo) {
        ArrayList<Publicacion> coincidencias = new ArrayList<Publicacion>();
        int indice = 0;
        while (indice < this.publicaciones.size()){
            if(this.publicaciones.get(indice).getTitulo().toLowerCase().contains(titulo.toLowerCase())){
                coincidencias.add(this.publicaciones.get(indice));
            }
            indice++;
        }

        Publicacion lista[] = new Publicacion[coincidencias.size()];

        indice = 0;
        while (indice < coincidencias.size()) {
            lista[indice] = coincidencias.get(indice);
            indice++;
        }
        return lista;
    }
    
    /**
     * Elimina un elemento de la lista de publicaciones
     * @param posicion Índice que tiene el elemento a eliminar
     */
    public void eliminarPublicacion(int posicion) {
        this.publicaciones.remove(posicion);
    }
    
    /**
     * Cambia la información de una publicación ya registrada en la lista
     * @param posicion Posición en la que se encuentra el elemento a editar
     * @param p Publicación con los nuevos valores a guardar
     */
    public void editarPublicacion(int posicion, Publicacion p) {
        this.publicaciones.set(posicion, p);
    }
    
    /**
     * Imprime la información completa de las publicaciones registradas en la lista
     */
    public void imprimirPublicaciones() {
        int indice = 0;
        
        if (this.publicaciones.size() == 0) {
            System.out.println("\nParece que no hay publicaciones");
        }

        while(indice < this.publicaciones.size()){
            Publicacion p = this.publicaciones.get(indice);
            if(p instanceof Libro){
                System.out.println("----Libro----");
                System.out.println("    ID publicación: " + p.getId_publicacion());
                System.out.println("    Titulo: " + p.getTitulo());
                System.out.println("    Precio: $" + p.getPrecio());
                System.out.println("    Número de Páginas: " + p.getNum_paginas());
                System.out.println("    ISBN: " + ((Libro) p).getISBN());
                System.out.println("    Edición: " + ((Libro) p).getEdicion());
                System.out.println("    Autor: " + ((Libro) p).getAutor());
                System.out.println("_____________");
            } 
            else if(p instanceof Periodico){
                System.out.println("----Periodico----");
                System.out.println("    ID publicación: " + p.getId_publicacion());
                System.out.println("    Titulo: " + p.getTitulo());
                System.out.println("    Precio: $" + p.getPrecio());
                System.out.println("    Número de Páginas: " + p.getNum_paginas());
                System.out.println("    Periodicidad: " + ((Periodico) p).getPeriodicidad());
                System.out.println("    Secciones: " + ((Periodico) p).getSecciones());
                System.out.println("    Editor: " + ((Periodico) p).getEditor());
                System.out.println("_________________");
            }
            else if(p instanceof Revista){
                System.out.println("----Revista----");
                System.out.println("    ID publicación: " + p.getId_publicacion());
                System.out.println("    Titulo: " + p.getTitulo());
                System.out.println("    Precio: $" + p.getPrecio());
                System.out.println("    Número de Páginas: " + p.getNum_paginas());
                System.out.println("    Periodicidad: " + ((Revista) p).getPeriodicidad());
                System.out.println("    ISSN: " + ((Revista) p).getISSN());
                System.out.println("    Número: " + ((Revista) p).getNumero());
                System.out.println("    Año: " + ((Revista) p).getAnio());
                System.out.println("_______________");
            }
            indice++;
        }
    }
    
    /**
     * Imprime la información completa de las publicaciones enviadas en el arreglo
     * @param publicaciones Arreglo que contiene las publicaciones a imprimir en pantalla
     */
    public void imprimirPublicaciones(Publicacion[] publicaciones) {
        int indice = 0;

        if (publicaciones.length == 0) {
            System.out.println("\nParece que no hay publicaciones");
        }

        while(indice < publicaciones.length){
            Publicacion p = publicaciones[indice];
            if(p instanceof Libro){
                System.out.println("----Libro----");
                System.out.println("    ID publicación: " + p.getId_publicacion());
                System.out.println("    Titulo: " + p.getTitulo());
                System.out.println("    Precio: $" + p.getPrecio());
                System.out.println("    Número de Páginas: " + p.getNum_paginas());
                System.out.println("    ISBN: " + ((Libro) p).getISBN());
                System.out.println("    Edición: " + ((Libro) p).getEdicion());
                System.out.println("    Autor: " + ((Libro) p).getAutor());
                System.out.println("_____________");
            } 
            else if(p instanceof Periodico){
                System.out.println("----Periodico----");
                System.out.println("    ID publicación: " + p.getId_publicacion());
                System.out.println("    Titulo: " + p.getTitulo());
                System.out.println("    Precio: $" + p.getPrecio());
                System.out.println("    Número de Páginas: " + p.getNum_paginas());
                System.out.println("    Periodicidad: " + ((Periodico) p).getPeriodicidad());
                System.out.println("    Secciones: " + ((Periodico) p).getSecciones());
                System.out.println("    Editor: " + ((Periodico) p).getEditor());
                System.out.println("_________________");
            }
            else if(p instanceof Revista){
                System.out.println("----Revista----");
                System.out.println("    ID publicación: " + p.getId_publicacion());
                System.out.println("    Titulo: " + p.getTitulo());
                System.out.println("    Precio: $" + p.getPrecio());
                System.out.println("    Número de Páginas: " + p.getNum_paginas());
                System.out.println("    Periodicidad: " + ((Revista) p).getPeriodicidad());
                System.out.println("    ISSN: " + ((Revista) p).getISSN());
                System.out.println("    Número: " + ((Revista) p).getNumero());
                System.out.println("    Año: " + ((Revista) p).getAnio());
                System.out.println("_______________");
            }
            indice++;
        }
    }
    
    /**
     * Imprime la información completa de una publicación
     * @param p publicación a imprimir en pantalla
     */
    public void imprimirPublicaciones(Publicacion p) {
        if(p instanceof Libro){
            System.out.println("----Libro----");
            System.out.println("    ID publicación: " + p.getId_publicacion());
            System.out.println("    Titulo: " + p.getTitulo());
            System.out.println("    Precio: $" + p.getPrecio());
            System.out.println("    Número de Páginas: " + p.getNum_paginas());
            System.out.println("    ISBN: " + ((Libro) p).getISBN());
            System.out.println("    Edición: " + ((Libro) p).getEdicion());
            System.out.println("    Autor: " + ((Libro) p).getAutor());
            System.out.println("_____________");
        } 
        else if(p instanceof Periodico){
            System.out.println("----Periodico----");
            System.out.println("    ID publicación: " + p.getId_publicacion());
            System.out.println("    Titulo: " + p.getTitulo());
            System.out.println("    Precio: $" + p.getPrecio());
            System.out.println("    Número de Páginas: " + p.getNum_paginas());
            System.out.println("    Periodicidad: " + ((Periodico) p).getPeriodicidad());
            System.out.println("    Secciones: " + ((Periodico) p).getSecciones());
            System.out.println("    Editor: " + ((Periodico) p).getEditor());
            System.out.println("_________________");
        }
        else if(p instanceof Revista){
            System.out.println("----Revista----");
            System.out.println("    ID publicación: " + p.getId_publicacion());
            System.out.println("    Titulo: " + p.getTitulo());
            System.out.println("    Precio: $" + p.getPrecio());
            System.out.println("    Número de Páginas: " + p.getNum_paginas());
            System.out.println("    Periodicidad: " + ((Revista) p).getPeriodicidad());
            System.out.println("    ISSN: " + ((Revista) p).getISSN());
            System.out.println("    Número: " + ((Revista) p).getNumero());
            System.out.println("    Año: " + ((Revista) p).getAnio());
            System.out.println("_______________");
        }
    }
}
