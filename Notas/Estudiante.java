package Notas;

public class Estudiante extends Persona {
    private double promedio;

    public Estudiante(String nombre, String programa, double promedio) {
        super(nombre, programa);
        this.promedio = promedio;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " | Carrera: " + programa + " | Promedio: " + promedio;
    }
}