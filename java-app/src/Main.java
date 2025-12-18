public class Main {
    public static void main(String[] args) {
        System.out.println("Hello from Java container!");
        // Keep the container running for testing
        try {
            Thread.sleep(Long.MAX_VALUE);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
