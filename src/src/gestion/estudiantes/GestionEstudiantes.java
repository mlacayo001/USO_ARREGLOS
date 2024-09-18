package gestion.estudiantes;

import java.util.ArrayList;

public class GestionEstudiantes {
    private ArrayList<Estudiante> estudiantes;

    // Constructor
    public GestionEstudiantes() {
        estudiantes = new ArrayList<>();
    }

    // Método para agregar un estudiante
    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    // Método para mostrar todos los estudiantes
    public void mostrarEstudiantes() {
        for (Estudiante estudiante : estudiantes) {
            System.out.println("Nombre: " + estudiante.getNombre());
            System.out.println("Edad: " + estudiante.getEdad());
            System.out.println("Promedio: " + estudiante.getPromedio());
            System.out.println();
        }
    }

    // Método para calcular el promedio de los promedios
    public double calcularPromedioDePromedios() {
        double sumaPromedios = 0;
        for (Estudiante estudiante : estudiantes) {
            sumaPromedios += estudiante.getPromedio();
        }
        return estudiantes.size() > 0 ? sumaPromedios / estudiantes.size() : 0;
    }
}