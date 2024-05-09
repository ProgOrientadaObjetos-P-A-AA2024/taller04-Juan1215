package Paquete2;

public class Automotor {

    private String cedulaDuenio;
    private String marcaVehiculo;
    private int anioFabricacion;
    private double valorVehiculo;
    private double valorMatricula;

    public Automotor(String ced, String marc, int anio, double val) {
        cedulaDuenio = ced;
        marcaVehiculo = marc;
        anioFabricacion = anio;
        valorVehiculo = val;
    }

    public Automotor(String ced, String marc, int anio) {
        cedulaDuenio = ced;
        marcaVehiculo = marc;
        anioFabricacion = anio;
        valorVehiculo = 40000;
    }

    public void establecerCedulaDuenio(String s) {
        cedulaDuenio = s;
    }

    public void establecerMarcaVehiculoo(String s) {
        marcaVehiculo = s;
    }

    public void establecerAnioFabricacion(int s) {
        anioFabricacion = s;
    }

    public void establecerValorVehiculo(double s) {
        valorVehiculo = s;
    }

    public void calcularValorMatricula() {
        valorMatricula = (0.00002 * valorVehiculo) * (2024 - anioFabricacion);
    }

    public String obtenerCedulaDuenio() {
        return cedulaDuenio;
    }

    public String obtenerMarcaVehiculo() {
        return marcaVehiculo;
    }

    public int obtenerAnioFabricacion() {
        return anioFabricacion;
    }

    public double obtenerValorVehiculo() {
        return valorVehiculo;
    }

    public double obtenerValorMatricula() {
        return valorMatricula;
    }

    public String toString() {
        String cadena = String.format("Informacion Automotor\n"
                + "Cedula del Duenio: %s\n"
                + "Marca del Vehiculo: %s\n"
                + "Anio de Fabricacion: %d\n"
                + "Valor del Vehiculo: %.2f\n"
                + "Valor de la Matricula: %.2f\n",
                cedulaDuenio,
                marcaVehiculo,
                anioFabricacion,
                valorVehiculo,
                valorMatricula);
        return cadena;
    }
}
