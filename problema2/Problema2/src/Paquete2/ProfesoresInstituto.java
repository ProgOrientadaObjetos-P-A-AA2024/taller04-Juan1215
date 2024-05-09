package Paquete2;

public class ProfesoresInstituto {

    private String nombre;
    private String apellido;
    private double sueldoBasico;
    private double sueldoTotal;
    private String cedula;

    public ProfesoresInstituto(String nom, String ape, double sueldo, String ced) {
        nombre = nom;
        apellido = ape;
        sueldoBasico = sueldo;
        cedula = ced;
    }

    public ProfesoresInstituto(String nom, String ape, String ced) {
        nombre = nom;
        apellido = ape;
        sueldoBasico = 1400;
        cedula = ced;
    }

    public void establecerNombre(String s) {
        nombre = s;
    }

    public void establecerApellido(String s) {
        apellido = s;
    }

    public void establecerSueldoBasico(double s) {
        sueldoBasico = s;
    }

    public void calcularSueldoTotal() {
        sueldoTotal = sueldoBasico + (sueldoBasico * 0.20);
    }

    public void establecerCedula(String s) {
        cedula = s;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public double obtenerSueldoBasico() {
        return sueldoBasico;
    }

    public double obtenerSueldoTotal() {
        return sueldoTotal;
    }

    public String obtenerCedula() {
        return cedula;
    }
    
    public String toString(){
        String cadena = String.format("Profesores del Instituto\n"
                + "Nombre del profesor: %s\n"
                + "Apellido del profesor: %s\n"
                + "Sueldo Basico: %.2f\n"
                + "Sueldo Total: %.2f\n"
                + "Cedula del profesor: %s\n",
                nombre,
                apellido,
                sueldoBasico,
                sueldoTotal,
                cedula);
        return cadena;
    }
}
