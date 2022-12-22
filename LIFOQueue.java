import java.util.LinkedList;

public class LIFOQueue<T> implements IQueuable<T> {
    private LinkedList<T> queue;

    public LIFOQueue() {
        queue = new LinkedList<>();
    }

    public void enqueue(T element) {
        queue.addFirst(element);
    }

    public T dequeue() {
        if (queue.isEmpty()) {
            return null;
        }
        return queue.removeFirst();
    }

    public T[] getQueue() {
        return queue.toArray((T[]) new Object[queue.size()]);
    }

    public int size() {
        return queue.size();
    }
}