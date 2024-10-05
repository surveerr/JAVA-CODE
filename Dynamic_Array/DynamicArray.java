package Dynamic_Array;

public class DynamicArray {
    private int arr[];
    private int nextElementIndex;

    public DynamicArray() {
        arr = new int[5];
        nextElementIndex = 0;
    }

    public int size() {
        return nextElementIndex;
    }

    public int getElement(int index) {
        if (index >= nextElementIndex) {
            return -1;
        }
        return arr[index];
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public void set(int index, int element) throws IndexOutOfBoundException {
        if (index >= nextElementIndex) {
            // throw
            throw new IndexOutOfBoundException();

        }
        arr[index] = element;

    }

    public void add(int element) {
        if (nextElementIndex >= arr.length) {
            IncreaseCapacity();
        }
        arr[nextElementIndex] = element;
        nextElementIndex++;
    }

    // need to fix this
    public void add(int index, int element) {
        if (index >= arr.length) {
            IncreaseCapacity();
        }
        // int temp = arr[index];
        arr[index] = element;
        for (int i = 0; i < index - 1; i++) {
            arr[i] = arr[i];
        }
        for (int i = index + 1; i < nextElementIndex + 1; i++) {
            arr[i] = arr[i - 1];
        }
        arr[index] = element;
        nextElementIndex++;
    }

    private void IncreaseCapacity() {
        int temp[] = arr;
        arr = new int[2 * temp.length];

        for (int i = 0; i < temp.length; i++) {
            arr[i] = temp[i];
        }
    }

    public int removeLast() {

        if (nextElementIndex == 0) {
            return -1;
        }
        int temp = arr[nextElementIndex - 1];
        arr[nextElementIndex - 1] = 0;
        nextElementIndex--;
        return temp;

    }
}
