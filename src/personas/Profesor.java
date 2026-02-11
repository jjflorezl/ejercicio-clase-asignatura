package personas;

public class Profesor extends Persona{
    private String especialidad;

    public Profesor(String nombre, String identificacion, String especialidad) {
        super(nombre, identificacion);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    @Override
    public void presentarse(){
        System.out.println("Hola soy profesor y mi nombre es: "+nombre);
    }
}
