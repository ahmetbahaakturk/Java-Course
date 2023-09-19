import java.util.ArrayList;
import java.util.Arrays;

public class GenericList<T> {
    private Object[] genericList;
    private int capacity;

    GenericList() {
        this.capacity = 10;
        this.genericList = new Object[this.capacity];
    }

    GenericList(int capacity) {
        this.capacity = capacity;
        this.genericList = new Object[capacity];
    }

    public int size() {
        int size = 0;
        for (Object obj : genericList) {
            if (obj == null) {
                break;
            }
            size++;
        }
        return size;
    }

    public int getCapacity() {
        return capacity;
    }

    public void add(T data) {
        if (genericList[capacity - 1] != null) {
            expandList();
        }
        for (int i = 0; i < capacity; i++) {
            if (genericList[i] == null) {
                genericList[i] = data;
                break;
            }
        }
    }

    private void expandList() {
        Object[] newList = new Object[capacity * 2];
        if (capacity >= 0) System.arraycopy(genericList, 0, newList, 0, capacity);
        capacity *= 2;
        genericList = newList;
    }

    public Object get(int index) {
        if (isOutOfBounds(index)) return null;
        return genericList[index];
    }

    public String remove(int index) {
        if (isOutOfBounds(index)) return null;
        sortList(index);
        return "Data in" + index + " Index Have Deleted!";
    }

    private void sortList(int index) {
        for (int i = index; i < capacity - 1; i++) {
            genericList[i] = genericList[i + 1];
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(genericList);
    }

    public String set(int index, T data) {
        if (isOutOfBounds(index)) return null;
        genericList[index] = data;
        return "Data In Index " + index + " Have Changed With Value " + data;
    }

    private boolean isOutOfBounds(int index) {
        return !(index >= 0 && index < capacity);
    }

    public int indexOf(T data) {
        for (int i = 0; i < capacity; i++) {
            if (genericList[i] == data) return i;
        }
        return -1;
    }

    public int lastIndexOf(T data) {
        for (int i = capacity - 1; i >= 0; i--) {
            if (genericList[i] == data) return i;
        }
        return -1;
    }

    public boolean isEmpty() {
        return genericList[0] == null;
    }

    public void clear() {
        for (int i = 0; i < capacity; i++) {
            genericList[i] = null;
        }
    }

    public Object[] toArray() {
        return genericList;
    }

    public boolean contains(T data) {
        for (int i = 0; i < capacity; i++) {
            if (genericList[i] == data) return true;
        }
        return false;
    }

    public ArrayList<Object> MyList(int base, int bound) {
        ArrayList<Object> newList = new ArrayList<>(bound - base + 1);
        newList.addAll(Arrays.asList(genericList).subList(base, bound + 1));
        return newList;
    }
}