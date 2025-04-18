package IfElse;

import java.util.Scanner;

public class AprobacionAsignatura {
    public void aprobacionAsignatura(){
        Scanner superscanner = new Scanner(System.in);
        System.out.println("Introduce la nota promedio del estudiante: ");
        double media = superscanner.nextDouble();

        if (media >= 7.0) {
            System.out.println("El estudiante ha sido APROBADO");
        } else if (media >= 5.0 && media <= 6.9) {
            System.out.println("El estudiante está en RECUPERACIÓN");
        } else {
            System.out.println("El estudiante ha sido REPROBADO");
        }
        superscanner.close();
    }
}
