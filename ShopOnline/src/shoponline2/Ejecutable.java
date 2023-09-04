package shoponline2;

import java.time.LocalDate;
import java.util.Scanner;

public class Ejecutable {

    public static void main(String[] args) {
        LocalDate hoy = LocalDate.now();
        Scanner t = new Scanner(System.in);
        Cliente c=new Cliente("Jose Luis");
        Venta v = new Venta(hoy, c);
        cargarProductos(v);
        v.imprimirFactura();
    } 
    public static void cargarProductos(Venta v){
       Scanner t = new Scanner(System.in);
       
       int n = Menu();
       double precio = 0.0;
       int id = 0;
       String descripcion;
       String modelo;
       Producto p = null;
       
       
       while(n!=4){
                                
                if (n == 1) {
                    System.out.println("Ingrese una descripcion: ");
                    descripcion = t.next();
                    
                    System.out.println("Ingrese un id: ");
                    id = t.nextInt();
                    
                    System.out.println("Ingrese el modelo: ");
                    modelo = t.next();
                    
                    System.out.println("Ingrese una el talle: ");
                    int talle = t.nextInt();
                    
                    System.out.println("Ingrese el precio: ");
                    precio = t.nextDouble();

                    p = new Pantalon(descripcion, id, talle,modelo, precio);
                    v.agregarProducto(p);
                }
                        
               if(n == 2){
                    System.out.println("Ingrese una descripcion: ");
                    descripcion = t.next();
                 
                    System.out.println("Ingrese un id: ");
                     id = t.nextInt();

                    System.out.println("Ingrese el talle: ");
                    char talle = t.next().charAt(0);

                    System.out.println("Ingrese un precio: ");
                     precio = t.nextDouble();

                    p = new Remera(descripcion, id, talle, precio);
                    v.agregarProducto(p);
            }
            if(n == 3){
                System.out.println("Ingrese una descripcion: ");
                     descripcion = t.next();

                    System.out.println("Ingrese un id: ");
                    id = t.nextInt();

                    System.out.println("Ingrese un precio: ");
                    precio = t.nextDouble();
                    
                    System.out.println("Ingrese una peso:");
                    double peso = t.nextDouble();

                    System.out.println("Ingrese el metal: ");
                    String metal = t.next();
                    
                    p = new Accesorio(descripcion, id, peso, metal, precio);
                    v.agregarProducto(p);
            }
            
        n = Menu();
        
        }
    }
    
    public static int Menu(){
         Scanner t = new Scanner(System.in);
                System.out.println("Elija una opcion: \n1. Pantalon    \n2. Remera \n3. Accesorio  \n4. Salir");
               int num = t.nextInt();
         return num;
    }
       
}
       

       
        
  