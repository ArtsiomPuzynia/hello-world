package title;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("role")
public class Role {
    @Value("ADMIN")
    private String username;

    public String getUsername() {
        return username;
    }

    @Override
    public String toString() {
        return "Role{" +
                "username='" + username + '\'' +
                '}';
    }
}
