package first_chapter_synchronized.Synchronized_sample_1;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("central", 1000);
        for (int i = 0; i < 1000; i++) {
            new ClientThread(bank).start();
        }
    }
}
