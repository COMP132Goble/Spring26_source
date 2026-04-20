package ADTs;

public class MyArrayList<T> implements MyList<T> {
    private Object[] data;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public MyArrayList() {
        data = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    @Override
    public void add(T element) {
        data[size] = element;
        size++;
    }

    @Override
    public void add(int index, T element) {
        // shifts elements to the right to make room
        for(int i = size; i > index; i++) {
            data[i] = data[i-1];
        }
        data[index] = element;
        size++;
    }

    @Override
    @SuppressWarnings("unchecked") 
    public T get(int index) {
        return (T) data[index];
    }

    @Override
    public void set(int index, T element) {
        data[index] = element;
    }

    @Override
    @SuppressWarnings("unchecked")
    public T remove(int index) {
        T removed = (T) data[index];
        // Shift elements to the left to fill the gap
        for(int i = index; i < size-1; i++) {
            data[i] = data[i+1];
        }

        data[size-1] = null;
        size--;
        return removed;
    }

    @Override 
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
}
