import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Random random = new Random();
        for (int i = 0; i < 40; i++) {
            int valor = random.nextInt(13) + 3;
            list.add(valor);
        }
        Hilo hilo1 = new Hilo("1", list);
        Hilo hilo2 = new Hilo("2", list);
        Hilo hilo3 = new Hilo("3", list);

        hilo1.start();
        hilo2.start();
        hilo3.start();

    }
}