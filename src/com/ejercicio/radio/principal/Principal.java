package com.ejercicio.radio.principal;

import com.ejercicio.radio.modelos.Cancion;
import com.ejercicio.radio.modelos.Podcast;

public class Principal {

    public  void principal() {
        // Crear una instancia de la clase Principal
        Cancion miCancion = new Cancion();
        miCancion.setTitulo("Forever");
        miCancion.setArtista("Kiss");

        Podcast miPodcast = new Podcast();
        miPodcast.setPresentador("Gabriela Aguar");
        miPodcast.setTitulo("Rock del Mundo");

        for (int i = 0; i < 100; i++) {
            miCancion.meGusta();
        }
        for (int i = 0; i < 5000; i++) {
            miCancion.reproducir();
        }

        System.out.println("Total reproduciones: " + miCancion.getTotalDeReproducciones());
        System.out.println("Total de me Gusta: " + miCancion.getTotalDeMeGusta());
    }
}
