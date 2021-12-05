package first_chapter_synchronized.Synchronized_sample_1;

public class Bank {
    private int money;
    private String name;

    Bank(String name, int money) {
        this.name = name;
        this.money = money;
    }

    synchronized void deposit(int m) {
//    public void deposit(int m){
        money += m;
    }

    synchronized boolean withdraw(int m) {
//    public boolean withdraw(int m) {
        if (money >= m) {
            money -= m;
            check();
            return true;
        } else {
            return false;
        }
    }

    private void check() {
        if (money < 0) {
            System.out.println("Bankrupt!!" + money);
        }
    }

    public String getName() {
        return name;
    }
}
