


public class Main {
    public static void main(String[] args) {
        Hilo hilo1 = new Hilo("Hilo 1");
        Hilo hilo2 = new Hilo("Hilo 2");
        Hilo hilo3 = new Hilo("Hilo 3");
        Hilo hilo4 = new Hilo("Hilo 4");

        System.out.printf("\nEl hilo %s va a iterar %d\n veces", hilo1.nombre, hilo1.iteraciones);
        System.out.printf("\nEl hilo %s va a iterar %d\n veces", hilo2.nombre, hilo2.iteraciones);
        System.out.printf("\nEl hilo %s va a iterar %d\n veces", hilo3.nombre, hilo3.iteraciones);
        System.out.printf("\nEl hilo %s va a iterar %d\n veces", hilo4.nombre, hilo4.iteraciones);


        Thread hiloRunnable1 = new Thread(new HiloRunnable("HiloRunnable 1", 43, 1277));
        Thread hiloRunnable2 = new Thread(new HiloRunnable("HiloRunnable 2", 66, 157));
        Thread hiloRunnable3 = new Thread(new HiloRunnable("HiloRunnable 3", 43, 667));
        Thread hiloRunnable4 = new Thread(new HiloRunnable("HiloRunnable 4", 46, 777));

        hilo1.start();
        hilo2.start();
        hilo4.start();
        hiloRunnable1.start();
        hiloRunnable2.start();
        hiloRunnable3.start();
        hiloRunnable4.start();

    }
}