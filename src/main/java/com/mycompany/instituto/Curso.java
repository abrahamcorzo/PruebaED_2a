/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.instituto;

import java.util.TreeSet;

/**
 * Representa un curso con un nombre y una lista de alumnos. La lista de alumnos
 * se mantiene ordenada por el NIF de cada persona. El curso permite añadir alumnos
 * y obtener una representación del mismo en formato de texto.
 * 
 * @author ProfDiurno
 * @version 1.0
 */
public class Curso {

    private String nombre;
    private TreeSet<Persona> listaAlumnos;

    /**
     * Constructor que inicializa un curso con el nombre especificado.
     * La lista de alumnos es inicializada como un conjunto vacío.
     * 
     * @param nombre El nombre del curso.
     */
    public Curso(String nombre) {
        this.nombre = nombre;
        listaAlumnos = new TreeSet<>();
    }

    /**
     * Obtiene el nombre del curso.
     * 
     * @return El nombre del curso.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Añade un alumno al curso. Si el alumno ya está en la lista, no se
     * añadirá nuevamente ya que la lista se mantiene ordenada por el NIF
     * de las personas.
     * 
     * @param p El alumno (persona) que se desea añadir al curso.
     */
    public void aniadirAlumno(Persona p) {
        listaAlumnos.add(p);
    }

    /**
     * Devuelve una representación en cadena del curso, incluyendo la lista
     * de alumnos. El formato incluye: nombre del curso, número de expediente,
     * NIF, nombre y apellidos de cada alumno.
     * 
     * @return La representación del curso en formato de texto.
     */
    @Override
    public String toString() {
        String s = "--------------------" + nombre + "-----------------\n";
        s += "NumExp\tNIF\t\tNombre\t\tApellidos\n";
        s += "-------------------------------------------------\n";
        for (Persona listaAlumno : listaAlumnos) {
            s += listaAlumno + "\n";
        }
        return s;
    }
}
