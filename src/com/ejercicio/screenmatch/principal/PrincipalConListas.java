package com.ejercicio.screenmatch.principal;

import com.ejercicio.screenmatch.modelos.Pelicula;
import com.ejercicio.screenmatch.modelos.Serie;
import com.ejercicio.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalConListas {
    public static void main(String[] args) {

        Pelicula miPelicula = new Pelicula("El Señor de los Anillos", 2001);
        miPelicula.evalua(9);
        Pelicula otraPelicula = new Pelicula("El Hobbit", 2012);
        otraPelicula.evalua(6);
        var peliculaDeAccion = new Pelicula("Misión Imposible", 1996);
        peliculaDeAccion.evalua(10);
        Serie casaDePapel = new Serie("La Casa de Papel", 2017);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(miPelicula);
        lista.add(otraPelicula);
        lista.add(peliculaDeAccion);
        lista.add(casaDePapel);

        for(Titulo titulo : lista) {
            System.out.println(titulo);
            Pelicula pelicula = (Pelicula) titulo;
            System.out.println(pelicula.getClasificacion());
//            System.out.println("La fecha de lanzamiento es: " + titulo.getFechaDeLanzamiento());
//            System.out.println("La duración en minutos es: " + titulo.getDuracionEnMinutos());
//            System.out.println("¿Está incluido en el plan? " + titulo.isIncluidoEnElPlan());
//            System.out.println();
        }
    }
}
