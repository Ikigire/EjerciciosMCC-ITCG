/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

import java.util.Scanner;

/**
 *
 * @author asm_1
 */
public class JuegoNumeros {
    static final String SALUDO_STRING = "     ____________\n    | Hola______/\n    |/\nヽ(^o^)丿"; 
    static final String DESPEDIDA_STRING = "     ____________\n    | Adios_____/\n    |/\n(＾_＾)/";
    static final String PENSANDO_STRING = "     ______________\n    | mmmm________/\n    |/\n(¯―¯٥)";
    static final String PERDI_STRING = "     _______________\n    | Yo Perdí_____/\n    |/\n(´-﹏-`；)";
    static final String GANE_STRING = "     ______________\n    | !Yo Gane¡___/\n    |/\n\\(≧▽≦)/";
    static final String AUN_NO_STRING = "     _______________\n    | No es ese____/\n    |/\n _(･ิω･ิ)_";
    static final String INICIEMOS_STRING = "     _______________\n    | Iniciemos____/\n    |/\n(/◕ヮ◕)/";
    static final String EMOCIONADO_STRING = "     ___________________\n    | Estoy emocionado_/\n    |/\n(๑˃̵ᴗ˂̵)ﻭ";
    static final String ERROR_STRING = "     ______________________\n    | Ese no es un número_/\n    |/\n(~_~メ)";
    static final String MAYOR_STRING = "     ________________\n    | Es mayor______/\n    |/\n(✿◠‿◠)_/¯";
    static final String MENOR_STRING = "       ________________\n      | Es menor______/\n      |/\n¯\\_(◠‿◠✿)";
    static final String OPCION_DESCONOCIDA_STRING = "       ___________________\n      | Esa no es opción_/\n      |/\n¯\\_(ツ)_/¯";
    static final String TRAMPA_STRING = "       ___________________\n      | !Hiciste trampa¡_/\n      |/\n(｡ŏ﹏ŏ)";

    public static void humanoVSComputadora(String jugador) throws InterruptedException{
        Scanner scanner = new Scanner(System.in);
        int numero = 0, numero_ganador, intentos = 0;
        numero_ganador = (int) (Math.random() * 100 + 1);

        Thread.sleep(2000);
        System.out.println(SALUDO_STRING + "\n" + jugador + " déjame pensar en un número\n" + PENSANDO_STRING);
        Thread.sleep(2000);

        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\nListo ya tengo mi número");
        System.out.println(EMOCIONADO_STRING);

        Thread.sleep(2000);
        System.out.println("\n\n\n\n" + INICIEMOS_STRING);
        Thread.sleep(2000);
        do {
            try {
                intentos++;
                System.out.println("\n\n\n\n\n\n\n\n\n\n('ㅂ') - Siempre puedes ingresar 0 para salir");
                System.out.print("\n('ㅅ') - ingresa el número que creas que pensé: ");
                numero = Integer.parseInt(scanner.nextLine().trim());

                if(numero == 0){
                    System.out.println("\n\n\n\n\n!Te rendiste¡\n\n" + GANE_STRING);
                }
                else if (numero == numero_ganador) {
                    Thread.sleep(1000);
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n!FELICIDADES " + jugador + ", Tú has ganado¡\n\nTe ha tomado " + intentos + " intentos adivinarlo");
                    Thread.sleep(2000);
                    System.out.println("\n" + PERDI_STRING);
                } 
                else if (numero_ganador > numero) {
                    System.out.println("\n\n\n\n" + AUN_NO_STRING);
                    Thread.sleep(1000);
                    System.out.println("\n\n\n\n" + MAYOR_STRING);
                } else {
                    System.out.println("\n\n\n\n" + AUN_NO_STRING);
                    Thread.sleep(1000);
                    System.out.println("\n\n\n\n" + MENOR_STRING);
                }
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n" + ERROR_STRING);
            }
        } while (numero != 0 && numero != numero_ganador);
        Thread.sleep(4000);
    }

    public static void computadoraVSHumano(String jugador) throws InterruptedException{
        Scanner scanner = new Scanner(System.in);
        char respuesta = '<';
        int numero_menor = 0, numero_mayor = 100, numero_calculado, intentos = 0;


        Thread.sleep(2000);
        System.out.println(SALUDO_STRING + "\n" + jugador + " piensa en un número entre 0 y 100");
        Thread.sleep(5000);

        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n¿Listo?");
        System.out.println(EMOCIONADO_STRING);

        Thread.sleep(2000);
        System.out.println("\n\n" + INICIEMOS_STRING);
        Thread.sleep(2000);
        do {
            intentos++;
            System.out.println("\n\n\n\n\n\n\n\n" + jugador + " déjame pensar\n" + PENSANDO_STRING);
            Thread.sleep(2000);
            numero_calculado = numero_menor + (numero_mayor - numero_menor) / 2;
            
            if (numero_mayor - numero_menor <= 1) {
                Thread.sleep(3000);
                System.out.println("\n\n\n\n!Es imposible¡\n\n" + TRAMPA_STRING);
                Thread.sleep(3000);
                System.out.println("\n\n\n\n!" + jugador + " eres un/a trampos@¡\n" + GANE_STRING);
                break;
            }

            do {
                System.out.println("\n\n\n\n('ㅂ') - " + jugador + " el número que pensaste fue " + numero_calculado);
                System.out.print("\n('ㅅ') - ingresa una opción:\n >) si el número es mayor\n <) si el número es menor\n =) si el número es igual\nTu respuesta: ");
                respuesta = scanner.nextLine().trim().charAt(0);

                switch (respuesta) {
                    case '=':
                        Thread.sleep(1000);
                        System.out.println("\n\n\n\n!Acerté " + jugador + ", te he ganado¡\n\nMe ha tomado " + intentos + " intentos adivinarlo");
                        Thread.sleep(2000);
                        System.out.println("" + GANE_STRING);
                        break;

                    case '<':
                    Thread.sleep(1000);
                        System.out.println("\n\n\n\n" + AUN_NO_STRING);
                        Thread.sleep(1000);
                        System.out.println("\n\n\n\n" + MENOR_STRING);
                        numero_mayor = numero_calculado;
                        break;

                    case '>':
                        Thread.sleep(1000);
                        System.out.println("\n\n\n\n" + AUN_NO_STRING);
                        Thread.sleep(1000);
                        System.out.println("\n\n\n\n" + MAYOR_STRING);
                        numero_menor = numero_calculado;
                        break;
                
                    default:
                        Thread.sleep(1000);
                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n" + OPCION_DESCONOCIDA_STRING);
                        break;
                }
            } while (respuesta != '=' && respuesta != '<' && respuesta != '>');
            Thread.sleep(2000);
        } while (respuesta != '=');
        Thread.sleep(4000);
    }
}
