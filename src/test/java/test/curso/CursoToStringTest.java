package test.curso;

import com.mycompany.instituto.Curso;
import com.mycompany.instituto.Persona;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase de prueba para verificar el funcionamiento del método toString de Curso.
 */
public class CursoToStringTest {

    @Test
    public void testToStringCursoVacio() {
        // Crear un nuevo curso sin añadir alumnos
        Curso curso = new Curso("Física");
        
        // Obtener el resultado del toString del curso
        String cursoString = curso.toString();
        System.out.println(cursoString);  // Imprime el toString completo del curso para depurar

        // Verificar que el nombre del curso esté en el toString
        assertTrue(cursoString.contains("Física"), "El nombre del curso debe aparecer en el toString.");

        // Verificar que la lista de alumnos está vacía (no debería haber alumnos listados)
        assertTrue(cursoString.contains("NumExp\tNIF\t\tNombre\t\tApellidos"), 
                   "El método toString debería incluir los encabezados de la tabla de alumnos.");
        assertTrue(cursoString.contains("-------------------------------------------------"), 
                   "El método toString debería tener una tabla vacía de alumnos.");
    }

    @Test
    public void testToStringConAlumnos() {
        // Crear un nuevo curso
        Curso curso = new Curso("Química");

        // Crear varios alumnos
        Persona alumno1 = new Persona(12345678, "Juan Perez", 'M', 15, 5, 1990);
        Persona alumno2 = new Persona(87654321, "Maria Garcia", 'F', 22, 3, 1992);

        // Añadir los alumnos al curso
        curso.aniadirAlumno(alumno1);
        curso.aniadirAlumno(alumno2);

        // Obtener el resultado del toString del curso
        String cursoString = curso.toString();
        System.out.println(cursoString);  // Imprime el toString completo del curso para depurar

        // Verificar que el nombre del curso esté en el toString
        assertTrue(cursoString.contains("Química"), "El nombre del curso debe aparecer en el toString.");

        // Verificar que los nombres de los alumnos estén en el toString
        assertTrue(cursoString.contains("Juan Perez"), "El nombre de Juan Perez debe aparecer en el toString.");
        assertTrue(cursoString.contains("Maria Garcia"), "El nombre de Maria Garcia debe aparecer en el toString.");
        
        // Verificar que la tabla de alumnos se muestre correctamente
        assertTrue(cursoString.contains("NumExp\tNIF\t\tNombre\t\tApellidos"), 
                   "El método toString debería incluir los encabezados de la tabla de alumnos.");
        assertTrue(cursoString.contains("-------------------------------------------------"), 
                   "El método toString debería tener una tabla de alumnos.");
    }
}
