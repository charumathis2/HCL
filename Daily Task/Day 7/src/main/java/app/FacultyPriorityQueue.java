
package app;

import java.util.PriorityQueue;
import java.util.Queue;

public class FacultyPriorityQueue {

    // Lower priority number means the request is served earlier.
    private Queue<FacultyRequest> requests = new PriorityQueue<>();

    public void addRequest(String name, int priority) {
        requests.offer(new FacultyRequest(name, priority));
        System.out.println(name + "'s request added.");
    }

    public void serveNextRequest() {
        FacultyRequest next = requests.poll();

        if (next == null) {
            System.out.println("No pending requests.");
        } else {
            System.out.println("Serving: " + next.name
                    + " (priority " + next.priority + ")");
        }
    }

    private static class FacultyRequest
            implements Comparable<FacultyRequest> {

        private String name;
        private int priority;

        FacultyRequest(String name, int priority) {
            this.name = name;
            this.priority = priority;
        }

        @Override
        public int compareTo(FacultyRequest other) {
            return Integer.compare(this.priority, other.priority);
        }
    }
}
