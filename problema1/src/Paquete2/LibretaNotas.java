package Paquete2;

public class LibretaNotas {

    private String nombreEstudiante;
    private double calificacion1;
    private double calificacion2;
    private double calificacion3;
    private double promedio;

    public LibretaNotas(String n, double c1, double c2, double c3) {
        nombreEstudiante = n;
        calificacion1 = c1;
        calificacion2 = c2;
        calificacion3 = c3;
    }

    public LibretaNotas(String n, double c1, double c2) {
        nombreEstudiante = n;
        calificacion1 = c1;
        calificacion2 = c2;
        calificacion3 = 10;
    }
    
    public String toString(){
        String cadena = String.format("Libreta de notas:"
                + "Nombre del Estudiante: %s\n"
                + "Calificacion 1: %.3f\n"
                + "Calificacion 2: %.3f\n"
                + "Calificacion 3: %.3f\n"
                + "Promedio: %.2f\n",
                nombreEstudiante,
                calificacion1,
                calificacion2,
                calificacion3,
                promedio);
        return cadena;
    }

    public void establecerNombreEstudiante(String x) {
        nombreEstudiante = x;
    }

    public void establecerCalificacion1(double x) {
        calificacion1 = x;
    }

    public void establecerCalificacion2(double x) {
        calificacion2 = x;
    }

    public void establecerCalificacion3(double x) {
        calificacion3 = x;
    }

    public void calcularPromedio() {
        promedio = (calificacion1 + calificacion2 + calificacion3) / 3;
    }

    public String obtenerNombreEstudiante() {
        return nombreEstudiante;
    }

    public double obtenerCalificaion1() {
        return calificacion1;
    }

    public double obtenerCalificacion2() {
        return calificacion2;
    }

    public double obtenerCalificacion3() {
        return calificacion3;
    }

    public double obtenerPromedio() {
        return promedio;
    }
}
