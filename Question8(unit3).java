class TextProcessingBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

        sb.append(" World!");
        sb.append(" Welcome to Java.");

        System.out.println("Modified String: " + sb.toString());
    }
}
