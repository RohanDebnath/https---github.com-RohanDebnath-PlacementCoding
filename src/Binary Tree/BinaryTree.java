
public class BinaryTree {

    private Treenode root;

    private class Treenode {
        private Treenode left;
        private Treenode right;
        private int data;

        public Treenode(int data) {
            this.data = data;
        }
    }

    public void createBinaryTree() {
        Treenode first = new Treenode(10);
        Treenode second = new Treenode(20);
        Treenode third = new Treenode(30);
        Treenode fourth = new Treenode(40);
        Treenode fifth = new Treenode(40);

        root = first;
        first.left = second;
        fifth.right = third;

        second.left = fourth;
        second.right = fifth;
    }

    public void recursive_Preorder(Treenode root) {
        if (root == null) {
            return;
        }
        else{
        System.out.println(root.data + " ");
        recursive_Preorder(root.left);
        recursive_Preorder(root.right);
        }
    }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.createBinaryTree();
        bt.recursive_Preorder(bt.root);

    }
}
