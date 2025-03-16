package test.nif;

import com.mycompany.instituto.Nif;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase de prueba para verificar el funcionamiento del método toString de Nif.
 */
public class NifToStringTest {

    @Test
    public void testToString() {
        // Crear un objeto Nif con un número específico
        Nif nif = new Nif(12345678); // Número de NIF arbitrario
        
        // Calcular la letra que debería generarse para ese número
        char expectedLetter = Nif.calcularLetra(12345678);
        
        // Crear el resultado esperado en el formato "numero-letra"
        String expectedToString = "12345678-" + expectedLetter;
        
        // Verificar que el método toString devuelve el valor esperado
        assertEquals(expectedToString, nif.toString(), "El método toString no devuelve el formato esperado.");
    }
}
