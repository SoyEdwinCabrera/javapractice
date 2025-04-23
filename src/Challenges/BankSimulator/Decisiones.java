package Challenges.BankSimulator;

public class Decisiones {

    public static void main(String[] args) {
        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = false;
        double notaDeLaPelicula = 8.2;
        String tipoPlan = "plus";

//      Código que prueba los operadores relacionales
        if(fechaDeLanzamiento > 2022) {
            System.out.println("Péliculas más populares");
        } else {
            System.out.println("Película Retro que aún vale la pena ver.");
        };

        if(incluidoEnElPlan && tipoPlan.equals("plus")) {
            System.out.println("Puedes ver la película.");
        } else {
            System.out.println("No puedes ver la película.");
        };
    }
}
