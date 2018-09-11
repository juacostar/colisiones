
import java.util.ArrayList;

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
        Empleado e= new Empleado("F");
        Empresa emp= new Empresa();
            ArrayList<Empleado> empleados= emp.listarEmpleados();
            
    for(Empleado empleado: empleados){
        System.out.println(empleado.getNombre());
    }
   
    }
}
