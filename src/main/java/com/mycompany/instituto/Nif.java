/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.instituto;

/**
 * Representa el NIF (Número de Identificación Fiscal) de una persona, compuesto por un número y una letra.
 * La letra es calculada a partir del número siguiendo un algoritmo específico.
 * 
 * Esta clase proporciona métodos para calcular la letra asociada al número, comparar NIFs, y mostrar la representación del NIF como un string.
 * 
 * @author ProfDiurno
 * @version 1.0
 */
public class Nif {

    private int numero;
    private char letra;

    // CONSTANTE: no accesible - compartido por todo - no modificable
    private static final char[] LETRAS = {
        'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D',
        'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L',
        'C', 'K', 'E'
    };

    /**
     * Calcula la letra asociada a un número de NIF.
     * La letra se calcula utilizando el resto de la división del número entre 23.
     * 
     * @param numero El número de NIF a calcular la letra.
     * @return La letra correspondiente al número.
     */
    public static char calcularLetra(int numero) {
        return LETRAS[numero % 23];
    }

    /**
     * Constructor por defecto, que establece el número de NIF en 0 y la letra en ' '.
     */
    public Nif() {
        this.numero = 0;
        this.letra = ' ';
    }

    /**
     * Constructor que recibe un número de NIF y calcula la letra correspondiente.
     * 
     * @param numero El número del NIF.
     */
    public Nif(int numero) {
        this.numero = numero;
        this.letra = calcularLetra(numero);
    }

    /**
     * Devuelve la representación en cadena del NIF, en formato "numero-letra".
     * 
     * @return La cadena que representa el NIF.
     */
    @Override
    public String toString() {
        return numero + "-" + letra;
    }

    /**
     * Establece un nuevo número de NIF y recalcula la letra correspondiente.
     * 
     * @param numero El número de NIF a establecer.
     */
    protected void setNif(int numero) {
        this.numero = numero;
        this.letra = calcularLetra(numero);
    }

    /**
     * Compara dos objetos NIF para determinar si son iguales.
     * Dos NIFs son iguales si tienen el mismo número y la misma letra.
     * 
     * @param obj El objeto con el que se desea comparar.
     * @return true si los NIFs son iguales, false en caso contrario.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Nif other = (Nif) obj;
        if (this.numero != other.numero) {
            return false;
        }
        return this.letra == other.letra;
    }
}
