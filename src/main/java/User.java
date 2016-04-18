
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zeshanrasul on 16/04/2016.
 */

public class User {
    public final String name;
    public List<String> following;

    public User(String name) {
        this.name = name;
        this.following = new ArrayList<>();
    }

    public List<String> addFollowerToUser(String username){
        this.following.add(username);
        return this.following;
    }
}
