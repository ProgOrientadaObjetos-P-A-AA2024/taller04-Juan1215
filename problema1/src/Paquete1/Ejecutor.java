
package Paquete1;
import Paquete2.LibretaNotas;

public class Ejecutor {

    public static void main(String[] args) {
       
        LibretaNotas libreta1 = new LibretaNotas("Juan", 10, 10, 9);
        libreta1.calcularPromedio();
        LibretaNotas libreta2 = new LibretaNotas("Diego", 5, 5);
        libreta2.calcularPromedio();
        System.out.printf("%s\n", libreta1);
        System.out.printf("%s\n", libreta2);
    }
    
}
