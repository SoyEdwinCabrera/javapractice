package com.ejercicio.screenmatch.principal;

import com.ejercicio.screenmatch.modelos.Pelicula;
import com.ejercicio.screenmatch.modelos.Serie;
import com.ejercicio.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalConListas {
    public static void main(String[] args) {

        Pelicula miPelicula = new Pelicula("El Señor de los Anillos", 2001);
        miPelicula.evalua(9);
        Pelicula otraPelicula = new Pelicula("El Hobbit", 2012);
        otraPelicula.evalua(6);
        var peliculaDeAccion = new Pelicula("Misión Imposible", 1996);
        peliculaDeAccion.evalua(10);
        Serie casaDePapel = new Serie("La Casa de Papel", 2017);

        Pelicula p1 = peliculaDeAccion;

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(miPelicula);
        lista.add(otraPelicula);
        lista.add(peliculaDeAccion);
        lista.add(casaDePapel);

        for(Titulo item : lista) {
            System.out.println(item.getNombre());
            if (item instanceof Pelicula pelicula && pelicula.getClasificacion()>2) {
                System.out.println(pelicula.getClasificacion());
            }
        }

        ArrayList<String> listaDeArtistas = new ArrayList<>();
        listaDeArtistas.add("Penélope Cruz");
        listaDeArtistas.add("Antonio Banderas");
        listaDeArtistas.add("Robert Downey Jr.");
        System.out.println(listaDeArtistas);

        Collections.sort(listaDeArtistas);
        System.out.println("Lista de artistas ordenada: " + listaDeArtistas);

        Collections.sort(lista);
        System.out.println("Lista de títulos ordenada: " + lista);

        lista.sort(Comparator.comparing(Titulo::getFechaDeLanzamiento));
        System.out.println("Lista ordenada por fecha: " + lista);
    }
}
