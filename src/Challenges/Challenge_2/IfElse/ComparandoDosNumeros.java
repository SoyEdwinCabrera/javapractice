package Challenge_2.IfElse;

import java.util.Scanner;

public class ComparandoDosNumeros {
    public void comparandoNumeros() {
        Scanner superscanner = new Scanner(System.in);
        System.out.println("Introduce el primer número: ");
        int numero1 = superscanner.nextInt();
        System.out.println("Introduce el segundo número: ");
        int numero2 = superscanner.nextInt();

        int a = 10;
        int b = 20;

        if (numero1 > numero2) {
            System.out.println("El número " + numero1 + " es mayor que " + numero2);
        } else if (numero1 < numero2) {
            System.out.println("El número " + numero1 + " es menor que " + numero2);
        } else {
            System.out.println("Los números son iguales");
        }
    }
}
