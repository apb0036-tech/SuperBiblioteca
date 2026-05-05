import com.biblioteca.Libro;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LibroTest {

    @Test
    public void libroCreadoTieneTituloCorrecto() {
        Libro libro = new Libro("Code Camp");

        assertEquals("Code Camp", libro.getTitulo());
    }

    @Test
    public void libroCreadoNoEstaPrestado() {
        Libro libro = new Libro("Code Camp");

        assertFalse(libro.estaPrestado());
    }

    @Test
    public void prestarLibroCambiaEstado() {
        Libro libro = new Libro("Code Camp");

        libro.prestar();

        assertTrue(libro.estaPrestado());
    }

    @Test
    public void prestarLibroYaPrestadoLanzaExcepcion() {
        Libro libro = new Libro("Code Camp");
        libro.prestar();

        assertThrows(IllegalStateException.class, libro::prestar);
    }

    @Test
    public void devolverLibroCambiaEstado() {
        Libro libro = new Libro("Code Camp");
        libro.prestar();
        libro.devolver();

        assertFalse(libro.estaPrestado());
    }

    @Test
    public void devolverLibroNoPrestadoLanzaExcepcion() {
        Libro libro = new Libro("Code Camp");

        assertThrows(IllegalStateException.class, libro::devolver);
    }
}