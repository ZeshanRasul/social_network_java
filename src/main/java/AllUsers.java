import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by zeshanrasul on 16/04/2016.
 */
public class AllUsers {

    private List<User> users;
    public User currentUser;
    public List<String> usernames = new ArrayList<String>();

    public AllUsers()
    {
        this.users = new ArrayList<User>();
    }

    public void newUser(String name){
        User newUser = new User(name);
        users.add(newUser);
        currentUser = newUser;
    }

    public User getCurrentUser() {
        return currentUser;
    }

    public List<String> getAllUsers() {
        int i;
        for (i = 0; i <= this.users.size() - 1; i++)
            {
                usernames.add(this.users.get(i).name);
            }
        removeDuplicates(usernames);
        return usernames;
    }

    public removeDuplicates(arrayName){
        Set<String> hs = new HashSet<>();
        hs.addAll(arrayName);
        arrayName.clear();
        arrayName.addAll(hs);
    }

}
