/*
 * Copyright (c) 2019. Atsushi Sakai. All Rights Reserved.
 */

package eightth_chapter_worker_thread;

public class WorkerThread extends Thread {
    private final Channel channel;

    public WorkerThread(String name, Channel channel) {
        super(name);
        this.channel = channel;
    }

    public void run() {
        while (true) {
            Request request = channel.takeRequest();
            request.execute();
        }
    }
}
