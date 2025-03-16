package test.curso;

import com.mycompany.instituto.Curso;
import com.mycompany.instituto.Persona;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase de prueba para verificar el funcionamiento del método aniadirAlumno.
 */
public class CursoAniadirAlumnoTest {

    @Test
    public void testAniadirAlumno() {
        Curso curso = new Curso("Matemáticas");
        Persona alumno1 = new Persona(12345678, "Juan Perez", 'M', 15, 5, 1990);
        
        // Añadir un alumno al curso
        curso.aniadirAlumno(alumno1);
        
        System.out.println(curso.toString());
        
        // Verificar que el alumno está en la lista
        assertTrue(curso.toString().contains("Juan\tPerez"), "El alumno debería ser añadido correctamente al curso.");
    }
}
