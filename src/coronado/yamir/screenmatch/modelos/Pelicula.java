package coronado.yamir.screenmatch.modelos;

import coronado.yamir.scrrenmatch.calculos.Clasificacion;

public class Pelicula extends Titulo implements Clasificacion {
    private String director;


    public Pelicula(String nombre, int fechaLanzamiento) {
        super(nombre, fechaLanzamiento);
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClasificacion() {
        return (int) calculaMedia() / 2;
    }

    @Override
    public String toString() {
        return this.getNombre() + " (" + this.getFechaLanzamiento() + ")";
    }
}
