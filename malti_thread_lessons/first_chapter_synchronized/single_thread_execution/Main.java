package first_chapter_synchronized.single_thread_execution;

public class Main {
    public static void main(String[] args) {
        System.out.println("Testing Gate");
        Gate gate = new Gate();
        new UserThread(gate, "Alice", "Alaska").start();
        new UserThread(gate, "Bobby", "Brazil").start();
        new UserThread(gate, "Chris", "Canada").start();
    }
}
