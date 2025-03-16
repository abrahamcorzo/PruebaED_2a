package test.persona;



import com.mycompany.instituto.Persona;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase de prueba para verificar el funcionamiento del método equals de Persona.
 */
public class PersonaEqualsTest {

    @Test
    public void testEqualsMismoNif() {
        Persona persona1 = new Persona(12345678, "Juan Perez", 'M', 15, 5, 1990);
        Persona persona2 = new Persona(12345678, "Juan Perez", 'M', 15, 5, 1990);
        
        assertTrue(persona1.equals(persona2), "Las personas con el mismo NIF deberían ser iguales.");
    }

    @Test
    public void testEqualsDiferenteNif() {
        Persona persona1 = new Persona(12345678, "Juan Perez", 'M', 15, 5, 1990);
        Persona persona2 = new Persona(87654321, "Ana Lopez", 'F', 25, 12, 1992);
        
        assertFalse(persona1.equals(persona2), "Las personas con NIFs diferentes no deberían ser iguales.");
    }
}
