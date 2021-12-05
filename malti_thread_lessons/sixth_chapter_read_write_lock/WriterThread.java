/*
 * Copyright (c) 2019. Atsushi Sakai. All Rights Reserved.
 */

package sixth_chapter_read_write_lock;

import java.util.Random;

public class WriterThread extends Thread {
    private static final Random random = new Random();
    private final Data data;
    private final String filler;
    private int index = 0;

    WriterThread(Data data, String filler) {
        this.data = data;
        this.filler = filler;
    }

    public void run() {
        try {
            while (true) {
                char c = next_char();
                data.write(c);
                Thread.sleep(random.nextInt(3000));
            }
        } catch (InterruptedException e) {

        }
    }

    private char next_char() {
        char c = filler.charAt(index);
        index++;
        if (index >= filler.length()) {
            index = 0;
        }
        return c;
    }
}
