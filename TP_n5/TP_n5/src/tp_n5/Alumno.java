package tp_n5;

public class Alumno extends Persona{
    
    private String curso;
    private String turno;
    private double promedio;

    public Alumno( String nombre, int edad, String curso, String turno, double promedio) {
        super(nombre, edad);
        this.curso = curso;
        this.turno = turno;
        this.promedio = promedio;
    }
    public void mostrarDatos(){ 
    super.mostrardatos();
    System.out.println("curso: " + this.curso + "n\turno: " + this.turno);
    System.out.println("promedio: " + this.promedio);
    }

    public String getCurso() {
        return curso;
    }

    public String getTurno() {
        return turno;
    }

    public double getPromedio() {
        return promedio;
    }
}
