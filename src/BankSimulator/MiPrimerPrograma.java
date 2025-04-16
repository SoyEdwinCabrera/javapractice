package BankSimulator;

public class MiPrimerPrograma {
    public static void elPrograma (){
    System.out.println("Bienvenid@ a Screen Match");
    System.out.println("Película: Matrix");

    int fechaDeLanzamiento = 1999;
    boolean incluidoEnElPlan = true;
    double notaDeLaPelicula = 8.2;

    double media = (8.2 + 6.0 + 9.0)/3;
    System.out.println("La media de las calificaciones es: " + media);

    String sinopsis = """
            Un hacker llamado Neo investiga sobre una misteriosa realidad 
            llamada Matrix y se une a un grupo de rebeldes que luchan 
            contra las máquinas que dominan el mundo.
            Fue lanzada en el año:
            """ + fechaDeLanzamiento;
        System.out.println(sinopsis);

        int clasificacion = (int) (media /2);
        System.out.println(clasificacion);


    }
}