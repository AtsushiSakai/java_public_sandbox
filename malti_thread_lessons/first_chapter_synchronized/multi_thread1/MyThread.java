package first_chapter_synchronized.multi_thread1;

public class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.print("Nice");
        }
    }
}
