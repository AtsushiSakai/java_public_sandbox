package first_chapter_synchronized.single_thread_execution;

public class UserThread extends Thread {
    private final Gate gate;
    private final String myname;
    private final String myaddress;

    UserThread(Gate gate, String myname, String myaddress) {
        this.gate = gate;
        this.myname = myname;
        this.myaddress = myaddress;
    }

    public void run() {
        System.out.println(myname + " BEGIN");
        while (true) {
            gate.pass(myname, myaddress);
        }
    }

}
