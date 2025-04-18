package IfElse;

import java.util.Locale;
import java.util.Scanner;

public class VerificacionDiaSemana {
    public void verificacion(){

        Scanner superscanner = new Scanner(System.in);
        System.out.println("Ingrese un dia de la semana");
        String dia = (superscanner.nextLine()).toLowerCase();

        if (dia.equals("lunes") || dia.equals("martes") || dia.equals("miercoles") || dia.equals("jueves") || dia.equals("viernes")) {
            System.out.println(dia + " Es un día hábil");
        } else if (dia.equals("sabado") || dia.equals("domingo")) {
            System.out.println(dia + " No es un día hábil");
        } else {
            System.out.println(dia + " No es un dia de la semana");
        }
    }
}
