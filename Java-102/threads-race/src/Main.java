import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> numberList = new ArrayList<>();

        for(int i = 0; i < 10000;) {
            numberList.add(++i);
        }

        ArrayReader arrayReader = new ArrayReader(numberList);

        ArrayList<Thread> threads = new ArrayList<>();
        for(int i = 0; i < 4; i++) {
            threads.add(new Thread(arrayReader));
        }

        for(Thread t : threads) {
            t.start();
        }

        Thread.sleep(2000);
        System.out.println(arrayReader.getOddNumList());
        System.out.println(arrayReader.getEvenNumList());
    }
}