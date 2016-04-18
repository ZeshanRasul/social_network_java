import java.util.List;
import java.util.Scanner;

import static java.lang.System.out;

/**
 * Created by zeshanrasul on 16/04/2016.
 */
public class Javitter {


    private static AllUsers userList = new AllUsers();
    private static AllMessages messageList = new AllMessages();

    public Javitter(AllUsers userList, AllMessages messageList) {
        this.userList = userList;
        this.messageList = messageList;
    }

    public static void main(String args[]) {
        out.println("Welcome to Javitter");
        welcomeScreen();
    }

    private static void welcomeScreen() {

        out.println("What would you like to do?");
        out.println("1. Sign up / In");
        out.println("2. Post a message");
        out.println("3. View your own messages");
        out.println("4. View other users posts");
        out.println("5. Follow another user");
        out.println("6. View subscriptions posts");
        out.println("7. Quit");

        Scanner scanner = new Scanner(System.in);
        int selection = Integer.parseInt(scanner.nextLine());

        out.println(selection);

        switch (selection) {
            case 1: createNewUser();
                    return;
            case 2: createNewMessage();
                    return;
            case 3: viewOwnMessages();
                    return;
            case 4: viewUsersMessages();
                    return;
            case 5: followUser();
                    return;
            case 6: viewSubscriptionMessages();
                    return;
            case 7: closeProgram();
                    break;
            default: out.println("Invalid selection, please try again");
        }

    }

    private static void closeProgram() {
        out.println("Goodbye!");
        System.exit(0);
    }

    public static void createNewUser() {
        out.println("Welcome, please enter your desired username");
        receiveInput();
        userList.newUser(input);
        userList.getCurrentUser();
        welcomeScreen();
    }

    public static void createNewMessage() {
        out.println("Welcome, please enter your message");
        receiveInput();
        messageList.newMessage(input, userList.getCurrentUser());
        messageList.getOwnMessages(userList.getCurrentUser().name);
        welcomeScreen();
    }

    public static void viewOwnMessages() {
        User user = userList.getCurrentUser();
        List messages = messageList.getOwnMessages(user.name);
        out.println(messages);
        welcomeScreen();
    }

    public static void viewUsersMessages() {
        out.println("Whose messages would you like to see?");
        receiveInput();
        List otherUsersMessages = messageList.getUserMessages(input);
        out.println(otherUsersMessages);
        welcomeScreen();
    }

    public static void followUser() {
        out.println("Who would you like to follow?");
        receiveInput();
        User user = userList.getCurrentUser();
        user.addFollowerToUser(input);
        welcomeScreen();
    }

    public static void viewSubscriptionMessages() {
        out.println(messageList.getFollowingMessages(userList.getCurrentUser()));
        welcomeScreen();
    }

    public static void receiveInput() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
    }




}
