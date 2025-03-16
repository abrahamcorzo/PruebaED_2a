package test.nif;



import com.mycompany.instituto.Nif;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase de prueba para verificar el funcionamiento del método equals de Nif.
 */
public class NifEqualsTest {

    @Test
    public void testEqualsMismoNif() {
        // Crear dos objetos Nif con el mismo número y letra
        Nif nif1 = new Nif(12345678); // Número de NIF arbitrario
        Nif nif2 = new Nif(12345678);
        
        // Verificar que los dos objetos son iguales
        assertTrue(nif1.equals(nif2), "Los NIFs con el mismo número y letra deberían ser iguales.");
    }

    @Test
    public void testEqualsDiferenteLetra() {
        // Crear dos objetos Nif con el mismo número pero diferente letra
        Nif nif1 = new Nif(12345678); // Número de NIF arbitrario
        Nif nif2 = new Nif(12345679); // El número diferente da una letra diferente
        
        // Verificar que los dos objetos no son iguales
        assertFalse(nif1.equals(nif2), "Los NIFs con el mismo número pero diferente letra no deberían ser iguales.");
    }

    @Test
    public void testEqualsNull() {
        // Crear un objeto Nif
        Nif nif = new Nif(12345678); // Número de NIF arbitrario
        
        // Verificar que el objeto no es igual a null
        assertFalse(nif.equals(null), "Un NIF no debería ser igual a null.");
    }

    @Test
    public void testEqualsMismoObjeto() {
        // Crear un objeto Nif
        Nif nif = new Nif(12345678); // Número de NIF arbitrario
        
        // Verificar que el objeto es igual a sí mismo
        assertTrue(nif.equals(nif), "Un NIF debería ser igual a sí mismo.");
    }

    @Test
    public void testEqualsDiferenteTipo() {
        // Crear un objeto Nif
        Nif nif = new Nif(12345678); // Número de NIF arbitrario
        
        // Verificar que el objeto no es igual a un objeto de diferente tipo
        assertFalse(nif.equals("12345678-T"), "Un NIF no debería ser igual a un objeto de tipo diferente.");
    }
}
