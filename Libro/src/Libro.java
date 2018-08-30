/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Libro {
    private String titulo;
    private String autor;
    private int numPaginas;
    private int calLibro;

    public Libro(String titulo, String autor, int numPaginas, int calLibro) {
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
        this.calLibro = calLibro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public int getCalLibro() {
        return calLibro;
    }

    public void setCalLibro(int calLibro) {
        this.calLibro = calLibro;
    }
    
    
    
}
