/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_2;

/**
 *
 * @author CS15
 */
public class Persona {
    
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public void mostrardatos(){
    
        System.out.println("Nombre: " + this.nombre + "\nEdad: " + this.edad);
    
    
    }
    
    
    
}
