package fifth_chapter_producer_comsumer;

public class Main {
    public static void main(String[] args) {
        Table table = new Table(3);
        new MakerThread("MakerThread-1", table, 31415).start();
        new MakerThread("MakerThread-2", table, 31416).start();
        new MakerThread("MakerThread-3", table, 31417).start();
        new EaterThread("EaterThread-1", table, 31411).start();
        new EaterThread("EaterThread-2", table, 31413).start();
        new EaterThread("EaterThread-3", table, 31410).start();
    }
}
