package coronado.yamir.scrrenmatch.calculos;

public class FiltroRecomendacion {
    public void filtra(Clasificacion clasificacion){
        if (clasificacion.getClasificacion() >= 4){
            System.out.println("Muy bien evaluada actualmente");
        } else if (clasificacion.getClasificacion() <= 2) {
            System.out.println("Es popular ahora");
        }else {
            System.out.println("Te recomendamos verla pronto en tu playlist");
        }
    }
}
