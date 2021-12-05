package first_chapter_synchronized.multi_thread_2;

public class Main {
    public static void main(String[] args) {
        new PrintThread("Good").start();
        new PrintThread("Nice").start();
    }
}
