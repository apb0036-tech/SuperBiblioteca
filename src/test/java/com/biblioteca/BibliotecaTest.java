package com.biblioteca;

import com.biblioteca.Biblioteca;
import com.biblioteca.Libro;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BibliotecaTest {

    @Test
    public void añadirUnLibroIncrementaTotal() {
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.añadirLibro(new Libro("Libro 1"));

        assertEquals(1, biblioteca.getTotaldeLibros());
    }

    @Test
    public void añadirVariosLibrosIncrementaTotalCorrectamente() {
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.añadirLibro(new Libro("Libro 1"));
        biblioteca.añadirLibro(new Libro("Libro 2"));
        biblioteca.añadirLibro(new Libro("Libro 3"));

        assertEquals(3, biblioteca.getTotaldeLibros());
    }
}