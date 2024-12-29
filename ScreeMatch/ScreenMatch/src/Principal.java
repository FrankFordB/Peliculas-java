import com.aluracurso.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracurso.screenmatch.calculos.FiltroRecomendacion;
import com.aluracursos.screenmatch.modelos.Episodio;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;

import java.util.ArrayList;
import java.util.Objects;

public class Principal {


    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("encantados", 2021);
        miPelicula.setDuracionEnMinutos(120);

        Pelicula otraPelicula = new Pelicula("mexo",2221);
        miPelicula.setDuracionEnMinutos(190);

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(10);
        miPelicula.evalua(10);

        System.out.println(miPelicula.getTotalDeLasEvaluaciones());
        System.out.println(miPelicula.calculaMedia());

        System.out.println("***********************************************");
        System.out.println(miPelicula.getNombre());
        System.out.println(miPelicula.getDuracionEnMinutos());

        Serie casaDragon = new Serie("La Casa del dragon", 2022);
                casaDragon.setTemporada(1);
        casaDragon.setMinutosPorEpisodios(50);
        casaDragon.setEpisodiosPorTemporada(10);
        casaDragon.muestraFichaTecnica();

        System.out.println(casaDragon.getDuracionEnMinutos());
        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(casaDragon);
        System.out.println("tiempo necesario para ver el titulo " + calculadora.getTimpoTotal());

        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();
        filtroRecomendacion.filtra(miPelicula);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("La casa ");
        episodio.setSerie(casaDragon);
        episodio.setTotalVisualizaciones(0);
        filtroRecomendacion.filtra(episodio);

        var peliculaDeBruno = new Pelicula("encanto",2001);
        peliculaDeBruno.setDuracionEnMinutos(180);


        ArrayList<Pelicula> listaDePeliculas = new ArrayList<>();
        listaDePeliculas.add(peliculaDeBruno);
        listaDePeliculas.add(miPelicula);
        listaDePeliculas.add(otraPelicula);
        System.out.println(listaDePeliculas.size());
        System.out.println(listaDePeliculas.get(0).getNombre());
        System.out.println("toString de la peli " + listaDePeliculas.get(0).toString());



    }
}
