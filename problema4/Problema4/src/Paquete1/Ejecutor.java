
package Paquete1;
import Paquete2.Cheques;
public class Ejecutor {

    public static void main(String[] args) {
        
        Cheques ch = new Cheques("Pedro Alvarez", "Banco del Pichincha",
                5000);
        ch.calcularComicion();
        
        Cheques ch2 = new Cheques("Rosa Robles", 2107);
        ch2.calcularComicion();

        System.out.printf("%s\n", ch);
        System.out.printf("%s\n", ch2);
    }
}
    
