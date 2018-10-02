/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo.interfaz;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.animation.AnimationTimer;

/**
 *
 * @author Estudiante
 */
public class LoopJuego extends AnimationTimer {
    private GraphicsContext lapiz;
    private Carro carro;

    public LoopJuego(GraphicsContext lapiz) {
        this.lapiz = lapiz;
        this.carro=new Carro(0,100,20,20,true);
    }
    
       
    
    public void handle(long now){
        lapiz.clearRect(0, 0, 300, 300);
        lapiz.strokeRect(this.carro.getXref(), this.carro.getYref(), this.carro.getAncho(), this.carro.getAlto());
        lapiz.strokeText("Puntaje: 0", 200, 10);
        if(this.carro.getXref()==0){
            carro.mover();
        }
        if(this.carro.getXref()==300){
            this.carro.setDir(false);
            carro.devolver();
        }
        
    }
}
