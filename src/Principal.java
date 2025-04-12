public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.nombre = "El Señor de los Anillos";
        miPelicula.fechaDeLanzamiento = 2001;
        miPelicula.duracionEnMinutos = 178;

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(10);
        miPelicula.evalua(10);

        System.out.println(miPelicula.sumaDeLasEvaluaciones);
        System.out.println(miPelicula.totalDeEvaluaciones);
        System.out.println(miPelicula.calculaNotaMedia());

        Pelicula otraPelicula = new Pelicula();
        otraPelicula.nombre = "El Hobbit";
        otraPelicula.fechaDeLanzamiento = 2012;
        otraPelicula.duracionEnMinutos = 169;

        //otraPelicula.muestraFichaTecnica();
    }
}

