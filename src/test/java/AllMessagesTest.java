import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;


/**
 * Created by zeshanrasul on 18/04/2016.
 */



public class AllMessagesTest {
    private AllMessages messageList;
    @Mock
    User user;
    List<Message> messages;

    @Before
    public void messagesInit(){
        messageList = new AllMessages
    }

    @Test
    public void newMessageCreatesAMessage() {
        newMessage("Hello", user);
        assertThat(messages.get(0).content, "Hello");
    }


}
