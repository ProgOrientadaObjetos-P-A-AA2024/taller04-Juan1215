package Paquete2;

public class Cheques {

    private String nombreCliente;
    private String nombreBanco;
    private double valorCheque;
    private double comicion;

    public Cheques(String nom, String nomB, double val) {
        nombreCliente = nom;
        nombreBanco = nomB;
        valorCheque = val;
    }

    public Cheques(String nom, double val) {
        nombreCliente = nom;
        nombreBanco = "Banco de Loja";
        valorCheque = val;
    }

    public void establecerNombreCliente(String s) {
        nombreCliente = s;
    }

    public void establecerNombreBanco(String s) {
        nombreBanco = s;
    }

    public void establecerValorCheque(double s) {
        valorCheque = s;
    }

    public void calcularComicion() {
        comicion = valorCheque * 0.00003;
    }

    public String obtenerNombreCliente() {
        return nombreCliente;
    }

    public String obtenerNombreBanco() {
        return nombreBanco;
    }

    public double obtenerValorCheque() {
        return valorCheque;
    }

    public double obtenerComicion() {
        return comicion;
    }

    public String toString() {
        String cadena = String.format("Manejo de cheques\n"
                + "Nombre del Cliente: %s\n"
                + "Nombre del Banco: %s\n"
                + "Valor del Cheque: %.2f\n"
                + "Comicion: %.4f\n",
                nombreCliente,
                nombreBanco,
                valorCheque,
                comicion);
        return cadena;
    }
}
