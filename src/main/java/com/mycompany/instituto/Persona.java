/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.instituto;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

/**
 * Representa a una persona, con su NIF, nombre, género y fecha de nacimiento.
 * Esta clase incluye métodos para calcular la edad, comparar personas por su NIF,
 * y mostrar la representación de la persona como una cadena.
 * 
 * @author ProfDiurno
 * @version 1.0
 */
public class Persona implements Comparable<Persona> {

    private Nif nif;
    private String nombre;
    private char genero;
    private LocalDate nacimiento;

    /**
     * Constructor por defecto que inicializa el NIF con un valor por defecto,
     * el nombre vacío, el género con un espacio en blanco, y la fecha de nacimiento
     * al 1 de enero de 1990.
     */
    public Persona() {
        nif = new Nif();
        nombre = "";
        genero = ' ';
        nacimiento = LocalDate.of(1990, 1, 1);
    }

    /**
     * Constructor que inicializa el NIF de la persona, utilizando el valor recibido
     * y establece los valores por defecto para el resto de atributos.
     * 
     * @param nif El número de NIF de la persona.
     */
    public Persona(int nif) {
        this();
        this.nif = new Nif(nif);
    }

    /**
     * Constructor que inicializa todos los atributos de la persona: el NIF, nombre,
     * género y fecha de nacimiento.
     * 
     * @param nif El número de NIF de la persona.
     * @param nombre El nombre de la persona.
     * @param genero El género de la persona (M/F).
     * @param dia El día de nacimiento de la persona.
     * @param mes El mes de nacimiento de la persona.
     * @param ano El año de nacimiento de la persona.
     */
    public Persona(int nif, String nombre, char genero,
            int dia, int mes, int ano) {
        this.nif = new Nif(nif);
        this.nombre = nombre;
        this.genero = genero;
        this.nacimiento = LocalDate.of(ano, mes, dia);
    }

    /**
     * Obtiene el NIF de la persona.
     * 
     * @return El NIF de la persona.
     */
    public Nif getNif() {
        return nif;
    }

    /**
     * Establece el NIF de la persona.
     * 
     * @param nif El nuevo NIF de la persona.
     */
    public void setNif(Nif nif) {
        this.nif = nif;
    }

    /**
     * Obtiene el nombre de la persona.
     * 
     * @return El nombre de la persona.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la persona.
     * 
     * @param nombre El nuevo nombre de la persona.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el género de la persona.
     * 
     * @return El género de la persona (M/F).
     */
    public char getGenero() {
        return genero;
    }

    /**
     * Establece el género de la persona.
     * 
     * @param genero El nuevo género (M/F) de la persona.
     */
    public void setGenero(char genero) {
        this.genero = genero;
    }

    /**
     * Obtiene la fecha de nacimiento de la persona.
     * 
     * @return La fecha de nacimiento de la persona.
     */
    public LocalDate getNacimiento() {
        return nacimiento;
    }

    /**
     * Establece la fecha de nacimiento de la persona.
     * 
     * @param nacimiento La nueva fecha de nacimiento de la persona.
     */
    public void setNacimiento(LocalDate nacimiento) {
        this.nacimiento = nacimiento;
    }

    /**
     * Calcula la edad de la persona en base a la fecha de nacimiento.
     * 
     * @return La edad de la persona en años.
     */
    public int getEdad() {
        return Period.between(nacimiento, LocalDate.now()).getYears();
    }

    /**
     * Devuelve la representación en cadena de la persona.
     * El formato es: "NIF\tNombre\tApellido\tEdad".
     * Si el nombre tiene más de una palabra, se separan en primer nombre y apellido.
     * 
     * @return La representación en cadena de la persona.
     */
    @Override
    public String toString() {
        if (nombre.split(" ").length > 1) {
            return nif + "\t" + nombre.split(" ")[0]
                    + '\t' + nombre.split(" ")[1] + "\t\t" + getEdad();
        } else {
            return nif + "\t" + nombre + "\t\t\t" + getEdad();
        }
    }

    /**
     * Compara si esta persona es igual a otra persona basada en el NIF.
     * 
     * @param a La persona con la que se desea comparar.
     * @return true si ambas personas tienen el mismo NIF, false si no.
     */
    public boolean equals(Persona a) {
        if (a == null) {
            return false;
        }
        return a.nif.toString().equals(this.nif.toString());
    }

    /**
     * Compara dos objetos Persona para determinar si son iguales.
     * Se consideran iguales si tienen el mismo NIF.
     * 
     * @param obj El objeto con el que se desea comparar.
     * @return true si los objetos son iguales (mismo NIF), false en caso contrario.
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
        final Persona other = (Persona) obj;
        return Objects.equals(this.nif, other.nif);
    }

    /**
     * Compara esta persona con otra persona por su NIF.
     * 
     * @param o La persona con la que se desea comparar.
     * @return Un valor negativo, cero o positivo según si el NIF de esta persona
     *         es menor, igual o mayor que el NIF de la otra persona.
     */
    @Override
    public int compareTo(Persona o) {
        return this.nif.toString().compareTo(o.nif.toString());
    }
}
