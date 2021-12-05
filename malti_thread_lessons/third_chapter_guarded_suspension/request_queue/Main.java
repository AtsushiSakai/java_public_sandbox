package third_chapter_guarded_suspension.request_queue;

public class Main {
    public static void main(String[] args) {
        RequestQueue requestQueue = new RequestQueue();
        new ClientThread(requestQueue, "Alice", 31243328L).start();
        new ServerThread(requestQueue, "Bibby", 51243286L).start();
    }
}
