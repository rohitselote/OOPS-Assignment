class FileExtensionExtractor {
    private String fileName;

    FileExtensionExtractor(String fileName) {
        this.fileName = fileName;
    }

    void extractExtension() {
        int dotIndex = fileName.lastIndexOf('.');

        if (dotIndex != -1 && dotIndex != fileName.length() - 1) {
            String extension = fileName.substring(dotIndex + 1);
            System.out.println("File Extension: " + extension);
        } else {
            System.out.println("No valid file extension found.");
        }
    }

    public static void main(String[] args) {
        FileExtensionExtractor obj = new FileExtensionExtractor("report.pdf");
        obj.extractExtension();
    }
}
