import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Pruebarectangulo {
    public static void main(String[] args) {
        Scanner lectura= new Scanner(System.in);
        Rectangulo[] R = new Rectangulo[10];
        for(int i=0;i<10;i++){
            System.out.println("Ingrese la base del rectangulo r"+ (i+1)+": " ); 
            double b =lectura.nextDouble();
            System.out.println("Ingrese la altura del rectangulo r"+ (i+1)+ ": ");
            double h=lectura.nextDouble();
            R[i]=new Rectangulo(b, h);
            System.out.println("El area del rectangulo "+ R[i]+ " es "+ R[i].calcularArea());
            System.out.println("El perimetro del rectangulo"+ R[i]+" es"+ R[i].calcularPerimetro());
        }
    }
}
