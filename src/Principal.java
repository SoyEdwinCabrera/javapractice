import com.ejercicio.screenmatch.modelos.Pelicula;
import com.ejercicio.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.setNombre("El Señor de los Anillos");
        miPelicula.setFechaDeLanzamiento(2001);
        miPelicula.setDuracionEnMinutos(178);

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(10);
        miPelicula.evalua(10);
        miPelicula.evalua(10);
        System.out.println(miPelicula.getTotalDeEvaluaciones());
        System.out.println(miPelicula.calculaNotaMedia());

        Serie casaDePapel = new Serie();
        casaDePapel.setNombre("La Casa de Papel");
        casaDePapel.setFechaDeLanzamiento(2017);
        casaDePapel.setTemporadas(6);
        casaDePapel.setMinutosPorEpisodio(40);
        casaDePapel.setEpisodiosPorTemporada(8);
        casaDePapel.muestraFichaTecnica();
        System.out.println(casaDePapel.getDuracionEnMinutos());
    }
}

