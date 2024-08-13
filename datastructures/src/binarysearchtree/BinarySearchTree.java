package binarysearchtree;

public class BinarySearchTree {
    Node root;

    class Node {
        int value;
        Node left;
        Node right;

        private Node(int value) {
            this.value = value;
        }
    }

    public boolean insert(int value) {
        Node node = new Node(value);
        if(root == null) {
            root = node;
            return true;
        }

        Node temp = root;
        while(true) {
            if(node.value == temp.value) return false;

            if(node.value < temp.value) {
                if(temp.left == null) {
                    temp.left = node;
                    return true;
                }
                temp = temp.left;
            } else {
                if(temp.right == null) {
                    temp.right = node;
                    return true;
                }
                temp = temp.right;
            }
        }
    }

    public boolean contains(int val) {
        if(root == null) return false;

        Node temp = root;
        while(temp != null) {
            if(temp.value > val) {
                temp = temp.left;
            } else if(temp.value < val){
                temp = temp.right;
            } else {
                return true;
            }
        }
        return false;
    }

    public boolean rContains(int val) {
        return rContains(root, val);
    }

    private boolean rContains(Node currentNode, int val) {
        if(currentNode == null) return false;

        if(currentNode.value == val) return true;

        if(val < currentNode.value) {
            return rContains(currentNode.left, val);
        } else {
            return rContains(currentNode.right, val);
        }
    }

    public void rInsert(int value) {
        if(root == null) root = new Node(value);
        rInsert(root, value);
    }

    public Node rInsert(Node currentNode, int value) {
        if(currentNode == null) return new Node(value);

        if(value < currentNode.value) {
            currentNode.left = rInsert(currentNode.left, value);
        } else if(value > currentNode.value){
            currentNode.right = rInsert(currentNode.right, value);
        }
        return currentNode;
    }

}
