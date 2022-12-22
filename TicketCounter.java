public class TicketCounter {
    private int counterNumber;
    private boolean online;
    private int currentTicket;

    public TicketCounter(int counterNumber) {
        this.counterNumber = counterNumber;
        this.online = true;
        this.currentTicket = 0;
    }

    public int getCounterNumber() {
        return counterNumber;
    }

    public boolean isOnline() {
        return online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }

    public int getCurrentTicket() {
        return currentTicket;
    }

    public void setCurrentTicket(int currentTicket) {
        this.currentTicket = currentTicket;
    }
}
