import java.util.LinkedList;

public class NonArrayLIFO<T> implements IQueuable<T> {
    private LinkedList<T> queue;

    public NonArrayLIFO() {
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
    }


