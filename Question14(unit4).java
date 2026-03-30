class FileProcessingSystem {

    void readFile() {
        try {
            System.out.println("Reading file...");
            int data = 10 / 2;
        } catch (Exception e) {
            System.out.println("Error while reading file: " + e.getMessage());
        } finally {
            System.out.println("Closing file resources");
        }
    }

    public static void main(String[] args) {
        FileProcessingSystem fps = new FileProcessingSystem();
        fps.readFile();
    }
}
