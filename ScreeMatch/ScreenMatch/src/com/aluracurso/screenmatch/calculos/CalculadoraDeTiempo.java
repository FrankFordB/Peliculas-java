package com.aluracurso.screenmatch.calculos;

import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;
import com.aluracursos.screenmatch.modelos.Titulo;

import java.util.Objects;

public class CalculadoraDeTiempo {
    private int timpoTotal;

    public int getTimpoTotal() {
        return timpoTotal;
    }

    public void incluye(Titulo titulo) {
        this.timpoTotal += titulo.getDuracionEnMinutos();
    }

    public void incluido (Titulo titulo) {
        System.out.println("agregando duracion en minutos" + titulo);
        this.timpoTotal += titulo.getDuracionEnMinutos();
    }
}
