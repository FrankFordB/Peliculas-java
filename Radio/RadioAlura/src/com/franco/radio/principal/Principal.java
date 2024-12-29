package com.franco.radio.principal;

import com.franco.radio.modelos.Cancion;
import com.franco.radio.modelos.MisFavoritos;
import com.franco.radio.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Cancion miCancion = new Cancion();
        miCancion.setTitulo("Welcome to the Jungle.");
        miCancion.setCantante("Axel Roses. ");
        miCancion.setAlbun("Destrucciotion. ");

        Podcast miPodcast = new Podcast();
        miPodcast.setPresentador("Franco");
        miPodcast.setTitulo("Cafe al plato. ");

        for (int i = 0; i < 100; i++) {
            miCancion.meGusta();
        }
        for (int i = 0; i < 5000; i++) {
            miCancion.reproduce();
        }
        for (int i = 0; i < 100; i++) {
            miPodcast.meGusta();
        }
        for (int i = 0; i < 5000; i++) {
            miPodcast.reproduce();
        }



        System.out.println(miCancion.getTotalDeMeGusta());
        System.out.println(miCancion.getTotalDeReproducciones());

        MisFavoritos favoritos = new MisFavoritos();
        favoritos.adiciona(miPodcast);
        favoritos.adiciona(miCancion);

    }
}
