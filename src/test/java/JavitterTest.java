import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;


/**
 * Created by zeshanrasul on 18/04/2016.
 */

@RunWith(MockitoJUnitRunner.class);
public class JavitterTest {

    @Before
    public javitterInit() {
        javitter = new main.java.Javitter(userList, messageList)
    }

    @Test public void
    createNewUserShouldAskForNewUsername(){
        javitter.createNewUser();
        verify(welcomeScreen).printLine("Welcome, please enter your desired username");
    }

    @Test public void
    createNewMessageShouldRequestAMessage(){
        javitter.createNewMessage();
        verify(welcomeScreen).printLine("Welcome, please enter your message");
    }

    @Test public void
    viewUsersMessagesShouldAskForUser(){
        javitter.viewUsersMessages();
        verify(welcomeScreen).printLine("Whose messages would you like to see?");
    }

    @Test public void
    followUserShouldAskForUser(){
        javitter.followUser();
        verify(welcomeScreen).printLine("Who would you like to follow?")
    }
}
