package com.ejercicio.radio.principal;

import com.ejercicio.radio.modelos.Cancion;
import com.ejercicio.radio.modelos.MisFavoritos;
import com.ejercicio.radio.modelos.Podcast;

public class Principal {

    public void principal() {
        // Crear una instancia de la clase com.ejercicio.screenmatch.principal.Principal
        Cancion miCancion = new Cancion();
        miCancion.setTitulo("Forever");
        miCancion.setArtista("Kiss");

        Podcast miPodcast = new Podcast();
        miPodcast.setPresentador("Gabriela Aguar");
        miPodcast.setTitulo("Rock del Mundo");

        // Canción
        for (int i = 0; i < 100; i++) {
            miCancion.meGusta();
        }
        for (int i = 0; i < 2000; i++) {
            miCancion.reproducir();
        }

        // Podcast
        for (int i = 0; i < 100; i++) {
            miPodcast.meGusta();
        }
        for (int i = 0; i < 8000; i++) {
            miPodcast.reproducir();
        }

        System.out.println("Total reproduciones: " + miCancion.getTotalDeReproducciones());
        System.out.println("Total de me Gusta: " + miCancion.getTotalDeMeGusta());

        MisFavoritos favoritos = new MisFavoritos();
        favoritos.agregar(miPodcast);
        favoritos.agregar(miCancion);
    }
}
