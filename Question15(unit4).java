class BankApplication {

    void processTransaction() throws Exception {
        int amount = 100;
        if (amount < 0) {
            throw new Exception("Invalid transaction");
        }
        System.out.println("Transaction processed");
    }

    public static void main(String[] args) {
        BankApplication app = new BankApplication();
        try {
            app.processTransaction();
        } catch (Exception e) {
            System.out.println("Exception handled in main");
        }
    }
}
