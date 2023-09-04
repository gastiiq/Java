package shoponline2;


public class Remera extends Producto{
    
    
        private char talle;

    public Remera(String desc, int codigo, char talle, double precio) {
        super(desc, codigo, precio);
        this.talle = talle;
        if (this.talle == 'S') {
            this.precio += this.precio * talles.S.val;
        }
        else if (this.talle == 'M') {
            this.precio += this.precio * talles.M.val;
        }
        else if (this.talle == 'L') {
            this.precio += this.precio * talles.L.val;
        }
        else if (this.talle == 'X') {
            this.precio += this.precio * talles.X.val;
        }
        else{
            System.out.println("Talle invalido");
            this.precio = 0;
        }
    }
    public String toString() {
        String aux = this.desc + "...... $ " + this.precio + "("+ this.talle+")";
        return aux;
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

    public enum talles {
        S(0.5),M(0.10),L(0.15),X(0.20);
        
        private double val;
        
        talles(double val){
           this.val=val;
        
        }
    }
      
}

