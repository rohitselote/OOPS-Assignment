class ChatApplication {

    static class Sender extends Thread {
        public void run() {
            try {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Sending message " + i);
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class Receiver extends Thread {
        public void run() {
            try {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Receiving message " + i);
                    Thread.sleep(700);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        ChatApplication.Sender sender = new ChatApplication.Sender();
        ChatApplication.Receiver receiver = new ChatApplication.Receiver();

        sender.start();
        receiver.start();
    }
}
