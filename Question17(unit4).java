class DownloadManager implements Runnable {

    String fileName;

    DownloadManager(String fileName) {
        this.fileName = fileName;
    }

    public void run() {
        System.out.println("Downloading " + fileName + "...");
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new DownloadManager("File1"));
        Thread t2 = new Thread(new DownloadManager("File2"));
        Thread t3 = new Thread(new DownloadManager("File3"));

        t1.start();
        t2.start();
        t3.start();
    }
}
