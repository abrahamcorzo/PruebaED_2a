package test.curso;

import com.mycompany.instituto.Curso;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase de prueba para verificar el funcionamiento del constructor de Curso.
 */
public class CursoConstructorTest {

    @Test
    public void testConstructor() {
        // Crear un nuevo curso con un nombre específico
        String nombreCurso = "Matemáticas";
        Curso curso = new Curso(nombreCurso);
        
        // Verificar que el nombre del curso se ha establecido correctamente
        assertEquals(nombreCurso, curso.getNombre(), "El nombre del curso debería ser el que se pasó al constructor.");
        
        // Verificar que la lista de alumnos está vacía inicialmente
        String cursoString = curso.toString();
        assertTrue(cursoString.contains("NumExp\tNIF\t\tNombre\t\tApellidos"), 
                   "El método toString debería incluir los encabezados de la tabla de alumnos.");
        assertTrue(cursoString.contains("-------------------------------------------------"), 
                   "El método toString debería tener una tabla vacía de alumnos.");
    }
}
