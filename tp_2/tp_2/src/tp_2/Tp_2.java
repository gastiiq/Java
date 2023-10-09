

package tp_2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author CS15
 */
public class Tp_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        
        ArrayList<Persona> ListaP = new ArrayList();
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese Su Nombre: ");
            String nombre = t.next();
            System.out.println("Ingrese Su Edad: ");
            int edad = t.nextInt();
            
            Persona p=new Persona (nombre, edad);
            ListaP.add(p);
        }
        
        for (int i = 0; i < 3; i++) {
            ListaP.get(i).mostrardatos();
        }
        
    }
    }

