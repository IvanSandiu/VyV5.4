
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FuncionesTest {

    private Funciones fun= new Funciones();

    @Test
    public void esPrimoVerdaderoTest() {
        boolean resultado= fun.esPrimo(7);
        assertEquals(true,resultado);
    }

    @Test
    public void esPrimoFalsoValidoTest() {
        boolean resultado= fun.esPrimo(4);
        assertEquals(false,resultado);
    }

    @Test
    public void esPrimoFalsoNoValidoTest() {
        boolean resultado= fun.esPrimo(0);
        assertEquals(false,resultado);
    }

    @Test
    public void esBiciestoVerdaderoTest() {
        boolean resultado= fun.esBiciesto(2000);
        assertEquals(true,resultado);
    }

    @Test
    public void esBiciestoFalsoTest() {
        boolean resultado= fun.esBiciesto(2001);
        assertEquals(false,resultado);
    }

    @Test
    public void esMultiploDe3VerdaderoTest() {
        boolean resultado= fun.multiploDe3(6);
        assertEquals(true,resultado);
    }

    @Test
    public void esMultiploDe3FalsoTest() {
        boolean resultado= fun.multiploDe3(4);
        assertEquals(false,resultado);
    }

}