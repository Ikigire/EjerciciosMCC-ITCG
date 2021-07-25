/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publicaciones;

import java.util.Scanner;

/**
 *
 * @author asm_1
 */
public class PublicacionMainClass {
    public static void main(String[] args) throws InterruptedException {
        ManejadorPublicaciones mp = new ManejadorPublicaciones();
        Scanner reader = new Scanner(System.in);
        boolean repetir = false;
        Publicacion p = new Libro(-1);
        int opcion = 0, id_publicacion = 0, posicion = -1;
        char respuesta = 'n';
        String entrada = "";

        System.out.println("Bienvenido al Registro de Publicaciones");

        do{
            repetir = false;
            try {
                System.out.print("\n");
            } catch (Exception e) {
                System.out.println("");
                repetir = true;
            }
        }while (repetir);
        

        do {
            do {
                repetir = false;
                try {
                    System.out.print("\n\n¿Qué opción deseas realizar?\n1) Dar de alta una publicación\n2) Consultar publicaciones\n3) Editar una publicación\n4) Dar de baja una publicación\n5) Salir\nTú respuesta: ");
                    opcion = Integer.parseInt(reader.nextLine().trim());
                } catch (Exception e) {
                    System.out.println("Ese no es un número");
                    repetir = true;
                }
            } while (repetir);

            switch (opcion) {
                /**
                 *     ___________________________________
                 *    /                                  /
                 *   /   DAR DE ALTA UNA PUBLICACIÓN    /
                 *  /__________________________________/
                 * /
                 */
                case 1:
                    do{
                        repetir = false;
                        try {
                            System.out.print("\nPara iniciar ingrea el ID de publicación (número entero): ");
                            id_publicacion = Integer.parseInt(reader.nextLine().trim());
                        } catch (Exception e) {
                            System.out.println("Ingrese un número entero por favor\n");
                            repetir = true;
                        }

                        if (mp.buscarPublicacion(id_publicacion) >= 0){
                            repetir = true;
                            System.out.println("\nEse ID de publicación ya fue registrado.\nPor favor ingresa otro ID\n");
                        } else {
                            do{
                                repetir = false;
                                try {
                                    System.out.print("\n¿De qué tipo es la publicación?\n1) Libro\n2) Periodico\n3) Revista\nTu respuesta:");
                                    opcion = Integer.parseInt(reader.nextLine().trim());

                                    if (opcion < 1 || opcion > 3) {
                                        System.out.println("\nPor favor ingresa una opción válida\n");
                                    }
                                } catch (Exception e) {
                                    System.out.println("Ingresa el número de la opción a elegir");
                                    repetir = true;
                                }
                            }while (repetir || (opcion < 1 || opcion > 3));

                            System.out.println("Por favor ingresa la siguiente información");

                            switch (opcion) {
                                /**
                                 *   ___________
                                 *  /  LIBRO   /
                                 * /__________/
                                 */
                                case 1:
                                    p = new Libro(id_publicacion);
                                    
                                    System.out.print("\n\nTitulo: ");
                                    p.setTitulo(reader.nextLine());

                                    do{
                                        repetir = false;
                                        try {
                                            System.out.print("\n\nPrecio: $");
                                            p.setPrecio(Float.parseFloat(reader.nextLine().trim()));
                                        } catch (Exception e) {
                                            System.out.println("Ese no es un número");
                                            repetir = true;
                                        }
                                    }while (repetir);

                                    do{
                                        repetir = false;
                                        try {
                                            System.out.print("\n\nNúmero de Páginas: ");
                                            p.setNum_paginas(Integer.parseInt(reader.nextLine().trim()));
                                        } catch (Exception e) {
                                            System.out.println("Ese no es un número");
                                            repetir = true;
                                        }
                                    }while (repetir);

                                    System.out.print("\n\nISBN: ");
                                    ((Libro) p).setISBN(reader.nextLine().trim());

                                    System.out.print("\n\nEdición: ");
                                    ((Libro) p).setEdicion(reader.nextLine());

                                    System.out.print("\n\nAutor: ");
                                    ((Libro) p).setAutor(reader.nextLine());
                                    break;

                                /**
                                 *   _______________
                                 *  /  PERIODICO   /
                                 * /______________/
                                 */
                                case 2:
                                    p = new Periodico(id_publicacion);
                                    System.out.print("\n\nTitulo: ");
                                    p.setTitulo(reader.nextLine());

                                    do{
                                        repetir = false;
                                        try {
                                            System.out.print("\n\nPrecio: $");
                                            p.setPrecio(Float.parseFloat(reader.nextLine().trim()));
                                        } catch (Exception e) {
                                            System.out.println("Ese no es un número");
                                            repetir = true;
                                        }
                                    }while (repetir);

                                    do{
                                        repetir = false;
                                        try {
                                            System.out.print("\n\nNúmero de Páginas: ");
                                            p.setNum_paginas(Integer.parseInt(reader.nextLine().trim()));
                                        } catch (Exception e) {
                                            System.out.println("Ese no es un número");
                                            repetir = true;
                                        }
                                    }while (repetir);

                                    System.out.print("\n\nPeriodicidad: ");
                                    ((Periodico) p).setPeriodicidad(reader.nextLine());

                                    System.out.print("\n\nSecciones: ");
                                    ((Periodico) p).setSecciones(reader.nextLine());

                                    System.out.print("\n\nEditor: ");
                                    ((Periodico) p).setEditor(reader.nextLine());
                                    break;

                                /**
                                 *   _____________
                                 *  /  REVISTA   /
                                 * /____________/
                                 */
                                case 3:
                                    p = new Revista(id_publicacion);
                                    System.out.print("\n\nTitulo: ");
                                    p.setTitulo(reader.nextLine());

                                    do{
                                        repetir = false;
                                        try {
                                            System.out.print("\n\nPrecio: $");
                                            p.setPrecio(Float.parseFloat(reader.nextLine().trim()));
                                        } catch (Exception e) {
                                            System.out.println("Ese no es un número");
                                            repetir = true;
                                        }
                                    }while (repetir);

                                    do{
                                        repetir = false;
                                        try {
                                            System.out.print("\n\nNúmero de Páginas: ");
                                            p.setNum_paginas(Integer.parseInt(reader.nextLine().trim()));
                                        } catch (Exception e) {
                                            System.out.println("Ese no es un número");
                                            repetir = true;
                                        }
                                    }while (repetir);

                                    System.out.print("\n\nPeriodicidad: ");
                                    ((Revista) p).setPeriodicidad(reader.nextLine().trim());

                                    System.out.print("\n\nISSN: ");
                                    ((Revista) p).setISSN(reader.nextLine().trim());

                                    do{
                                        repetir = false;
                                        try {
                                            System.out.print("\n\nNúmero: ");
                                            ((Revista) p).setNumero(Integer.parseInt(reader.nextLine().trim()));
                                        } catch (Exception e) {
                                            System.out.println("Ese no es un número");
                                            repetir = true;
                                        }
                                    }while (repetir);

                                    do{
                                        repetir = false;
                                        try {
                                            System.out.print("\n\nAño: ");
                                            ((Revista) p).setAnio(Integer.parseInt(reader.nextLine().trim()));
                                        } catch (Exception e) {
                                            System.out.println("Ese no es un número");
                                            repetir = true;
                                        }
                                    }while (repetir);
                                    break;
                            }
                            mp.agregarPublicacion(p);
                        }
                    }while (repetir);
                    break;

                /**
                 *     ________________________________________
                 *    /                                       /
                 *   /   HACER CONSULTAS EN PUBLICACIONES    /
                 *  /_______________________________________/
                 * /
                 */
                case 2:
                    do{
                        repetir = false;
                        try {
                            System.out.print("\n¿Qué tipo de consulta deseas hacer?\n1) Por ID de publicación\n2) Por Titulo\n3) Consulta general\nTu respuesta:");
                            opcion = Integer.parseInt(reader.nextLine().trim());

                            if (opcion < 1 || opcion > 3) {
                                System.out.println("\nPor favor ingresa una opción válida\n");
                            }
                        } catch (Exception e) {
                            System.out.println("Ingresa el número de la opción a elegir");
                            repetir = true;
                        }
                    }while (repetir || (opcion < 1 || opcion > 3));

                    switch (opcion) {
                        /**
                         *   _____________________
                         *  /  CONSULTA POR ID   /
                         * /____________________/
                         */
                        case 1:
                            do{
                                repetir = false;
                                try {
                                    System.out.print("\nPara iniciar ingrea el ID de publicación (número entero): ");
                                    id_publicacion = Integer.parseInt(reader.nextLine().trim());
                                } catch (Exception e) {
                                    System.out.println("Ingrese un número entero por favor\n");
                                    repetir = true;
                                }
                            }while(repetir);

                            posicion = mp.buscarPublicacion(id_publicacion);

                            if (posicion >= 0){
                                p = mp.obtenerPublicacion(posicion);
                                System.out.println("\n\n_________Publicación_________");
                                mp.imprimirPublicaciones(p);
                            } else{
                                System.out.println("\nEse ID de publicación no ha sido registrado.\n");
                            }
                            break;
                    
                        /**
                         *   _________________________
                         *  /  CONSULTA POR TITULO   /
                         * /________________________/
                         */
                        case 2:
                            System.out.print("\n\nPalabra o frase clave: ");
                            Publicacion [] coincidencias = mp.buscarPublicacion(reader.nextLine());
                            System.out.println("\n\n_________Publicaciones que coinciden_________");
                            mp.imprimirPublicaciones(coincidencias);
                            break;
                        
                        /**
                         *   ______________________
                         *  /  CONSULTA GENERAL   /
                         * /_____________________/
                         */
                        case 3:
                            System.out.println("\n\n_________Publicaciones_________");
                            mp.imprimirPublicaciones();
                            break;
                    }
                    break;

                /**
                 *     ______________________________
                 *    /                             /
                 *   /   EDITAR UNA PUBLICACION    /
                 *  /_____________________________/
                 * /
                 */
                case 3:
                    do{
                        repetir = false;
                        try {
                            System.out.print("\nPara iniciar ingrea el ID de publicación (número entero): ");
                            id_publicacion = Integer.parseInt(reader.nextLine().trim());
                        } catch (Exception e) {
                            System.out.println("Ingrese un número entero por favor\n");
                            repetir = true;
                        }
                    }while(repetir);

                    posicion = mp.buscarPublicacion(id_publicacion);

                    if (posicion >= 0){
                        System.out.println("\nPor favor ingresa la siguiente información\nRecuerda que puedes dar enter si no quieres editar la información\n");

                        Thread.sleep(3000);
                        p = mp.obtenerPublicacion(posicion);

                        /**
                         *   ___________
                         *  /  LIBRO   /
                         * /__________/
                         */
                        if (p instanceof Libro) {
                            System.out.print("\n\nTitulo: " + p.getTitulo() + "\nNuevo Titulo:");
                            entrada = reader.nextLine();
                            if (!entrada.trim().equals(""))
                                p.setTitulo(entrada);

                            do{
                                repetir = false;
                                try {
                                    System.out.print("\n\nPrecio: $" + p.getPrecio() + "\nNuevo Precio: $");
                                    entrada = reader.nextLine();
                                    if (!entrada.trim().equals(""))
                                        p.setPrecio(Float.parseFloat(entrada.trim()));
                                } catch (Exception e) {
                                    System.out.println("Ese no es un número");
                                    repetir = true;
                                }
                            }while (repetir);

                            do{
                                repetir = false;
                                try {
                                    System.out.print("\n\nNúmero de Páginas: " + p.getNum_paginas() + "\nNuevo Número de Páginas: ");
                                    entrada = reader.nextLine();
                                    if (!entrada.trim().equals(""))
                                        p.setNum_paginas(Integer.parseInt(entrada.trim()));
                                } catch (Exception e) {
                                    System.out.println("Ese no es un número");
                                    repetir = true;
                                }
                            }while (repetir);

                            System.out.print("\n\nISBN: " + (((Libro) p).getISBN()) + "\nNuevo ISBN: ");
                            entrada = reader.nextLine();
                            if (!entrada.trim().equals(""))
                                ((Libro) p).setISBN(entrada.trim());

                            System.out.print("\n\nEdición: " + (((Libro) p).getEdicion()) + "\nNueva Edición: ");
                            entrada = reader.nextLine();
                            if (!entrada.trim().equals(""))
                                ((Libro) p).setEdicion(entrada);

                            System.out.print("\n\nAutor: " + (((Libro) p).getAutor()) + "\nNuevo Autor: ");
                            entrada = reader.nextLine();
                            if (!entrada.trim().equals(""))
                                ((Libro) p).setAutor(entrada);
                        }
                        /**
                         *   _______________
                         *  /  PERIODICO   /
                         * /______________/
                         */
                        else if (p instanceof Periodico) {
                            System.out.print("\n\nTitulo: " + p.getTitulo() + "\nNuevo Titulo:");
                            entrada = reader.nextLine();
                            if (!entrada.trim().equals(""))
                                p.setTitulo(entrada);

                            do{
                                repetir = false;
                                try {
                                    System.out.print("\n\nPrecio: $" + p.getPrecio() + "\nNuevo Precio: $");
                                    entrada = reader.nextLine();
                                    if (!entrada.trim().equals(""))
                                        p.setPrecio(Float.parseFloat(entrada.trim()));
                                } catch (Exception e) {
                                    System.out.println("Ese no es un número");
                                    repetir = true;
                                }
                            }while (repetir);

                            do{
                                repetir = false;
                                try {
                                    System.out.print("\n\nNúmero de Páginas: " + p.getNum_paginas() + "\nNuevo Número de Páginas: ");
                                    entrada = reader.nextLine();
                                    if (!entrada.trim().equals(""))
                                        p.setNum_paginas(Integer.parseInt(entrada.trim()));
                                } catch (Exception e) {
                                    System.out.println("Ese no es un número");
                                    repetir = true;
                                }
                            }while (repetir);

                            System.out.print("\n\nPeriodicidad: " + (((Periodico) p).getPeriodicidad()) + "\nNueva Periodicidad: ");
                            entrada = reader.nextLine();
                            if (!entrada.trim().equals(""))
                                ((Periodico) p).setPeriodicidad(entrada);

                            System.out.print("\n\nSecciones: " + (((Periodico) p).getSecciones()) + "\nNuevas Secciones: ");
                            entrada = reader.nextLine();
                            if (!entrada.trim().equals(""))
                                ((Periodico) p).setSecciones(entrada);

                            System.out.print("\n\nEditor: " + (((Periodico) p).getEditor()) + "\nNuevo Editor: ");
                            entrada = reader.nextLine();
                            if (!entrada.trim().equals(""))
                                ((Periodico) p).setEditor(entrada);
                        }
                        /**
                         *   _____________
                         *  /  REVISTA   /
                         * /____________/
                         */
                        else if (p instanceof Revista) {
                            System.out.print("\n\nTitulo: " + p.getTitulo() + "\nNuevo Titulo:");
                            entrada = reader.nextLine();
                            if (!entrada.trim().equals(""))
                                p.setTitulo(entrada);

                            do{
                                repetir = false;
                                try {
                                    System.out.print("\n\nPrecio: $" + p.getPrecio() + "\nNuevo Precio: $");
                                    entrada = reader.nextLine();
                                    if (!entrada.trim().equals(""))
                                        p.setPrecio(Float.parseFloat(entrada.trim()));
                                } catch (Exception e) {
                                    System.out.println("Ese no es un número");
                                    repetir = true;
                                }
                            }while (repetir);

                            do{
                                repetir = false;
                                try {
                                    System.out.print("\n\nNúmero de Páginas: " + p.getNum_paginas() + "\nNuevo Número de Páginas: ");
                                    entrada = reader.nextLine();
                                    if (!entrada.trim().equals(""))
                                        p.setNum_paginas(Integer.parseInt(entrada.trim()));
                                } catch (Exception e) {
                                    System.out.println("Ese no es un número");
                                    repetir = true;
                                }
                            }while (repetir);

                            System.out.print("\n\nPeriodicidad: " + (((Revista) p).getPeriodicidad()) + "\nNueva Periodicidad: ");
                            entrada = reader.nextLine();
                            if (!entrada.trim().equals(""))
                                ((Revista) p).setPeriodicidad(entrada.trim());

                            System.out.print("\n\nISSN: " + (((Revista) p).getISSN()) + "\nNuevo ISSN: ");
                            entrada = reader.nextLine();
                            if (!entrada.trim().equals(""))
                                ((Revista) p).setISSN(entrada.trim());

                            do{
                                repetir = false;
                                try {
                                    System.out.print("\n\nNúmero: " + (((Revista) p).getNumero()) + "\nNuevo Número: ");
                                    entrada = reader.nextLine();
                                    if (!entrada.trim().equals(""))
                                        ((Revista) p).setNumero(Integer.parseInt(entrada.trim()));
                                } catch (Exception e) {
                                    System.out.println("Ese no es un número");
                                    repetir = true;
                                }
                            }while (repetir);

                            do{
                                repetir = false;
                                try {
                                    System.out.print("\n\nAño: " + (((Revista) p).getAnio()) + "\nNuevo Año: ");
                                    entrada = reader.nextLine();
                                    if (!entrada.trim().equals(""))
                                        ((Revista) p).setAnio(Integer.parseInt(entrada.trim()));
                                } catch (Exception e) {
                                    System.out.println("Ese no es un número");
                                    repetir = true;
                                }
                            }while (repetir);
                        }

                        mp.editarPublicacion(posicion, p);
                        System.out.println("\nLa publicación fue editada con éxito\n");
                    } else{
                        System.out.println("\nEse ID de publicación no ha sido registrado.\n");
                    }
                    break;
            
                /**
                 *     __________________________________
                 *    /                                 /
                 *   /   ELIMINAR UNA PUBLICACIONES    /
                 *  /_________________________________/
                 * /
                 */
                case 4:
                    do{
                        repetir = false;
                        try {
                            System.out.print("\nPara iniciar ingrea el ID de publicación (número entero): ");
                            id_publicacion = Integer.parseInt(reader.nextLine().trim());
                        } catch (Exception e) {
                            System.out.println("Ingrese un número entero por favor\n");
                            repetir = true;
                        }
                    }while(repetir);
                    
                    posicion = mp.buscarPublicacion(id_publicacion);

                    if (posicion >= 0){
                        p = mp.obtenerPublicacion(posicion);
                        System.out.println("\n\n_________Publicación_________");
                        mp.imprimirPublicaciones(p);

                        do{
                            repetir = false;
                            
                            System.out.println("\n\n¿Realmente deseas eliminar la publicación?\ns) Si, eliminala\nn) No, cancela la eliminación\nTu respuesta: ");
                            respuesta = reader.nextLine().toLowerCase().trim().charAt(0);
                            if (respuesta != 's' && respuesta != 'n'){
                                repetir = true;
                                System.out.println("Ingresa una de las opciones mostradas");
                            }
                        }while (repetir);

                        if (respuesta == 's') {
                            mp.eliminarPublicacion(posicion);
                            System.out.println("\nLa publicación ha sido eliminada con éxito");
                        }
                    } else{
                        System.out.println("\nEse ID de publicación no ha sido registrado.\n");
                    }
                    break;

                /**
                 *     _____________________________
                 *    /                            /
                 *   /   SALIR DE LA EJECUCIÓN    /
                 *  /____________________________/
                 * /
                 */
                case 5:
                    System.out.println("     ____________\n    | Adios_____/\n    |/\n(＾_＾)/");
                    Thread.sleep(2000);
                    System.out.println("Realizado por Yael Alejandro Santana Michel");
                    break;

                default:
                    System.out.println("Esa no es una opción del menú.\n\nPor favor ingresa una opción válida.");
                    break;
            }
        } while (opcion != 5);

        reader.close();
    }
}
