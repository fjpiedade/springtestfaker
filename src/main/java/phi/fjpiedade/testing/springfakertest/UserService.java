package phi.fjpiedade.testing.springfakertest;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    private Map<String, User> users = new HashMap<>();

    public void createUser(User user){
        users.put(user.username(), user);
        users.put(user.password(), user);
        users.put(user.name(), user);
        users.put(user.email(), user);
    }

    public User findByUsername(String username){
        return users.get(username);
    }
}
