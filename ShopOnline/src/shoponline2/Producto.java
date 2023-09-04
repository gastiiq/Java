package shoponline2;

 public abstract class Producto {
    protected String desc;
    protected int codigo; 
    protected double precio;

    public Producto(String desc,int codigo, double precio) {
        
        this.codigo = codigo;
        this.precio = precio;
        this.desc = desc;
        
    }
  

    @Override
    
    public String toString() {
        return this.desc + "..... $ " + this.precio;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public abstract double getPrecio();

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public int getCodigo() {
        return codigo;
    }
   
 

 
 
}
