import java.util.ArrayList;

public class TicketQueue {
    private ArrayList<Integer> queue;
    private int lastTicket;

    public TicketQueue() {
        queue = new ArrayList<>();
        lastTicket = 0;
    }

    public int takeNumber() {
        lastTicket++;
        queue.add(lastTicket);
        return lastTicket;
    }

    public int nowServing() {
        if (queue.isEmpty()) {
            return 0;
        }
        return queue.remove(0);
    }

    public int lastNumber() {
        return lastTicket;
    }
}