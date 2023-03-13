package com.rc.tech;

public class MinHeap {
    private int[] heap;
    private int size;
    private int capacity;

    public MinHeap(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.heap = new int[capacity];
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    private int parent(int index) {
        return (index - 1) / 2;
    }

    private int leftChild(int index) {
        return 2 * index + 1;
    }

    private int rightChild(int index) {
        return 2 * index + 2;
    }

    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    public void insert(int data) {
        if (size >= capacity) {
            throw new IllegalStateException("Heap is full");
        }

        heap[size] = data;
        int current = size;
        size++;

        while (heap[current] < heap[parent(current)]) {
            swap(current, parent(current));
            current = parent(current);
        }
    }

    public int extractMin() {
        if (isEmpty()) {
            throw new IllegalStateException("Heap is empty");
        }

        int min = heap[0];
        heap[0] = heap[size - 1];
        size--;
        heapify(0);
        return min;
    }

    private void heapify(int index) {
        int smallest = index;
        int left = leftChild(index);
        int right = rightChild(index);

        if (left < size && heap[left] < heap[smallest]) {
            smallest = left;
        }

        if (right < size && heap[right] < heap[smallest]) {
            smallest = right;
        }

        if (smallest != index) {
            swap(index, smallest);
            heapify(smallest);
        }
    }

    public void printHeap() {
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }
}
