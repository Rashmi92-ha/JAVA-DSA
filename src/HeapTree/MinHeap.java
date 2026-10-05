package HeapTree;

public class MinHeap {
    private final int[] data;   // the array that stores the heap
    private int size;           // number of elements currently stored

    public MinHeap(int capacity) {
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

    // Removes and returns the minimum value
    public int extractMin() {
        if (size == 0) {
            throw new IllegalStateException("Heap is empty");
        }
        int min = data[0];
        data[0] = data[size - 1];
        size--;
        heapifyDown(0);
        return min;
    }

    // Returns the minimum value without removing it
    public int peek() {
        if (size == 0) {
            throw new IllegalStateException("Heap is empty");
        }
        return data[0];
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    // Move the value at index up while it is smaller than its parent
    private void heapifyUp(int index) {
        while (index > 0) {
            int parent = (index - 1) / 2;
            if (data[index] >= data[parent]) {
                break;
            }
            swap(index, parent);
            index = parent;
        }
    }

    // Move the value at index down while it is larger than a child
    private void heapifyDown(int index) {
        while (true) {
            int left = 2 * index + 1;
            int right = 2 * index + 2;
            int smallest = index;

            if (left < size && data[left] < data[smallest]) {
                smallest = left;
            }
            if (right < size && data[right] < data[smallest]) {
                smallest = right;
            }
            if (smallest == index) {
                break;
            }
            swap(index, smallest);
            index = smallest;
        }
    }

    private void swap(int i, int j) {
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

    public static void main(String[] args) {
        MinHeap minHeap = new MinHeap(5);

        minHeap.insert(20);
        minHeap.insert(10);
        minHeap.insert(30);
        minHeap.insert(5);

        System.out.println("Heap:");
        minHeap.display();
        System.out.println("Minimum: " + minHeap.peek());

        System.out.println("Removed: " + minHeap.extractMin());
        System.out.println("After removing the root:");
        minHeap.display();
        System.out.println("Minimum: " + minHeap.peek());

        // Fill the heap to show the full-heap error
        minHeap.insert(1);
        minHeap.insert(2);
        try {
            minHeap.insert(3);
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Empty the heap to show the empty-heap error
        while (!minHeap.isEmpty()) {
            minHeap.extractMin();
        }
        try {
            minHeap.peek();
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}