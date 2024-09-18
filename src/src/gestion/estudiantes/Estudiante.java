package gestion.estudiantes;

public class Estudiante {
    private String nombre;
    private int edad;
    private double promedio;

    // Constructor
    public Estudiante(String nombre, int edad, double promedio) {
        this.nombre = nombre;
        this.edad = edad;
        if(promedio >= 0 && promedio <= 100) {
            this.promedio = promedio;
        } else {
            throw new IllegalArgumentException("El promedio debe estar entre 0 y 100");
        }
    }

    // Métodos Getter
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getPromedio() {
        return promedio;
    }

    // Métodos Setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;
        } else {
            throw new IllegalArgumentException("La edad debe ser mayor a 0");
        }
    }

    public void setPromedio(double promedio) {
        if(promedio >= 0 && promedio <= 100) {
            this.promedio = promedio;
        } else {
            throw new IllegalArgumentException("El promedio debe estar entre 0 y 100");
        }
    }
}