public class FIFOQueue<T> implements IQueuable<T> {
    private T[] queue;
    private int front;
    private int rear;
    private int size;

    @SuppressWarnings("unchecked")
    public FIFOQueue(int capacity) {
        queue = (T[]) new Object[capacity];
    }

    public void enqueue(T element) {
        if (size == queue.length) {
            throw new IllegalStateException("Queue is full");
        }
        queue[rear] = element;
        rear = (rear + 1) % queue.length;
        size++;
    }

    public T dequeue() {
        if (size == 0) {
            return null;
        }
        T element = queue[front];
        queue[front] = null;
        front = (front + 1) % queue.length;
        size--;
        return element;
    }

    public T[] getQueue() {
        T[] array = (T[]) new Object[size];
        for (int i = 0; i < size; i++) {
            array[i] = queue[(front + i) % queue.length];
        }
        return array;
    }

    public int size() {
        return size;
    }
}