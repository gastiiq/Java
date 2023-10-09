/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tp_4;

/**
 *
 * @author CS-13
 */
public class Persona {
    
    private String nombre;
    private int dni;
    private int edad;
    private Direccion dir;
    public Persona(String nombre, int dni, int edad, Direccion dir){
        
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        this.dir = dir;
        
    }
    public void mostrarDatos(){
        System.out.println(" Nombre: " + this.nombre + "\n DNI: " 
                           + this.dni + "\n Edad:" + this.edad + this.dir.datosDir());
    
    }
    public String getNombre() {
        return nombre;
    }

    public int getDni() {
        return dni;
    }

    public int getEdad() {
        return edad;
    }

    public Direccion getDir() {
        return dir;
    }
   
}
