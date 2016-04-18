import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertThat;

/**
 * Created by zeshanrasul on 18/04/2016.
 */
public class AllUsersTest {

    @Before
    public void usersInit(){
        userList = new AllUsers
    }

    @Test
    public void newUserCreatesANewUser() {
        newUser("Bob");
        assertThat(users.get(0).name, "Bob");
    }

    public void getAllUsersReturnsAllUsers() {
        newUser("Bob");
        newUser("Pete");
        assertThat(getAllUsers(), [Bob, Pete]);
    }


}
