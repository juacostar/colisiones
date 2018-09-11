/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author Estudiante
 */
public class Empresa {
    private ArrayList<Empleado> empleados;

    public Empresa() {
        this.empleados = new ArrayList<>();
    }
    
    public boolean addEmpleado(Empleado e){
        return this.empleados.add(e);
    }
    
    public ArrayList listarEmpleados(){
        return this.empleados;
    }
    
    
    
}
