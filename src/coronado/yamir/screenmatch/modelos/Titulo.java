package coronado.yamir.screenmatch.modelos;

public class Titulo implements Comparable<Titulo>{
    private String nombre;
    private int fechaLanzamiento;
    private int duracionMinutos;
    private boolean incluidoEnPlan;
    private double sumaEvaluaciones;
    private int totalEvaluaciones;

    public Titulo(String nombre, int fechaLanzamiento) {
        this.nombre = nombre;
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaLanzamiento(int fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setIncluidoEnPlan(boolean incluidoEnPlan) {
        this.incluidoEnPlan = incluidoEnPlan;
    }

    public int getTotalEvaluaciones(){

        return totalEvaluaciones;
    }

    public int getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void muestraFichaTecnica(){
        System.out.println("Titulo: " + nombre);
        System.out.println("Su fecha de lanzamiento fue: " + fechaLanzamiento);
        System.out.println("Duracion en minutos: " + getDuracionMinutos());
    }
    public void evalua(double nota){
        sumaEvaluaciones += nota;
        totalEvaluaciones ++;
    }

    public double calculaMedia(){

        return sumaEvaluaciones / totalEvaluaciones;
    }

    @Override
    public int compareTo(Titulo otroTitulo) {
        return this.getNombre().compareTo(otroTitulo.getNombre());
    }
}
