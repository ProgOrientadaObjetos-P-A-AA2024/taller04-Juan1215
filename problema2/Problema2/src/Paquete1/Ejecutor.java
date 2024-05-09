package Paquete1;

import Paquete2.ProfesoresInstituto;

public class Ejecutor {

    public static void main(String[] args) {

        ProfesoresInstituto prof = new ProfesoresInstituto("Juan", "Villa",
                1000, "1150578098");
        prof.calcularSueldoTotal();
        
        ProfesoresInstituto prof2 = new ProfesoresInstituto("Diego", 
                "Alvarado", "1148570985");
        prof2.calcularSueldoTotal();

        System.out.printf("%s\n",prof);
        System.out.printf("%s\n", prof2);
    }
}
