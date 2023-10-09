/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tp_4;

import java.util.Scanner;

public class Ejecutable {
    public static void main(String[] args){
    Persona[] PersonasVec = CargarDatosVec();
    mostrarEdad(PersonasVec);
    mostrarJubilados(PersonasVec);
    ResidenCaba(PersonasVec);
    }

public static Persona[] CargarDatosVec(){
    Scanner t = new Scanner(System.in); 
    System.out.println("Ingrese la cantidad de personas que va a ingresar: ");
    int N = t.nextInt();
    Persona[] vec=new Persona[N];
    
    for (int i = 0; i < N; i++) {
        
    //Datos Persona
    System.out.println("Ingrese el Nombre: ");
    String nombre = t.next();
    System.out.println("Ingrese el DNI: ");
    int dni = t.nextInt();
    System.out.println("Ingrese la edad: ");
    int edad = t.nextInt();
    
   // Datos Direccion
    System.out.println("Ingrese la calle: ");
    String calle = t.next();
    System.out.println("ingrese la altura: ");
    int altura = t.nextInt();
    System.out.println("Ingrese la localidad: ");
    String Localidad = t.next();
    System.out.println("Ingrese el uumero de piso: ");
    int NumPiso = t.nextInt();
    
    Direccion d = new Direccion(calle, altura, Localidad, NumPiso);
    Persona p = new Persona(nombre, dni, edad, d);
    vec[i] = p;
    }
    return vec;
}
    public static void mostrarEdad(Persona[] PersonasVec){
        for (int i = 0; i < PersonasVec.length; i++) {
            if (PersonasVec[i].getEdad() >=18){ 
                System.out.println(PersonasVec[i].getNombre() + " es mayor de edad.");
                
            }
        }
    }
    public static void mostrarJubilados(Persona[] PersonasVec){
        for (int i = 0; i < PersonasVec.length; i++) {
            if (PersonasVec[i].getEdad() >=70){ 
                System.out.println(PersonasVec[i].getNombre() + " es jubilado/da.");
                
            }
        }
    }

    public static void ResidenCaba(Persona[] PersonasVec){
        for (int i = 0; i < PersonasVec.length; i++) {
            if (PersonasVec[i].getDir().getLocalidad().equals("CABA")){
                System.out.println("Nombre: " + PersonasVec[i].getNombre() + " DNI: " + PersonasVec[i].getDni() + " Es residente de CABA");
            }
        }    
    }
}