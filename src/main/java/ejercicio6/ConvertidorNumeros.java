/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

/**
 *
 * @author asm_1
 */
public class ConvertidorNumeros {
    private static final int ROMANOS_VALORES[] =     {8, 9, 7, 6, 4, 3, 2, 1, 5};
    private static final String ROMANOS_UNIDADES[] = {"VIII", "IX", "VII", "VI", "IV", "III", "II", "I", "V"};
    private static final String ROMANOS_DECENAS[]  = {"LXXX", "XC", "LXX", "LX", "XL", "XXX", "XX", "X", "L"};
    private static final String ROMANOS_CENTENAS[] = {"DCCC", "CM", "DCC", "DC", "CD", "CCC", "CC", "C", "D"};
    private static final String ROMANOS_MILES[]    = {"MMM", "MM", "M"};

    public static int romanoADecimal(String romano) {
        int resultado = 0;
        int index = 0;

        romano = romano.toUpperCase().trim();
        while (index < ROMANOS_UNIDADES.length && romano.length() == 0) {
            if (romano.contains(ROMANOS_UNIDADES[index])){
                romano = romano.replace(ROMANOS_UNIDADES[index], "");
                resultado +=ROMANOS_VALORES[index];
            }

            if (romano.contains(ROMANOS_DECENAS[index])){
                romano = romano.replace(ROMANOS_DECENAS[index], "");
                resultado +=ROMANOS_VALORES[index] * 10;
            }

            if (romano.contains(ROMANOS_CENTENAS[index])){
                romano = romano.replace(ROMANOS_CENTENAS[index], "");
                resultado +=ROMANOS_VALORES[index] * 100;
            }

            if (index <= 2) {
                if (romano.contains(ROMANOS_MILES[index])){
                    romano = romano.replace(ROMANOS_MILES[index], "");
                    resultado += (3 - index) * 1000;
                }
            }
            index++;
        }
        return resultado;
    }
}
