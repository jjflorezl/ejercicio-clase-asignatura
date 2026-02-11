package personas;
import asignaturas.Asignatura;

public class Estudiante extends Persona {
    private String codigo;
    private Asignatura asignatura;

    public Estudiante(String nombre, String identificacion, String codigo) {
        super(nombre, identificacion);
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    @Override
    public void presentarse(){
        System.out.println("Hola soy estudiante y mi nombre es: "+nombre);
    }
}
