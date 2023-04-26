

public class HiloRunnable implements Runnable {


    String nombre;
    Integer iteraciones;
    Integer tiempo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getIteraciones() {
        return iteraciones;
    }

    public void setIteraciones(Integer iteraciones) {
        this.iteraciones = iteraciones;
    }

    public Integer getTiempo() {
        return tiempo;
    }

    public void setTiempo(Integer tiempo) {
        this.tiempo = tiempo;
    }
    public HiloRunnable(String nombre, Integer iteraciones, Integer tiempo){

        this.nombre = nombre;
        this.iteraciones = iteraciones;
        this.tiempo = tiempo;
    }

    public void run(){
        for (int i = 1; i < this.iteraciones + 1; i++) {
            try {
                System.out.printf("\nEste es el hilo %s y esta es la iteracion %d%n", this.nombre, i);
                Thread.sleep(this.tiempo);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
    @Override
    public String toString(){
        return String.format("\nEl hilo %s va a iterar %d veces", this.nombre, this.iteraciones);
    }
}
