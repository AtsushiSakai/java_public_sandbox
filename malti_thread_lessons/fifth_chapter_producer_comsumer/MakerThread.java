package fifth_chapter_producer_comsumer;

import java.util.Random;

public class MakerThread extends Thread {
    private static int id = 0;
    private final Random random;
    private final Table table;

    MakerThread(String name, Table table, long seed) {
        super(name);
        this.table = table;
        this.random = new Random(seed);
    }

    private static synchronized int nextId() {
        return id++;
    }

    public void run() {
        try {
            while (true) {
                Thread.sleep(random.nextInt(1000));
                String cake = "[Cake No." + nextId() + " by" + getName() + ":";
                table.put(cake);
            }
        } catch (InterruptedException e) {
        }
    }
}
