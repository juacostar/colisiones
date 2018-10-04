/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo.interfaz;


import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.animation.AnimationTimer;
import javafx.scene.image.Image;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

/**
 *
 * @author Estudiante
 */
public class LoopJuego extends AnimationTimer {
    private GraphicsContext lapiz;
    private Carro carro;
    private Image fondo;
    private Image gato;
    private Image morraco;
    int movimiento;
    int gatox;
    int fondox;

    public LoopJuego(GraphicsContext lapiz) {
        this.lapiz = lapiz;
        this.carro=new Carro(0,100,20,20,true);
        this.fondo= new Image("Imagen/fondo.png");
        this.gato= new Image("Imagen/cats.gif");
        this.morraco=new Image("Imagen/left0.png");
        this.movimiento=0;
        this.gatox=20;
        this.fondox=0;
    }
    
       
    int j=0;
    public void handle(long now){
        
        lapiz.clearRect(0, 0, 1024, 512);
        lapiz.drawImage(fondo, fondox, 0);
        lapiz.drawImage(fondo, 1024+fondox, 0);
        lapiz.drawImage(morraco, 300, 40);
        lapiz.drawImage(gato, 132*movimiento, 0,132,80,gatox,20,132,80);//origen,origen,ancho,alto,coordenada a imprimir, coordenada a imprimir,ancho,alto
      
        Shape rectangulo1= new Rectangle(gatox,20,132,80);
        lapiz.strokeRect(gatox,20,132,80);
        Shape rectangulo2= new Rectangle(300,40,30,39);
        lapiz.strokeRect(300,40,30,39);
        Shape interseccion=SVGPath.intersect(rectangulo2, rectangulo1);//figura de interseccion de la colision
        if(interseccion.getBoundsInLocal().getWidth()!=-1){
            morraco=null;
        }
        lapiz.strokeRect(this.carro.getXref(), this.carro.getYref(), this.carro.getAncho(), this.carro.getAlto());
       
        lapiz.strokeText("Puntaje: 0", 200, 10);
        
        fondox--;
       
        if(fondox<=-1024){
            fondox=0;
        }
        
        if(j>=10){
        movimiento++;
         gatox++;
        
        j=0;
        
        }
        if(movimiento==5){
            movimiento=0;
        }
        j++;
        gatox++;
        
        
        
    }
}
