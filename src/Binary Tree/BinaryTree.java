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
        Treenode fifth = new Treenode(50);

        root = first;
        first.left = second;
        first.right = third;

        second.left = fourth;
        second.right = fifth;
    }

    public void recursive_Preorder(Treenode root) {
        if (root == null) {
            return;
        } else {
            System.out.print(root.data + " "); 
            recursive_Preorder(root.left);
            recursive_Preorder(root.right);
        }
    }

    public int height(Treenode root) {
        if (root == null) {
            return 0;
        } else {
            return Math.max(height(root.left), height(root.right)) + 1;
        }
    }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.createBinaryTree();
        System.out.print("Preorder Traversal: ");
        bt.recursive_Preorder(bt.root);
        System.out.println();
        System.out.println("Height of the tree: " + bt.height(bt.root));
    }
}
