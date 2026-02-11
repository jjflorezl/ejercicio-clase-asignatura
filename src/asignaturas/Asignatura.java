package asignaturas;

import personas.Estudiante;
import personas.Profesor;

import java.util.ArrayList;

public class Asignatura {
    private String nombre;
    private Profesor profesor;
    private ArrayList<Estudiante> estudiantes = new ArrayList<>();
    private int inscritos;
    private boolean dinamico;
    private int cupo;


    public Asignatura(String nombre, Profesor profesor, boolean dinamico, int cupo) {
        this.nombre = nombre;
        this.profesor = profesor;
        this.dinamico = dinamico;
        this.cupo = cupo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public int getInscritos() {
        return inscritos;
    }

    public void setInscritos(int inscritos) {
        this.inscritos = inscritos;
    }

    public boolean isDinamico() {
        return dinamico;
    }

    public void setDinamico(boolean dinamico) {
        this.dinamico = dinamico;
    }

    public int getCupoInicial() {
        return cupo;
    }

    public void setCupoInicial(int cupoInicial) {
        this.cupo = cupoInicial;
    }

    public void expandirCupoInicial(int valor) {
        this.cupo += valor;
    }

    public boolean agregarEstudiante(String code, ArrayList<Estudiante> vector, String nombre, String identificacion) {
        if(cupo==0){
            System.out.println("no quedan suficientes cupos para añadir un estudiante");
            return false;
        }
        boolean existe = existeEstudiante(code, vector);
        if (existe) {
            this.estudiantes.add(new Estudiante(nombre, identificacion, code));
            inscritos++;
            cupo--;
            System.out.println("estudiante "+nombre+" agregado correctamente");
            return true;
        }
        return false;
    }


    public boolean existeEstudiante(String code, ArrayList<Estudiante> vector) {
        for (int i = 0; i < vector.size(); i++) {

            if (vector.get(i).getCodigo().equals(code)) {
                return true;
            }
        }
        System.out.println("no se encontro el estudiante");
        return false;
    }
    public void mostrarInfo(){
        System.out.println("Nombre de la asignatura: "+nombre);
        System.out.println("Profesor: "+profesor.getNombre());
        System.out.println("hay "+inscritos+" estudiantes inscritos y");
        System.out.println("los estudiantes inscritos son: ");
        for(int i=0;i<estudiantes.size();i++){
            System.out.println(estudiantes.get(i).getNombre());
        }
        System.out.println("quedan "+cupo+" cupos");


    }
}


