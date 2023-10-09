
package Tp_4;

public class Direccion {
   
    private String calle;
    private String localidad;
    private int num;
    private int NumPiso;
    
    public Direccion(String calle, int num, String localidad, int NumPiso){        
        this.calle = calle;
        this.num = num;
        this.localidad= localidad;
        this.NumPiso= NumPiso;
    
    }

    public String getCalle() {
        return calle;
    }

    public int getNumPiso() {
        return NumPiso;
    }

    public void setNumPiso(int NumPiso) {
        this.NumPiso = NumPiso;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String datosDir() {
        String datos = this.calle + " " + this.localidad + " " + this.num + " " +  NumPiso;
        return datos;
    }

}
