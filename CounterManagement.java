public class CounterManagement {
    public void toggleCounterStatus(int counterNumber) {
        TicketCounter counter = getCounter(counterNumber);
        if (counter != null) {
            counter.setOnline(!counter.isOnline());
        }
    }

    public void completeCurrent(int counterNumber) {
        TicketCounter counter = getCounter(counterNumber);
        if (counter != null) {
            counter.setCurrentTicket(0);
        }
    }

    public void callNext(int counterNumber) {
        TicketCounter counter = getCounter(counterNumber);
        if (counter != null) {
            int nextTicket = ticketQueue.nowServing();
            if (nextTicket > 0) {
                counter.setCurrentTicket(nextTicket);
            }
        }
    }
}
