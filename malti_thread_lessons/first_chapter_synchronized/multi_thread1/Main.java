package first_chapter_synchronized.multi_thread1;

public class Main {

    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();

        for (int i = 0; i < 10000; i++) {
            System.out.print("Good");
        }
    }

}
