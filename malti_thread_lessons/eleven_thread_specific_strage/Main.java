/*
 * Copyright (c) 2019. Atsushi Sakai. All Rights Reserved.
 */

package eleven_thread_specific_strage;

public class Main {
    public static void main(String[] args) {
        new ClientThread("Alice").start();
        new ClientThread("Bobby").start();
        new ClientThread("Chris").start();
    }
}
