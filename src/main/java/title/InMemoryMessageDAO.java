package title;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import java.util.concurrent.CopyOnWriteArrayList;

@Repository
@Scope("prototype")
public class InMemoryMessageDAO {
    private String message = "https: ";
    private final CopyOnWriteArrayList<String> messages = new CopyOnWriteArrayList<>();

    public void messageAdd(String message) {
        messages.add(message);
    }

    public CopyOnWriteArrayList<String> getMessages() {
        return messages;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
