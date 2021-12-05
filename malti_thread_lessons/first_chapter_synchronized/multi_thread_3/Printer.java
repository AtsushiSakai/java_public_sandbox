package first_chapter_synchronized.multi_thread_3;

public class Printer implements Runnable {
    private String omessage;

    public Printer(String message) {
        omessage = message;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(omessage);
        }
    }

}
