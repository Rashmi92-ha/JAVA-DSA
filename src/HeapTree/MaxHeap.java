package HeapTree;

public class MaxHeap {
    private final int[] data;
    private int size;

    public MaxHeap(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be positive");
        }
        data = new int[capacity];
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void insert(int value) {
        if (size == data.length) {
            throw new IllegalStateException("Heap is full");
        }
        data[size] = value;
        size++;
        heapifyUp(size - 1);
    }

    public int extraMax() {
        if (size == 0) {
            throw new IllegalStateException("Heap is Empty");
        }
        int max = data[0];
        data[0] = data[size - 1];
        size--;
        heapifyDown(0);
        return max;
    }

    public int peek() {
        if (size == 0) {
            throw new IllegalStateException("Heap is Empty");
        }
        return data[0];
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    public void heapifyUp(int index) {
        while (index > 0) {
            int parent = (index - 1) / 2;
            if (data[index] <= data[parent]) {
                break;
            }
            swap(index, parent);
            index = parent;
        }
    }

    public void heapifyDown(int index) {
        while (true) {
            int left = 2 * index + 1;
            int right = 2 * index + 2;
            int largest = index;

            if (left < size && data[left] > data[largest]) {
                largest = left;
            }
            if (right < size && data[right] > data[largest]) {
                largest = right;
            }
            if (largest == index) {
                break;
            }
            swap(index, largest);
            index = largest;
        }
    }

    public void swap(int i, int j) {
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

    public static void main(String[] args) {
        MaxHeap maxHeap = new MaxHeap(10);
        maxHeap.insert(20);
        maxHeap.insert(10);
        maxHeap.insert(30);
        maxHeap.insert(5);

        System.out.println("Heap: ");
        maxHeap.display();

        System.out.println("Maximum: " + maxHeap.peek());
        System.out.println("Removed: " + maxHeap.extraMax());
        System.out.println("After Removing the Root: ");
        maxHeap.display();

        System.out.println("Maximum: " + maxHeap.peek());
    }
}
