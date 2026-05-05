
package com.biblioteca;

public class Libro {

    private String titulo;
    private boolean prestado;

    public Libro (String titulo){
        this.titulo = titulo;
        this.prestado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean estaPrestado() {
        return prestado;
    }

   public void prestar() {
       if (prestado) {
            throw new IllegalStateException("No se puede prestar un libro ya prestado");
        }
        prestado = true;
    }


    public void devolver() {
        if (!prestado) {
            throw new IllegalStateException("No se puede devolver un libro no prestado");
        }
        prestado = false;
    }

}
