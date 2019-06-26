package pl.sda.gdajava25.binarySerchTree;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        BST bst = new BST();
        bst.put(9);
        bst.put(2);
        bst.put(3);
        bst.put(5);
        bst.put(7);
        bst.put(8);
        bst.put(1);
        bst.put(6);
        bst.put(4);
        List<BSTNode> inOrderList = bst.getInOrderList();
        List<BSTNode> preOrderList = bst.getPreOrderList();
//        for (BSTNode node : inOrderList) {
//            System.out.println(node.getValue());
//        }
        //for(BSTNode node : preOrderList){
        //  System.out.println(node.getValue());
        //}
        List<BSTNode> postOrderList = bst.getPostOrderList();
        for (BSTNode node : postOrderList) {
            System.out.println(node.getValue());
        }
        System.out.println(bst.serchNode(5));
        System.out.println(bst.serchNode(1));
        System.out.println(bst.serchNode(8));
        System.out.println(bst.serchNode(11));
    }
}
