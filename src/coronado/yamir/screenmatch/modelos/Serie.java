package coronado.yamir.screenmatch.modelos;

import java.util.Comparator;

public class Serie extends Titulo{
    int temporadas;
    int minutosPorTemporadas;
    int episodiosPorTemporada;

    public Serie(String nombre, int fechaLanzamiento) {
        super(nombre, fechaLanzamiento);
    }

    @Override
    public int getDuracionMinutos() {
        return getTemporadas() * getEpisodiosPorTemporada() * getMinutosPorTemporadas();
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getMinutosPorTemporadas() {
        return minutosPorTemporadas;
    }

    public void setMinutosPorTemporadas(int minutosPorTemporadas) {
        this.minutosPorTemporadas = minutosPorTemporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    @Override
    public String toString() {
        return "Serie: " + this.getNombre() + " (" + getFechaLanzamiento() +")";
    }



}
