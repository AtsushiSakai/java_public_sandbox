package first_chapter_synchronized.Synchronized_sample_1;

public class ClientThread extends Thread {
    private Bank bank;

    ClientThread(Bank bank) {
        this.bank = bank;
    }

    public void run() {

        for (int i = 0; i < 1000; i++) {
            boolean ok = bank.withdraw(1000);
            if (ok) {
                bank.deposit(1000);
            }
        }

    }

}
