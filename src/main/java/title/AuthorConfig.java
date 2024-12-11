package title;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("authorConfig")
public class AuthorConfig {
    private final String username = "Korsakov";
    private final String password = "1234546789";
    private final int age = 33;
    private final String email = "1123@gmail.com";
    private final double balance = 982745987.99;
    private final boolean isActive = false;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public double getBalance() {
        return balance;
    }

    public boolean isActive() {
        return isActive;
    }
}
