package first_chapter_synchronized.multi_thread_3;

public class Main {
    public static void main(String[] args) {
        new Thread(new Printer("Good")).start();
        new Thread(new Printer("Nice")).start();
    }
}
