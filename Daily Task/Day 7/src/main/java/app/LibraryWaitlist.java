
package app;

import java.util.ArrayDeque;
import java.util.Queue;

public class LibraryWaitlist {

    // ArrayDeque provides efficient insertion and removal at both ends.
    private Queue<String> waitlist = new ArrayDeque<>();

    public void addMember(String name) {
        waitlist.offer(name);
        System.out.println(name + " added to the waitlist.");
    }

    public void serveNextMember() {
        String next = waitlist.poll();

        if (next == null) {
            System.out.println("The waitlist is empty.");
        } else {
            System.out.println("Now serving: " + next);
        }
    }

    public void displayWaitlist() {
        System.out.println("Current waitlist: " + waitlist);
    }
}
