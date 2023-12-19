package TP1.ArrayList_Implementation;

public class CustomArrayList {
    private Object[] array;
    private int size = 0;
    private int maxSize = 10;
    public CustomArrayList() {
       array = new Object[maxSize];
    }
    public CustomArrayList(int initialSize) {
        maxSize = initialSize;
        array = new Object[maxSize];
    }
    public void add(Object obj) {
        if (size == maxSize-1) {
            throw new ArrayIndexOutOfBoundsException("Array is full");
        }
        array[size] = obj;
        size++;
        System.out.println("object added successfully");
    }
    public void add(int index, Object x) {
        if (index > size) {
            throw new ArrayIndexOutOfBoundsException("Index out of range");
        }
        if (size == maxSize-1) {
            throw new ArrayIndexOutOfBoundsException("Array is full");
        }
        for (int i = size; i > index; i--) {
            array[i] = array[i-1];
        }
        array[index] = x;
        size++;
        System.out.println("object added successfully");
    }
    public Object get(int index) {
        if (index >= size) {
            throw new ArrayIndexOutOfBoundsException("Index out of range");
        }
        return array[index];
    }
    public int size() {
        return size;
    }
    boolean isEmpty() {
        return size == 0;
    }
    boolean isIn(Object x) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(x)) {
                return true;
            }
        }
        return false;
    }
    int find(Object x) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(x)) {
                return i;
            }
        }
        return -1;
    }
    void remove(Object x) {
        int index = find(x);
        if (index == -1) {
            throw new IllegalArgumentException("404 not found");
        }
        for (int i = index; i < size-1; i++) {
            array[i] = array[i+1];
        }
        size--;
        System.out.println("object removed successfully");
    }
    public static void main(String[] args) {
        CustomArrayList alpha = new CustomArrayList();
        alpha.add("a");
        alpha.add("b");
        alpha.add("c");
        alpha.add("d");
        CustomArrayList beta = new CustomArrayList(20);
        beta.add(5);
        beta.add(6);

        System.out.println("Size of a: " + alpha.size());
        System.out.println("Size of b: " + beta.size());
        System.out.println("\'c\' in a? " + alpha.isIn("c"));
        System.out.println("\'8\' in b? " + beta.isIn(8));
        System.out.println("Pos of \'b\' in a: " + alpha.find("b"));
        System.out.println("Pos of \'7\' in b: " + beta.find(7));
        System.out.println("b empty? " + beta.isEmpty());
        beta.remove(6);
        beta.remove(5);
        System.out.println("b empty yet? " + beta.isEmpty());

    }
}
