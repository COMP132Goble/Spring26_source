package ADTs;

public interface MyList<T> {
    /**
     * adds an element to the end of the list
     */
    void add(T element);

    /**
     * adds an element at the given index of the list
     */
    void add(int index, T element);

    /**
     * Returns the element at thr given index
     */
    T get(int index);

    /**
     * Replaces the element at the given index
     */
    void set(int index, T element);

    /**
     * Removes the element at the given index
     */
    T remove(int index);

    /**
     * Returns th enumber of elements in the list
     */
    int size();

    /**
     * Returns true of the list contains no elements
     */
    boolean isEmpty();
}