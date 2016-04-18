/**
 * Created by zeshanrasul on 16/04/2016.
 */
public class Message {

    public final String content;
    public final User owner;
    public Message(String content, User owner) {
        this.content = content;
        this.owner = owner;
    }
}
