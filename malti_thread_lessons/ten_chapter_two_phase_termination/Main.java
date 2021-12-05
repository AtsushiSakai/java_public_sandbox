/*
 * Copyright (c) 2019. Atsushi Sakai. All Rights Reserved.
 */

package ten_chapter_two_phase_termination;

public class Main {
    public static void main(String[] args) {
        System.out.println("main: BEGIN");
        try {
            CountupThread t = new CountupThread();
            t.start();

            Thread.sleep(10000);

            System.out.println("main:shut down request");
            t.shutdownRequest();

            System.out.println("main:join");

            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("main:END");
    }
}
