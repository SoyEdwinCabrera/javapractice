import com.ejercicio.screenmatch.modelos.Pelicula;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.nombre = "El Señor de los Anillos";
        miPelicula.fechaDeLanzamiento = 2001;
        miPelicula.duracionEnMinutos = 178;

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(10);
        miPelicula.evalua(10);
        miPelicula.evalua(10);
        System.out.println(miPelicula.getTotalDeEvaluaciones());
        System.out.println(miPelicula.calculaNotaMedia());





//        com.ejercicio.screenmatch.modelos.Pelicula otraPelicula = new com.ejercicio.screenmatch.modelos.Pelicula();
//        otraPelicula.nombre = "El Hobbit";
//        otraPelicula.fechaDeLanzamiento = 2012;
//        otraPelicula.duracionEnMinutos = 169;
//
//        //otraPelicula.muestraFichaTecnica();
    }
}

