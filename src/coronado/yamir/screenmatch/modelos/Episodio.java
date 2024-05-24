package coronado.yamir.screenmatch.modelos;

import coronado.yamir.scrrenmatch.calculos.Clasificacion;

public class Episodio implements Clasificacion {
    String nombre;
    int numero;
    Serie serie;
    int totalReproducciones;

    public int getTotalReproducciones() {
        return totalReproducciones;
    }

    public void setTotalReproducciones(int totalReproducciones) {
        this.totalReproducciones = totalReproducciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getClasificacion() {
        if (getTotalReproducciones() > 100){
            return 4;
        }else {
            return 2;
        }
    }
}
