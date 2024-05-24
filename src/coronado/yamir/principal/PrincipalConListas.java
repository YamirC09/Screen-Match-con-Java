package coronado.yamir.principal;

import coronado.yamir.screenmatch.modelos.Pelicula;
import coronado.yamir.screenmatch.modelos.Serie;
import coronado.yamir.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalConListas {
    public static void main(String[] args) {
        var peliculaDeSpirit = new Pelicula("Spirit: El corcel indomable", 2016);
        peliculaDeSpirit.evalua(10);
        var miPelicula = new Pelicula("Matrix", 2021);
        miPelicula.evalua(8);
        var miPelicula2 = new Pelicula("No se aceptan devoluciones", 2018);
        miPelicula2.evalua(8);
        Serie peakyBlinders = new Serie("Peaky Blinders", 2014);

       Pelicula favorita = new Pelicula("El señor de los anillos", 2001);
        favorita.evalua(10);

        Pelicula otra = new Pelicula("John Wick", 2014);
        otra.evalua(9);

        Serie serie = new Serie("La Casa de Papel", 2017);

        ArrayList<Titulo> listaTitulos = new ArrayList<>();
        listaTitulos.add(peliculaDeSpirit);
        listaTitulos.add(miPelicula);
        listaTitulos.add(miPelicula2);
        listaTitulos.add(peakyBlinders);

        for(Titulo item : listaTitulos){
            System.out.println(item.getNombre());
            if (item instanceof Pelicula pelicula && pelicula.getClasificacion() >3){
            System.out.println("Clasificacion: " + pelicula.getClasificacion());

        }}

        ArrayList<String> listaArtistas = new ArrayList<>();
        listaArtistas.add("Messi");
        listaArtistas.add("Cristiano");
        listaArtistas.add("Neymar");
        System.out.println(listaArtistas);

        Collections.sort(listaArtistas);
        System.out.println("Artistas: " + listaArtistas);

        Collections.sort(listaTitulos);
        System.out.println("Titulos ordenados: " + listaTitulos);

        listaTitulos.sort(Comparator.comparing(Titulo::getFechaLanzamiento));
        System.out.println("Lista ordenada por fecha: " + listaTitulos);
    }
}
