/*
 * Copyright (c) 2019. Atsushi Sakai. All Rights Reserved.
 */

package eightth_chapter_worker_thread;

import java.util.Random;

public class Request {
    private static final Random random = new Random();
    private final String name;
    private final int number;

    public Request(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public void execute() {
        System.out.println(Thread.currentThread().getName() + " executes" + this);
        try {
            Thread.sleep(random.nextInt(1000));
        } catch (InterruptedException e) {
        }
    }

    public String toString() {
        return "[ Request from " + name + " No." + number + "]";
    }
}
