package tp_n3;



public class Profesor extends Persona{
    
    
    private String curso;
    private String turno;
    private String materia;

    public Profesor(String nombre, int edad, String curso, String turno, String materia) {
        super(nombre, edad);
        this.curso = curso;
        this.turno = turno;
        this.materia = materia;
    }
    
    public void mostrarDatos(){  
    super.mostrardatos();
    System.out.println("curso: " + this.curso + "n\turno: " + this.turno);
    System.out.println("materia: " + this.materia);
    }

    public String getCurso() {
        return curso;
    }

    public String getTurno() {
        return turno;
    }

    public String getMateria() {
        return materia;
    }
    
}
