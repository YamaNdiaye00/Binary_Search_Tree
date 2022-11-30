public class BST {

    public Node root;

    /*

     * Class containing left and right child of current node and the key data To

     * link nodes to each other

     */

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

    /**
     * Search the tree for data
     *
     * @param data to look for
     * @return true if found, otherwise false
     */

    public Node search(int data) {

        Node currentNode = root;

        while (currentNode != null) {

            if (currentNode.data == data) {

                return currentNode;

            } else if (currentNode.data > data) {

                currentNode = currentNode.left;

            } else {

                currentNode = currentNode.right;

            }

        }

        return null;

    }

    /*

     * To delete a node we have consider three cases: 1. root has no children that

     * means its the root node 2. If node to be deleted is either leftmost node or

     * rightmost 3. leftmost node is internal and has both left and right child.

     */

    public boolean remove(int value) {

        Node parent = root;

        Node current = root;

        boolean isLeftChild = false;

        while (current.data != value) {

            parent = current;

            if (current.data > value) {

                isLeftChild = true;

                current = current.left;

            } else {

                isLeftChild = false;

                current = current.right;

            }

            if (current == null) {

                return false;

            }

        }

// Node which needs to be deleted will be present in current variable

// Case 1: If node to be deleted doesn't have any child means it is a root node

        if (current.left == null && current.right == null) {

            if (current == root) {

                root = null;

            }

            if (isLeftChild) {

                parent.left = null;

            } else {

                parent.right = null;

            }

        }

// Case 2: If node to be deleted have only one child

        else if (current.right == null) {

            if (current == root) {

                root = current.left;

            } else if (isLeftChild) {

                parent.left = current.left;

            } else {

                parent.right = current.left;

            }

        } else if (current.left == null) {

            if (current == root) {

                root = current.right;

            } else if (isLeftChild) {

                parent.left = current.right;

            } else {

                parent.right = current.right;

            }

        }

// Case 3: If node to be deleted is an internal node with both left and right

// child

        else if (current.left != null && current.right != null) {

            BST.Node successor = getMinimum(current);

            if (current == root) {

                root = successor;

            } else if (isLeftChild) {

                parent.left = successor;

            } else {

                parent.right = successor;

            }

            successor.left = current.left;

        }

        return true;

    }

    /**
     * find the minimum close to the node
     *
     * @param node to look for
     * @return closet minimum node
     */

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

    /**
     * Add value to the tree.
     *
     * @param value to add to Tree
     */

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

    /**
     * inorder traversal of tree
     *
     * @param root tells the starting nodeF
     */

    public void inorderTraversal(Node root) {

        if (root != null) {

            inorderTraversal(root.left);

            System.out.print(root.data + "\t");

            inorderTraversal(root.right);

        }

    }
}