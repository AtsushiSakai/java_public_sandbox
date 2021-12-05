package third_chapter_guarded_suspension.request_queue;

public class Request {
    private final String name;

    Request(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "[ Request " + name + " ]";
    }
}
