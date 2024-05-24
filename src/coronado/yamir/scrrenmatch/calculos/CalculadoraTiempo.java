package coronado.yamir.scrrenmatch.calculos;

import coronado.yamir.screenmatch.modelos.Pelicula;
import coronado.yamir.screenmatch.modelos.Titulo;

public class CalculadoraTiempo {
    int tiempoTotal;

    public void incluye(Titulo titulo){
        this.tiempoTotal += titulo.getDuracionMinutos();
    }

    public int getTiempoTotal() {
        return this.tiempoTotal;
    }
}
