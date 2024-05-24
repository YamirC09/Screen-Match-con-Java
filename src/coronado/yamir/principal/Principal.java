package coronado.yamir.principal;

import coronado.yamir.screenmatch.modelos.Episodio;
import coronado.yamir.screenmatch.modelos.Pelicula;
import coronado.yamir.screenmatch.modelos.Serie;
import coronado.yamir.scrrenmatch.calculos.CalculadoraTiempo;
import coronado.yamir.scrrenmatch.calculos.FiltroRecomendacion;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        var miPelicula = new Pelicula("Matrix", 2021);

        miPelicula.setDuracionMinutos(120);
        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(9);
        miPelicula.evalua(10);
        miPelicula.evalua(7.6);
        miPelicula.setIncluidoEnPlan(false);

        var miPelicula2 = new Pelicula("No se aceptan devoluciones", 2018);
        miPelicula2.setDuracionMinutos(130);

        Serie peakyBlinders = new Serie("Peaky Blinders", 2014);
        peakyBlinders.setTemporadas(6);
        peakyBlinders.setEpisodiosPorTemporada(6);
        peakyBlinders.setMinutosPorTemporadas(330);
        peakyBlinders.setIncluidoEnPlan(true);
        peakyBlinders.evalua(9.8);
        peakyBlinders.evalua(9.7);
        peakyBlinders.evalua(10);
        peakyBlinders.muestraFichaTecnica();

        CalculadoraTiempo calculadora =  new CalculadoraTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(miPelicula2);
        calculadora.incluye(peakyBlinders);
        System.out.println(calculadora.getTiempoTotal());


        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();
        filtroRecomendacion.filtra(miPelicula);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("Primer episodio");
        episodio.setSerie(peakyBlinders);
        episodio.setTotalReproducciones(50);

        filtroRecomendacion.filtra(episodio);

        var peliculaDeSpirit = new Pelicula("Spirit: El corcel indomable", 2016);
        peliculaDeSpirit.setDuracionMinutos(150);



        ArrayList<Pelicula> listaPeliculas = new ArrayList<>();
        listaPeliculas.add(peliculaDeSpirit);
        listaPeliculas.add(miPelicula);
        listaPeliculas.add(miPelicula2);

        System.out.println("Tamaño de la lista: " + listaPeliculas.size());
        System.out.println("La primera pelicula es: " + listaPeliculas.get(0));

        System.out.println(listaPeliculas);

        System.out.println(listaPeliculas.get(0));
    }
}