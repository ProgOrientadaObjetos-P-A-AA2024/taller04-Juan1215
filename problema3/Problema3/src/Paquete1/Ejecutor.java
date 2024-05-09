package Paquete1;

import Paquete2.Automotor;

public class Ejecutor {

    public static void main(String[] args) {

        Automotor auto = new Automotor("1150578064", "Chevrolet",
                2001, 45000);
        auto.calcularValorMatricula();
        
        Automotor auto2 = new Automotor("1160348064", "Nissan", 2014);
        auto2.calcularValorMatricula();

        System.out.printf("%s\n", auto);
        System.out.printf("%s\n", auto2);
    }
}
