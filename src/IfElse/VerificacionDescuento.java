package IfElse;

import java.util.Scanner;

public class VerificacionDescuento {

    public void descuento(){
        Scanner superscanner = new Scanner(System.in);
        System.out.println("Ingrese el precio del producto: ");
        double precio = superscanner.nextDouble();

        if (precio > 100.00){
            System.out.println("Descuento del 10% aplicado. Nuevo valor: " + (precio * 0.90));
        } else {
            System.out.println("Descuento NO aplicado. Valor total: " + precio);
        }
    }
}
