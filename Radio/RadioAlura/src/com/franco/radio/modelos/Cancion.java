package com.franco.radio.modelos;

public class Cancion extends Audio {
    private String albun;
    private String cantante;
    private String titulo;
    private String genero;

    @Override
    public int getClasificacion() {
        if (getTotalDeMeGusta() > 5000){
            return 8;
        } else {
            return 4;
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAlbun() {
        return albun;
    }

    public void setAlbun(String albun) {
        this.albun = albun;
    }

    public String getCantante() {
        return cantante;
    }

    public void setCantante(String cantante) {
        this.cantante = cantante;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }


}
