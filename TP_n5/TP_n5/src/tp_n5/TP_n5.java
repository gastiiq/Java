

package tp_n5;

import java.util.ArrayList;
import java.util.Scanner;

public class TP_n5 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        
        ArrayList<Alumno> ListaA = new ArrayList();
        ArrayList<Profesor> ListaP = new ArrayList();
        boolean aux2 = true;
        while(aux2 == true){ 
            System.out.println("1.Alumno \n2.Profesor \n3.salir y mostrar");
            int aux = t.nextInt();
            if (aux == 1) {
                Alumno a = crearAlumno();
                ListaA.add(a);
            }
            if (aux ==2)
            {
              Profesor pr = CrearProfesor();
              ListaP.add(pr);            
            }
            if (aux ==3) {
                aux2=false;
            }
        }
        ImprimirTodo(ListaA, ListaP);
        
    }    
    
    public static Alumno crearAlumno(){
        Scanner t = new Scanner(System.in);
        System.out.println("Ingrese el Nombre: ");
        String nombre = t.next();
        System.out.println("Ingrese la Edad: ");
        int edad = t.nextInt();
        System.out.println("Ingrese el curso:");
        String curso = t.next();
        System.out.println("Ingrese el turno del alumno: ");
        String turno = t.next();
        System.out.println("Ingrese el promedio del alumno:");
        double promedio = t.nextDouble();
        Alumno a = new Alumno( nombre, edad, curso, turno, promedio);
        return a;
    
    
    }
    public static Profesor CrearProfesor(){
        Scanner t = new Scanner(System.in);
        System.out.println("Ingrese el Nombre: ");
        String nombre = t.next();
        System.out.println("Ingrese la Edad: ");
        int edad = t.nextInt();
        System.out.println("Ingrese el curso:");
        String curso = t.next();
        System.out.println("Ingrese el turno del profesor: ");
        String turno = t.next();
        System.out.println("Ingrese la materia que dicta el profesor:");
        String materia = t.next();
        Profesor pr = new Profesor(nombre, edad, curso, turno, materia);
        return pr;
    }
    
    
    public static void ImprimirTodo(ArrayList ListaA, ArrayList ListaP){
        ArrayList<Profesor> Lista2 = ListaP;
        ArrayList<Alumno> Lista = ListaA;
        
        System.out.println("--------PROFESORES--------");
        for (int i = 0; i < Lista2.size(); i++) {
            System.out.println("Profesor: ");
            Lista2.get(i).mostrarDatos();
        }
        
        System.out.println("--------ALUMNOS--------");
        for (int i = 0; i < Lista.size(); i++) {
            System.out.println("Alumno: ");
            Lista.get(i).mostrarDatos();
        }
    }
    }