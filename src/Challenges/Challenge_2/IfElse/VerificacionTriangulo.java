package Challenge_2.IfElse;

import java.util.Scanner;

public class VerificacionTriangulo {
    public void verificacion(){
        Scanner superscanner = new Scanner(System.in);
        System.out.println("Ingrese el primer lado del triángulo: ");
        double side1 = superscanner.nextDouble();
        System.out.println("Ingrese el segundo lado del triángulo: ");
        double side2 = superscanner.nextDouble();
        System.out.println("Ingrese el tercer lado del triángulo: ");
        double side3 = superscanner.nextDouble();

        if ((side1 + side2)>side3){
            System.out.println("Los lados pueden formar un triángulo");
        } else {
            System.out.println("Los lados NO pueden formar un triángulo");
        }
    }
}
