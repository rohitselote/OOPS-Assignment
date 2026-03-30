class ThreadPrioritySystem extends Thread {

    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running");
    }

    public static void main(String[] args) {
        ThreadPrioritySystem t1 = new ThreadPrioritySystem();
        ThreadPrioritySystem t2 = new ThreadPrioritySystem();
        ThreadPrioritySystem t3 = new ThreadPrioritySystem();

        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}
