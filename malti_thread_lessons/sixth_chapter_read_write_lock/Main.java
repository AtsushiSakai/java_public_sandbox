/*
 * Copyright (c) 2019. Atsushi Sakai. All Rights Reserved.
 */

package sixth_chapter_read_write_lock;

public class Main {
    public static void main(String[] args) {
        Data data = new Data(19);
        new ReaderThread(data).start();
        new ReaderThread(data).start();
        new ReaderThread(data).start();
        new ReaderThread(data).start();
        new ReaderThread(data).start();
        new ReaderThread(data).start();
        new ReaderThread(data).start();
        new WriterThread(data, "ABCDEFGHIJKLMNOP").start();
        new WriterThread(data, "abcdefghiklmnopqrst").start();
    }
}
