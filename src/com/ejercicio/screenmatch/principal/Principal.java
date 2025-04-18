package com.ejercicio.screenmatch.principal;

import com.ejercicio.screenmatch.calculos.CalculadoraDeTiempo;
import com.ejercicio.screenmatch.calculos.FiltroRecomendacion;
import com.ejercicio.screenmatch.modelos.Episodio;
import com.ejercicio.screenmatch.modelos.Pelicula;
import com.ejercicio.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("El Señor de los Anillos", 2001);
        miPelicula.setDuracionEnMinutos(178);

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(10);
        miPelicula.evalua(10);
        miPelicula.evalua(10);
        System.out.println(miPelicula.getTotalDeEvaluaciones());
        System.out.println(miPelicula.calculaNotaMedia());

        Serie casaDePapel = new Serie("La Casa de Papel", 2017);
        casaDePapel.setTemporadas(6);
        casaDePapel.setMinutosPorEpisodio(40);
        casaDePapel.setEpisodiosPorTemporada(8);
        casaDePapel.muestraFichaTecnica();
        System.out.println(casaDePapel.getDuracionEnMinutos());

        Pelicula otraPelicula = new Pelicula("El Hobbit", 2012);
        otraPelicula.setDuracionEnMinutos(180);

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluir(miPelicula);
        calculadora.incluir(casaDePapel);
        calculadora.incluir(otraPelicula);
        //System.out.println("Tiempo necesario para ver tus títulos favoritos estas vacaciones es de: " + calculadora.getTiempoTotal() + " minutos");

        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();
        filtroRecomendacion.filtrar(miPelicula);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("El primer capitulo de: La casa de papel");
        episodio.setSerie(casaDePapel);
        episodio.setTotalVisualizaciones(50);
        filtroRecomendacion.filtrar(episodio);

        var peliculaDeAccion = new Pelicula("Misión Imposible", 1996);
        peliculaDeAccion.setFechaDeLanzamiento(1996);

        ArrayList<Pelicula> listaDePeliculas = new ArrayList<>();
        listaDePeliculas.add(miPelicula);
        listaDePeliculas.add(otraPelicula);
        listaDePeliculas.add(peliculaDeAccion);

        System.out.println("Tamaño de la lista: " + listaDePeliculas.size());
        System.out.println("La pelicula es: " + listaDePeliculas.get(0).getNombre());
        System.out.println(listaDePeliculas.toString());
        System.out.println("toString de la pelicula: " + listaDePeliculas.get(0).toString());

        Object objeto = peliculaDeAccion;
    }
}

