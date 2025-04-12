public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.nombre = "El Señor de los Anillos";
        miPelicula.fechaDeLanzamiento = 2001;
        miPelicula.duracionEnMinutos = 178;

        System.out.println("Mi película es: " + miPelicula.nombre);
        System.out.println("Su fecha de lanzamiento es: " + miPelicula.fechaDeLanzamiento);

        Pelicula otraPelicula = new Pelicula();
        otraPelicula.nombre = "El Hobbit";
        otraPelicula.fechaDeLanzamiento = 2012;
        otraPelicula.duracionEnMinutos = 169;

        System.out.println("Mi otra película es: " + otraPelicula.nombre);
        System.out.println("Su fecha de lanzamiento es: " + otraPelicula.fechaDeLanzamiento);
    }
}
