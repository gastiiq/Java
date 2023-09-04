package shoponline2;

public class Accesorio extends Producto{
    private double peso;
    private String metal;
    public Accesorio(String descripcion, int codigo, double peso, String metal, double precio) {
        super(descripcion, codigo, precio);
        this.peso = peso;
        this.metal = metal;
        if (this.metal.equals("acero")) {
            this.precio = this.precio + this.peso * 2000;
        }
        else if (this.metal.equals("plata")) {
            this.precio = this.precio + this.peso * 3000;
        }
        else if (this.metal.equals("oro")) {
            this.precio = this.precio + this.peso * 55000;
        }
        else{
            System.out.println("Metal invalido");
            this.precio = 0;
        }
    }

    @Override
    public double getPrecio() {
        return precio;
    }
    public String toString() {
        String aux = this.desc + "........ $ " + this.precio + "(Bijouterie)";
        return aux;
    }    
    public String getDesc() {
        return desc;
    }
    public int getCodigo() {
        return codigo;
    }
    public double getPeso() {
        return peso;
    }
    public String getMetal() {
        return metal;
    }

}

