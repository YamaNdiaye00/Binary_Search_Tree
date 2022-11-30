public class BST {

    public Node root;

    public class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    public BST() {
        this.root = null;
    }

    public Node search(int data) {

        Node currentNode = root;

        while (currentNode != null) {
            if (currentNode.data == data)
                return currentNode;
            else if (currentNode.data > data)
                currentNode = currentNode.left;
            else
                currentNode = currentNode.right;
        }
        return null;
    }

    /*
    PSEUDOCODE REMOVE
    Initialize target Node obtained by using search function
    IF target is null, then it doesn't exist in the tree, end function
    Node parentTarget <- root
    IF target is also the root, it means it has no parent else
        WHILE TRUE <- Infinite loop
            IF either of the parent children is the target, break out of the loop
            ELSE if the parent's value is greater than the target, we traverse the left side
            ELSE if the parent's value is smaller than the target, we traverse the right side'
        (End of loop, we know the target and its parent)
    IF the target only has a right child
        IF the target is the root, the new root is its right child
        ELSE target's right child succeeds
    ELSE IF the target is a leaf node
        IF the target is a left child, left child is null
        ELSE it is a right child, right child is null
    ELSE IF the target has only a left child
        The left child succeeds the target (Use parent to locate the side it takes)
    ELSE IF the target has only a right child
        The right child succeeds the target (Use parent to locate the side it takes)
    ELSE
        Initialize successor node <- smallest descendant of the target
        IF the target is the root
            successor becomes the node
        ELSE
            successor takes the target's place
        successor's left child becomes (ex) target's left child
     */

    public void remove(int value) {

        Node target = search(value);
        if (target == null) return;

        Node parentTarget = root;
        if (target != root) {
            while (true) {
                if (parentTarget.left == target || parentTarget.right == target) break;
                else if (parentTarget.data > value) parentTarget = parentTarget.left;
                else if (parentTarget.data < value) parentTarget = parentTarget.right;
            }
        }

        if (target.left == null && target.right != null) {
            if (target == root) root = root.right;
            else if (target == parentTarget.right) parentTarget.right = target.right;
            else if (target == parentTarget.left) parentTarget.left = target.right;

        } else if (target.left == null && target.right == null) {

            if (parentTarget.left == target) {
                parentTarget.left = null;
            } else {
                parentTarget.right = null;
            }

        } else if (target.right == null) {
            if (parentTarget.left == target) {
                parentTarget.left = target.left;
            } else {
                parentTarget.right = target.left;
            }

        } else {

            Node successor = getMinimum(target);

            if (target == root)
                root = successor;
            else if (parentTarget.left == target)
                parentTarget.left = successor;
            else
                parentTarget.right = successor;

            successor.left = target.left;
        }
    }

    public Node getMinimum(Node node) {

        Node nextHigher = null;
        Node nextHigherParent = null;
        Node current = node.right;

        while (current != null) {
            nextHigherParent = nextHigher;
            nextHigher = current;
            current = current.left;
        }

        if (nextHigher != node.right) {
            nextHigherParent.left = nextHigher.right;
            nextHigher.right = node.right;
        }
        return nextHigher;
    }

    public void insert(int value) {
        Node v = new Node(value);

        if (root == null) {
            root = v;
            return;
        }

        Node current = root;

        while (true) {
            if (value < current.data) {
                if (current.left == null) {
                    current.left = v;
                    return;
                } else current = current.left;
            } else {
                if (current.right == null) {
                    current.right = v;
                    return;
                } else current = current.right;
            }
        }
    }

    public void inorderTraversal(Node root) {

        if (root.left != null)
            inorderTraversal(root.left);

        System.out.print(root.data + "\t");

        if (root.right != null)
            inorderTraversal(root.right);

    }
}