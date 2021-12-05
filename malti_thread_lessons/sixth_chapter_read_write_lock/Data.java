/*
 * Copyright (c) 2019. Atsushi Sakai. All Rights Reserved.
 */

package sixth_chapter_read_write_lock;

import java.util.Arrays;

public class Data {
    private final char[] buffer;
    private final ReadWriteLock lock = new ReadWriteLock();

    public Data(int size) {
        this.buffer = new char[size];
        Arrays.fill(buffer, ('*'));
    }

    public char[] read() throws InterruptedException {
//    public synchronized char[] read() throws InterruptedException {
//            return doRead();
        lock.readLock();
        try {
            return doRead();
        } finally {
            lock.readUnlock();
        }
    }

    public void write(char c) throws InterruptedException {
//    public synchronized void write(char c) throws InterruptedException {
//          doWrite(c);
        lock.writeLock();
        try {
            doWrite(c);
        } finally {
            lock.writeUnLock();
        }
    }

    private char[] doRead() {
        char[] newbuf = new char[buffer.length];
        System.arraycopy(buffer, 0, newbuf, 0, buffer.length);
        slowly();
        return newbuf;
    }

    private void doWrite(char c) {
        for (int i = 0; i < buffer.length; i++) {
            buffer[i] = c;
            slowly();
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {

            }
        }
    }

    private void slowly() {
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
        }
    }

}
