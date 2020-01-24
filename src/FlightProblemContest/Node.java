package FlightProblemContest;

import java.util.ArrayList;

public class Node {
    double y, x;
    double value; // shortest way to reach this node
    double reverseValue; // shortest way to reach this node from the reverse check
    ArrayList<String> shortestPaths; // saving the node we came from
    int allPaths; // how many short ways until here
    boolean isInShortPath; // checking if the current node is in the quick path.
    String leastDirectionChange; // saving the lowest maneuver
    int lowestDirectionChange; // saving the number of path with lowest direction change.
    ArrayList<String> lowestManeuver;

    public Node(double x, double y) {
        this.x = x;
        this.y = y;
        this.value = 0;
        this.reverseValue = 0;
        shortestPaths = new ArrayList<>();
        allPaths = 1;
        isInShortPath = false;
        leastDirectionChange = "";
        lowestManeuver = new ArrayList<>();
        lowestDirectionChange=0;

    }
}
