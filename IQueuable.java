public interface IQueuable<T> {
    void enqueue(T element);
    T dequeue();
    T[] getQueue();
    int size();
}
