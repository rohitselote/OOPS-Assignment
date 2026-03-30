class RailwayReservation {

    private int availableTickets = 1;

    synchronized void bookTicket(String user) {
        if (availableTickets > 0) {
            System.out.println(user + ": Ticket booked successfully");
            availableTickets--;
        } else {
            System.out.println(user + ": No tickets available");
        }
    }

    public static void main(String[] args) {
        RailwayReservation rr = new RailwayReservation();

        Thread t1 = new Thread(() -> rr.bookTicket("User1"));
        Thread t2 = new Thread(() -> rr.bookTicket("User2"));

        t1.start();
        t2.start();
    }
}
