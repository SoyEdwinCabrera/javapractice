package IfElse;

import java.util.Scanner;

public class ParImpar {
    public int numero;

    Scanner superscanner = new Scanner(System.in);
    public ParImpar() {
        System.out.println("Introduce un número: ");
        this.numero = superscanner.nextInt();

        System.out.println((numero % 2 == 0)?"El número " + numero + " es par.":"El número " + numero + " es impar.");
    }
}
