class OnlineShoppingSystem {

    static class Payment extends Thread {
        public void run() {
            System.out.println("Processing payment...");
        }
    }

    static class OrderProcessing extends Thread {
        public void run() {
            System.out.println("Order confirmed...");
        }
    }

    public static void main(String[] args) {
        Payment p = new Payment();
        OrderProcessing o = new OrderProcessing();

        p.start();
        o.start();
    }
}
