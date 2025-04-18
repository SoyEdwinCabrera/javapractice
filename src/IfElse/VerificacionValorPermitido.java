package IfElse;

import java.util.Scanner;

public class VerificacionValorPermitido {
    public void verificacion(){
        Scanner superscanner = new Scanner(System.in);
        System.out.println("Ingrese el valor del prétamo: ");
        double valor = superscanner.nextDouble();

        if (valor >= 1000 && valor <= 5000){
            System.out.println("El valor del préstamo es permitido");
        } else {
            System.out.println("El valor " + valor + " NO está dentro del intervalo permitido para el préstamo");
        }
    }
}
