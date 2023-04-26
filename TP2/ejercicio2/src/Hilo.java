import java.util.ArrayList;

public class Hilo extends Thread{
    String name;
    ArrayList<Integer> inputArray;
    public Hilo(String name, ArrayList<Integer> inputArray){
        this.name = name;
        this.inputArray = inputArray;
    }
    ThreadLocal<ArrayList<Integer>> threadLocalList = new ThreadLocal<ArrayList<Integer>>() {
        @Override
        protected ArrayList<Integer> initialValue() {
            return new ArrayList<Integer>(inputArray);
        }
    };

    public Integer factorial(Integer value){
        int factorial = 1;
        for (int i = 1; i <= value; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public void run(){
        try {
            ArrayList<Integer> list = threadLocalList.get();
            int arrayLength = list.size();
            for (int i = 0; i < arrayLength; i++) {
                Integer currentValue = list.get(0);
                Integer calculatedValue = this.factorial(currentValue);
                list.remove(0);
                int newArrayLength = list.size();
                System.out.printf("\nHilo %s procesando la lista. Valor a calcular: %d. Resultado: %d Quedan %d elementos en la lista por procesar.", name, currentValue, calculatedValue, newArrayLength);
                Thread.sleep(5000);
            }
        } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

}
