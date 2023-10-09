

package tp_n3;

import java.util.ArrayList;
import java.util.Scanner;

public class TP_n3 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        
        ArrayList<Alumno> ListaA = new ArrayList();
        ArrayList<Profesor> ListaP = new ArrayList();
        
        for (int i = 0; i < 2; i++) {
            
            System.out.println("1.Alumno \n2.Profesor:");
            int aux = t.nextInt();
            if (aux == 1) {       
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
                ListaA.add(a);
            }
            else if(aux ==2)
            {
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
                ListaP.add(pr);            
            }
        }
        
        for (int i = 0; i < 2; i++) {
            System.out.println("Profesores: ");
            ListaP.get(i).mostrarDatos();
        }
        for (int i = 0; i < 2; i++) {
            System.out.println("Alumnos: ");
            ListaA.get(i).mostrarDatos();
        }
    }    
    }

