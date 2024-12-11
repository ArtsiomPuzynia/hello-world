package title;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MessageTest {
    public static void main(String[] args) {
        var ctx = new AnnotationConfigApplicationContext();
        ctx.register(MessageTest.class, InMemoryMessageDAO.class);
        ctx.refresh();

        MessageService service = ctx.getBean(MessageService.class);
        service.post();
    }
}
