package com.franco.radio.modelos;

public class MisFavoritos {
    public void adiciona(Audio audio){
        if (audio.getClasificacion() >= 8) {
            System.out.println(audio.getTitulo() + "es favorito");
        } else {
            System.out.println(audio.getTitulo()+ "no es tan favorito");
        }
    }
}
