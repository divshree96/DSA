package binarysearchtree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
//        bst.insert(47);
//        bst.insert(21);
//        bst.insert(76);
//        bst.insert(18);
//        bst.insert(52);
//        bst.insert(82);
//        bst.insert(27);
//
//        System.out.println("BST CONTAINS 27 " + bst.rContains(27));
//        System.out.println("BST CONTAINS 17 " + bst.rContains(17));
//        System.out.println(bst.contains(21));
//        System.out.println(bst.contains(2));
        //System.out.println(bst.root.left.right.value);

//             2
//           /   \
//          1     3

        bst.rInsert(2);
        bst.rInsert(1);
        bst.rInsert(3);

        System.out.println("Root : " + bst.root.value);
        System.out.println("Root->left : " + bst.root.left.value);
        System.out.println("Root->right : " + bst.root.right.value);
    }
}
