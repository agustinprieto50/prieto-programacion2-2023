

public class Hilo extends Thread{
    String nombre;
    Integer iteraciones;
    Integer tiempo;
    public Hilo(String nombre){
        int iteraciones = (int)(Math.random() * (40 - 10 + 1)) + 10;
        int tiempo = (int)(Math.random() * (999 - 50 + 1)) + 50;

        this.nombre = nombre;
        this.iteraciones = iteraciones;
        this.tiempo = tiempo;
    }

    public void run(){
        for (int i = 1; i < this.iteraciones + 1; i++) {
            try {
                System.out.printf("Este es el hilo %s y esta es la iteracion %d%n", this.nombre, i);
                Thread.sleep(this.tiempo);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
