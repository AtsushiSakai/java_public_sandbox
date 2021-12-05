package first_chapter_synchronized.multi_thread_2;

public class PrintThread extends Thread {
    private String omessage;

    PrintThread(String message) {
        omessage = message;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(omessage);
        }
    }
}
