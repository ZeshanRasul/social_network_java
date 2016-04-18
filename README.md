# Java Social Network

**Task to build a social network in Java**

## Installation Instructions

```
$ git clone https://github.com/ZeshanRasul/social_network_java
$ brew install gradle (Download and install Gradle)
$ cd (into cloned local repository)
$ gradle dependencies
$ cd main/java
$ javac javitter.java
$ java javitter
```

## Technologies used

I used Java, Junit and Mockito.  Java to write the code, Junit for testing and Mockito for mocking.  
This was all done in the IntelliJ IDEA IDE. 
Prior to this task (and a brief kata to get my bearings) this was my first experience with all of the aforementioned technologies.

## Features

A user can sign up (create new user), post messages, view their own messages, view other user messages and subscribe to other users, allowing them to view posts of those they have subscribed to.

## Design approach and Challenges

I created this application using a main 'Javitter' class, which contained the main function with which the app was run, as well as the logic for the menu and the methods called in each menu option.  This led to the main class being long and containing a large number of methods, as well as a lot of the input output logic.  In hindsight it may have been wise to extract the menu/IO logic to a seperate class.

I also created individual classes for User and Message.  Each one having the basic attributes of the user and message.  This kept these classes fairly simple, and they were not needed to be called from the main class.

This was because I also made AllUsers and AllMessages classes.  The AllUsers class had a list of all users, which was updated each time a new user was created.  There is also a current user retrieval method as well as a method to display all users.  I feel this class was useful to seperate some responsibility from an individual User class.

The AllMessages class had a list of all messages, which was updated each time a new message was created. There are also methods to retrieve current users messages, a given users messages, all messages and a the messages of subscribers.  I ran into some issues here when iterating through the array of messages.  Although some initial problems were solved when I became used to the Java syntax, there were some that remained.  For example, a message had two properties, the content and a user.  The user was not defined by username but by object ID.  This made it tricky to compare the given name when searching by username inputted, with the owner of the message when iterating through the array of messages.

In hindsight, rather than saving all messages in a 'messages' ListArray and then trying to iterate through the entire array and only displaying them if their owner was the same user with the username given, I would have instead created seperate arrays for each user containing their message.  Initially I felt that would be a duplication and may cause issues when displaying aggregated message lists for multiple users, in fact it would have been much simpler and I may have underestimated the complexity of some Java data objects.

I also came across issues where I was receiving duplicate messages and users.  Although I tried many different techniques there were some easy options I clearly missed.  My unfamiliarity with Java meant I was not aware of objects such as Collections, Unmodifiable Lists and HashSets.  I was able to implement HashSets late in my development process which saved a great deal of trouble and prevented any duplicates, but had I discovered these earlier, I may have solved some functionality issues.

I faced a major issue towards the end of the development process.  As I corrected my file structure, and moved all code into a main/java file and tests into a test/java file, I found all code stopped functioning and tests were no longer running due to a `Exception in thread “main” java.lang.ClassNotFoundException:`.  I tried resorting back to the original file structure as well as restarting the IDE.  I also checked multiple stackoverflow threads but was unable to find a solution.  This may well just be down to my unfamiliarity with Java and especially down to the strict time pressure.  This is something I hope to solve very soon, however will be difficult to complete in the timeframe given for the challenge to be submitted.  

I also found issues setting up and using Mockito and Gradle, technologies I had to spend time researching, however I now I have a relatively good grasp of.  Unfortunately my tests are not as thorough as I would have liked however, as the error mentioned above stopped me from being able to run tests properly, so I was unable to tell what was working and what wasn't.  This combined with new syntax and style of writing tests and particular mocks, made testing a challenge.  Again, outside of the confines of a time pressured task, I will enjoy correcting these and being able to test in more depth so I can better refactor my code.

## Future developments and improvements

I greatly enjoyed developing this application while learning the basics of Java. My first priority for future development is to correct the `Exception in thread “main” java.lang.ClassNotFoundException:` mentioned above, in order to regain full functionality.  Although difficult to gauge at this stage with my limited knowledge of Java, I feel as though this should be relatively easy to solve, as this was only caused by something as simple as change in file structure, there shouldn't be any persisting errors in the code itself. 

I would also like to refactor the message saving system.  Rather than saving all messages to one ArrayList, only accessible by an owner property which refers to the user object ID rather than username.  I would instead save each users messages into their own ArrayList, potentially saved in the User class.  This would make it much easier to display other users messages and solve an issue I spent much time debugging.  This would bring my code to full functionality as the message display has not been working correctly.

I would also like to extract the menu and command line interface from the main Javitter class.  This would likely make my main class much tidier, and I could also extract out many if not all of the supporting methods.

My tests are also limited, partly due to learning a new testing and mocking framework, but also because once I was unable to run my code, it was impossible to test code, and impossible to tell whether syntax and tests were written correctly.  I would like to be able to return to writing these tests, in order to learn the frameworks but also so that I can refactor my code and rest assured that functionality still remains.

Currently data is lost each time the application is run, I would also like to look at implementing a database so that users can persist data between sessions.



