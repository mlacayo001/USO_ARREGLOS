package gestion.estudiantes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de GestionEstudiantes
        GestionEstudiantes gestion = new GestionEstudiantes();
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            // Solicitar datos del estudiante
            System.out.println("Ingrese el nombre del estudiante:");
            String nombre = scanner.nextLine();

            System.out.println("Ingrese la edad del estudiante:");
            int edad = scanner.nextInt();

            System.out.println("Ingrese el promedio del estudiante (0 - 100):");
            double promedio = scanner.nextDouble();

            // Validar la entrada de promedio y edad
            try {
                // Crear un nuevo estudiante con los datos proporcionados
                Estudiante estudiante = new Estudiante(nombre, edad, promedio);
                // Agregar el estudiante a la gestión
                gestion.agregarEstudiante(estudiante);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            // Preguntar si desea agregar otro estudiante
            System.out.println("¿Desea agregar otro estudiante? (s/n)");
            scanner.nextLine();  // Limpiar el buffer del scanner
            String respuesta = scanner.nextLine();
            if (!respuesta.equalsIgnoreCase("s")) {
                continuar = false;
            }
        }

        // Mostrar todos los estudiantes
        System.out.println("\nLista de estudiantes:");
        gestion.mostrarEstudiantes();

        // Calcular y mostrar el promedio de los promedios
        System.out.println("Promedio de los promedios: " + gestion.calcularPromedioDePromedios());

        scanner.close();  // Cerramos el scanner
    }
}