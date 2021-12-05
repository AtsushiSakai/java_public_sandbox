/*
 * Copyright (c) 2019. Atsushi Sakai. All Rights Reserved.
 */

package seventh_chapter_thread_per_message;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main Begin");
        Host host = new Host();
        host.request(10, 'A');
        host.request(20, 'B');
        host.request(30, 'C');
        System.out.println("Main END");
    }
}
