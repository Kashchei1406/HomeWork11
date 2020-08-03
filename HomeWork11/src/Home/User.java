package Home;

import java.util.List;
import java.util.Optional;

public class User {

    String name;
    String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public static void userOrGuest(List<User> users) {

        users.forEach(user -> System.out.println("Hi " + Optional.ofNullable(user)
                .map(u -> u.name)
                .orElse("guest")));

    }

}
