package third_chapter_guarded_suspension.request_queue;

import java.util.LinkedList;
import java.util.Queue;

class RequestQueue {
    private final Queue<Request> queue = new LinkedList<>();

    synchronized Request getRequest() {
        while (queue.peek() == null) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return queue.remove();
    }

    synchronized void putRequest(Request request) {
        queue.offer(request);
        notifyAll();
    }
}
