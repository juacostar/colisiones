/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class ConjuntoLibro {
    private Libro[] coleccion;
    
    public ConjuntoLibro(){
        this.coleccion= new Libro[4];
    }
    
    public boolean anadirLibro(Libro libro){
        for(int i=0; i<this.coleccion.length; i++){
            if(this.coleccion[i]==null){
                this.coleccion[i]=libro;
                return true;
            }
        }
        return false;
    }
    
    public boolean eliminarTitulo(String titulo){
        for(int i=0;i<this.coleccion.length;i++){
            if(this.coleccion[i].getTitulo().equals(titulo)){
                return true;
            }
        }
        return false;
    }
    
    public boolean eliminarAutor(String autor){
        for(int i=0; i<this.coleccion.length;i++){
            if(this.coleccion[i].getAutor().equals(autor)){
                return true;
            }
        }
        return false;
    }
    
    public Libro obtenerMejorCalificado(){
        for(int i=0;i<coleccion.length;i++){
            
        }
    }
    
    public Libro obtenerMenorCalificado(){
        return null;
    }
    
    
    public Libro[] obtenerTodosLibros(){
        return this.coleccion;
    }
}
