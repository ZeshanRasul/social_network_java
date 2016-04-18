import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static java.lang.String.valueOf;

/**
 * Created by zeshanrasul on 16/04/2016.
 */
public class AllMessages {

    public List<Message> messages;
    public List<String> messageContent = new ArrayList<String>();
    public List<String> ownMessagesContent = new ArrayList<>();
    public List<String> userMessagesContent = new ArrayList<>();
    public List<String> subscriptionMessages = new ArrayList<>();

    public AllMessages() {
        this.messages = new ArrayList<Message>();
    }

    public void newMessage(String content, User owner){
        Message newMessage = new Message(content, owner);
        messages.add(newMessage);
    }

    public List<String> getAllMessages() {
        int i;
        for (i = 0; i < (this.messages.size()) ; i ++)
            {
                messageContent.add(this.messages.get(i).content);
            }
        removeDuplicates(messageContent);
        return messageContent;
    }

    public List<String> getOwnMessages(String username) {
        int i;
        for (i = 0; i < (this.messages.size()); i++)
            {
                if ((String.valueOf(this.messages.get(i).owner.name)).equals(username))
                {
                    ownMessagesContent.add(this.messages.get(i).content);
                }
            }
        removeDuplicates(ownMessagesContent);
        return ownMessagesContent;
    }

    public List<String> getUserMessages(String selectedUser) {
        int i;
        for (i = 0; i < (this.messages.size()); i++)
        {
            if ((this.messages.get(i).owner.name).equals(selectedUser))
                userMessagesContent.add(this.messages.get(i).content);
        }
        removeDuplicates(userMessagesContent);
        return userMessagesContent;
    }

    public List<String> getFollowingMessages(User user) {
        int i;
        for (i = 0; i < (this.messages.size() - 1); i++)
        {
            int n;
            for (n = 0; n < user.following.size() - 1; n++)
            {
                if (this.messages.get(i).owner.name == user.following.get(n))
                    subscriptionMessages.add(this.messages.get(i).content);
            }
        }
        return subscriptionMessages;
    }

    public removeDuplicates(arrayName) {
        Set<String> hs = new HashSet<>();
        hs.addAll(arrayName);
        arrayName.clear();
        arrayName.addAll(hs);
    }
}
