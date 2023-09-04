package shoponline2;

public class Pantalon extends Producto{
    
    private String modelo;
    private int talle;

    public Pantalon(String desc, int codigo, int talle, String modelo, double precio) {
        super(desc, codigo, precio);
        this.talle = talle;
        this.modelo = modelo;
        
        if (this.modelo.equals("Skinny")) {
            this.precio += this.precio * 0.25;
        }
        else if (this.modelo.equals("Oxford")) {
            this.precio += this.precio * 0.15;
        }
        else if (this.modelo.equals("Recto")) {
            this.precio += this.precio * 0.15;
        }
        else{
            System.out.println("Modelo invalida");
            this.precio = 0;
        }
    }
    @Override
    public double getPrecio() {
        return precio;
        
    }
    
    public String getDesc() {
        return desc;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getTalle() {
        return talle;
    }

    public String toString() {
        String aux = this.desc + "...... $ " + this.precio + "("+ this.talle+")";
        return aux ;
    }
      
}
