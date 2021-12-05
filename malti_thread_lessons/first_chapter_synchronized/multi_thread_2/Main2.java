package first_chapter_synchronized.multi_thread_2;

import first_chapter_synchronized.multi_thread_3.Printer;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class Main2 {
    public static void main(String[] args) {
        ThreadFactory factory = Executors.defaultThreadFactory();
        factory.newThread(new Printer("Nice")).start();
        for (int i = 0; i < 1000; i++) {
            System.out.println("Good");
        }
    }
}
