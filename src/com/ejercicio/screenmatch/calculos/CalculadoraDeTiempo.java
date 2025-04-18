package com.ejercicio.screenmatch.calculos;

import com.ejercicio.screenmatch.modelos.Pelicula;
import com.ejercicio.screenmatch.modelos.Serie;
import com.ejercicio.screenmatch.modelos.Titulo;

public class CalculadoraDeTiempo {

    private int tiempoTotal;

    public int getTiempoTotal() {
        return this.tiempoTotal;
    }

//
//    public void incluir(Pelicula pelicula) {
//        tiempoTotal += pelicula.getDuracionEnMinutos();
//    }
//    public void incluir(Serie serie) {
//        tiempoTotal += serie.getDuracionEnMinutos();
//    }
//
// Al tener dos métodos con el mismo nombre y diferentes parámetros,
// Java sabe cuál invocar dependiendo del tipo de objeto que le pasemos.
// Creando una clase mas genérica.

    public void incluir(Titulo titulo) {
        System.out.println("Agregando duración en minutos de " + titulo.getNombre());
        this.tiempoTotal += titulo.getDuracionEnMinutos();
    }
}
