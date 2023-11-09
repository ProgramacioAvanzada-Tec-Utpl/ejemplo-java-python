/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package administracion;

/**
 *
 * @author reroes
 */
public class Hospital {
    private String nombre;
    private int numeroCamas;
    private double presupuesto;
    
    public Hospital(String name, int camas, double montoAsignado){
        nombre = name;
        camas = numeroCamas;
        presupuesto = montoAsignado;
    }
    // métodos establecer para cada atributo
    public void establecerNombre(String n){
        nombre = n;
    }
    
    public void establecerNumeroCamas(int n){
        numeroCamas = n;
    }
    
    public void establecerPresupuesto(double n){
        presupuesto = n;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public int obtenerNumeroCamas(){
        return numeroCamas;
    }
    
    public double obtenerPresupuesto(){
        return presupuesto;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("Hospital\nNombre: %s\nNúmero de Camas: %d"
                + "\nPresupuesto: %.2f\n", 
                obtenerNombre(), 
                obtenerNumeroCamas(), 
                obtenerPresupuesto());
        return cadena;
    }
    
}