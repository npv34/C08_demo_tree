package src;

public class MyTree {
    public Node root;

    public MyTree() {
        this.root = null;
    }

    public Node insert(Integer value) {
        Node node = new Node(value);
        Node currentNode = this.root;
        if (currentNode == null) {
            this.root = node;
        } else {
            Node previous = currentNode;
            while (currentNode != null) {
                previous = currentNode;
                if (currentNode.data > value) {
                    currentNode = currentNode.left;
                } else {
                    currentNode = currentNode.right;
                }
            }

            if (previous.data > value) {
                previous.left = node;
            } else {
                previous.right = node;
            }

        }
        return this.root;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    /*
     * Duyet tree
     * @param Node parent
     */
    public void readTree(Node parent){
        if (parent == null) {
            return;
        }
        System.out.println(parent.data);
        this.readTree(parent.left);
        this.readTree(parent.right);
    }
 }
