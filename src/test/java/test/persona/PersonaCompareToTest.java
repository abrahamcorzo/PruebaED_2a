package test.persona;

import com.mycompany.instituto.Persona;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase de prueba para verificar el funcionamiento del método compareTo de Persona.
 */
public class PersonaCompareToTest {

    @Test
    public void testCompareToMenor() {
        Persona persona1 = new Persona(12345678, "Juan Perez", 'M', 15, 5, 1990);
        Persona persona2 = new Persona(87654321, "Ana Lopez", 'F', 25, 12, 1992);

        // Verificar que el primer NIF es menor que el segundo
        assertTrue(persona1.compareTo(persona2) < 0, "El primer NIF debería ser menor que el segundo.");
    }

    @Test
    public void testCompareToIgual() {
        Persona persona1 = new Persona(12345678, "Juan Perez", 'M', 15, 5, 1990);
        Persona persona2 = new Persona(12345678, "Juan Perez", 'M', 15, 5, 1990);

        // Verificar que ambos NIFs son iguales
        assertEquals(0, persona1.compareTo(persona2), "Los NIFs deberían ser iguales.");
    }

    @Test
    public void testCompareToMayor() {
        Persona persona1 = new Persona(87654321, "Ana Lopez", 'F', 25, 12, 1992);
        Persona persona2 = new Persona(12345678, "Juan Perez", 'M', 15, 5, 1990);

        // Verificar que el primer NIF es mayor que el segundo
        assertTrue(persona1.compareTo(persona2) > 0, "El primer NIF debería ser mayor que el segundo.");
    }
}
