import asignaturas.Asignatura;
import personas.Estudiante;
import personas.Profesor;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        ArrayList<Asignatura> asignaturas = new ArrayList<Asignatura>();
        ArrayList<Profesor> profesores = new ArrayList<Profesor>();
        ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();

        Estudiante e = new Estudiante("jj","12323eia","12345a");
        Estudiante e1 = new Estudiante("ss","12323oeia","1215a");
        estudiantes.add(e);
        estudiantes.add(e1);
        Profesor p = new Profesor("cc","12eia","43a");
        profesores.add(p);
        Asignatura a = new Asignatura("calculo",p,true,15);
        asignaturas.add(a);

        a.agregarEstudiante("12345a",estudiantes,"jj","12323eia");
        a.mostrarInfo();




    }
}