package BankSimulator;

import java.util.Scanner;

public class Lectura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe el nombre de tu película favorita:");
        String pelicula = scanner.nextLine();
        System.out.println("Escribe el año de lanzamiento:");
        int fechaDeLanzamiento = scanner.nextInt();
        System.out.println("Escribe la calificación de la película:");
        double nota = scanner.nextDouble();

        System.out.println(pelicula);
        System.out.println(fechaDeLanzamiento);
        System.out.println(nota);
    }
}
