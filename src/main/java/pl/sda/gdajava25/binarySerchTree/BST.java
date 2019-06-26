package pl.sda.gdajava25.binarySerchTree;

import java.util.ArrayList;
import java.util.List;

public class BST{
    private BSTNode root;
    private List<BSTNode> preOrderList = new ArrayList<BSTNode>();
    private List<BSTNode> inOrderList = new ArrayList<BSTNode>();
    private List<BSTNode> postOrderList = new ArrayList<BSTNode>();


    public void put(int value) {
        root = putRecursive(value, root);

    }

    private BSTNode putRecursive(int value, BSTNode current) {
        if (current == null) {
            return new BSTNode(value);
        }

        if (value < current.getValue()) {
            current.setLeftChild(putRecursive(value, current.getLeftChild()));
        } else if (value > current.getValue()) {
            current.setRightChild(putRecursive(value, current.getRightChild()));
        } else {
            return current;
        }
        return current;
    }

    public List<BSTNode> getPreOrderList() {
        preOrderRecursive(root);
        return preOrderList;
    }

    public boolean serchNode(int value) {
        return serchNodeRecursive(value, root);
    }

    private boolean serchNodeRecursive(int value, BSTNode root) {
        if (root.getValue() == value) {
            return true;
        }
        if (value < root.getValue() && root.getLeftChild() != null) {
            serchNodeRecursive(value, root.getLeftChild());
        } else if (value > root.getValue() && root.getRightChild() != null) {
            serchNodeRecursive(value, root.getRightChild());
        } else {
            return false;
        }
        return true;
    }

    private void preOrderRecursive(BSTNode current) {
        if (current == null) {
            return;
        }
        preOrderList.add(current);
        if (current.getLeftChild() != null) {
            preOrderRecursive(current.getLeftChild());
        }
        if (current.getRightChild() != null) {
            preOrderRecursive(current.getRightChild());
        }

    }

    public List<BSTNode> getInOrderList() {
        inOrderRecursive(root);
        return inOrderList;
    }

    private void inOrderRecursive(BSTNode root) {
        if (root.getLeftChild() == null) {
            inOrderList.add(root);
        } else if (root.getLeftChild() != null) {
            inOrderRecursive(root.getLeftChild());
            inOrderList.add(root);
        }
        if (root.getRightChild() != null) {
            inOrderRecursive(root.getRightChild());
        }


    }

    public List<BSTNode> getPostOrderList() {
        postOrderRecursive(root);
        return postOrderList;
    }

    private void postOrderRecursive(BSTNode root) {
        if (root.getLeftChild() == null && root.getRightChild() == null) {
            postOrderList.add(root);
            return;
        }
        if (root.getLeftChild() != null) {
            postOrderRecursive(root.getLeftChild());
        }
        if (root.getRightChild() != null) {
            postOrderRecursive(root.getRightChild());
        }
        postOrderList.add(root);
    }
}