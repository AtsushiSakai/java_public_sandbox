package forth_chapter_balking_pattern;

public class Main {
    public static void main(String[] args) {
        Data data = new Data("data.txt", "empty");
        new ChangerThread("ChangeThread", data).start();
        new SaverThread("SaverThread", data).start();
    }
}
