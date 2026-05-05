
package com.biblioteca;

public class Main {

    public static void main(String[] args) {

        // Creacion de la biblioteca y los de libros
        Biblioteca granBiblioteca = new Biblioteca();

        Libro libro1 = new Libro("Ready Player One");
        Libro libro2 = new Libro("Indigno de ser humano");
        Libro libro3 = new Libro("Paco Yunque");
        Libro libro4 = new Libro("Metamorfosis");

        // Añadir libros al array de la biblioteca
        granBiblioteca.añadirLibro(libro1);
        granBiblioteca.añadirLibro(libro2);
        granBiblioteca.añadirLibro(libro3);
        granBiblioteca.añadirLibro(libro4);

        // Mostrar total de libros
        System.out.println("Total de libros en la biblioteca: " + granBiblioteca.getTotaldeLibros());

        //Prueba rápida
        libro4.prestar();
        System.out.println("¿Libro 4 prestado? " + libro4.estaPrestado());

    }
}


