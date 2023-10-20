import java.util.ArrayList;

public class ArrayReader implements Runnable {
    private final ArrayList<Integer> oddNumList;
    private final ArrayList<Integer> evenNumList;
    private final ArrayList<Integer> numList;
    private int counterRate;
    private final int div;

    public ArrayReader(ArrayList<Integer> numList) {
        this.oddNumList = new ArrayList<>();
        this.evenNumList = new ArrayList<>();
        this.numList = numList;
        this.counterRate = 4;
        this.div = numList.size() / 4;
    }

    @Override
    public void run() {

        readArray();
    }

    public synchronized void readArray() {
        counterRate--;
        int baseValue = counterRate * div;
        for (int i = baseValue; i < baseValue + div; i++) {
            int num = numList.get(i);
            if (num % 2 == 0) {
                addEvenNum(num);
            } else {
                addOddNum(num);
            }
        }
    }

    private void addOddNum(int a) {
        oddNumList.add(a);
    }

    private void addEvenNum(int a) {
        evenNumList.add(a);
    }

    public ArrayList<Integer> getOddNumList() {
        return oddNumList;
    }

    public ArrayList<Integer> getEvenNumList() {
        return evenNumList;
    }
}
