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
public class Main {
    public static void main(String[] args) {
        Scanner lectura= new Scanner(System.in);
        Pizza[] coleccion= new Pizza[10];        
        for(int i=0;i<coleccion.length;i++){
            System.out.println("Ingrese el ingrediente de p"+i+": ");
            String ingrediente= lectura.next();
            System.out.println("Ingrese el diametro de p"+i+": ");
            float diametro= lectura.nextFloat();
            System.out.println("Ingrese el precio de p"+i+": ");
            float precio=lectura.nextFloat();
            coleccion[i]= new Pizza(ingrediente, diametro, precio);
            
    }
        
        for(int j=0;j<coleccion.length;j++){
            System.out.println(coleccion[j].toString());
        }
    }
}
