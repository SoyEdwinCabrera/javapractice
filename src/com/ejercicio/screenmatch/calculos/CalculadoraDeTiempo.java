package com.ejercicio.screenmatch.calculos;

import com.ejercicio.screenmatch.modelos.Pelicula;
import com.ejercicio.screenmatch.modelos.Serie;
import com.ejercicio.screenmatch.modelos.Titulo;

public class CalculadoraDeTiempo {

    private int tiempoTotal;

    public int getTiempoTotal() {
        return tiempoTotal;
    }

    public void incluir(Titulo titulo) {
        tiempoTotal += titulo.getDuracionEnMinutos();
    }
}
