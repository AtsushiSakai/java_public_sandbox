package first_chapter_synchronized.multi_thread_2;

public class Main3 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Good");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("test");
            }
        }
    }
}
