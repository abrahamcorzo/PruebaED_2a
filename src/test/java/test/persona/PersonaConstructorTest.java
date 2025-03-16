package test.persona;

import com.mycompany.instituto.Persona;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase de prueba para verificar el funcionamiento del constructor de Persona.
 */
public class PersonaConstructorTest {

    @Test
    public void testConstructorCompleto() {
        Persona persona = new Persona(12345678, "Juan Perez", 'M', 15, 5, 1990);
        
        assertEquals("Juan Perez", persona.getNombre(), "El nombre no se asignó correctamente.");
        assertEquals('M', persona.getGenero(), "El género no se asignó correctamente.");
        assertEquals(15, persona.getNacimiento().getDayOfMonth(), "El día de nacimiento no se asignó correctamente.");
        assertEquals(5, persona.getNacimiento().getMonthValue(), "El mes de nacimiento no se asignó correctamente.");
        assertEquals(1990, persona.getNacimiento().getYear(), "El año de nacimiento no se asignó correctamente.");
    }
}
