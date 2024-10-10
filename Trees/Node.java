import java.util.List;

public class Node {
    public int val;
    public List<Node> childeren;

    public Node(int val) {
        this.val = val;
    }

    public Node(int val, List<Node> childeren) {
        this.val = val;
        this.childeren = childeren;
    }
}
