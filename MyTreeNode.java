class MyTreeNode {
    int val;
    MyTreeNode left, right;

    public MyTreeNode(int val) {
        this.val = val;
    }
}

public class CheckSymmetricTree {

    public boolean isSymmetric(MyTreeNode root) {
        if (root == null) return true;
        return isMirror(root.left, root.right);
    }

    private boolean isMirror(MyTreeNode t1, MyTreeNode t2) {
        if (t1 == null && t2 == null) return true;
        if (t1 == null || t2 == null) return false;
        return (t1.val == t2.val)
                && isMirror(t1.left, t2.right)
                && isMirror(t1.right, t2.left);
    }

    public static void main(String[] args) {
        // Example: [1,2,2,3,4,4,3]
        MyTreeNode root = new MyTreeNode(1);
        root.left = new MyTreeNode(2);
        root.right = new MyTreeNode(2);
        root.left.left = new MyTreeNode(3);
        root.left.right = new MyTreeNode(4);
        root.right.left = new MyTreeNode(4);
        root.right.right = new MyTreeNode(3);

        CheckSymmetricTree obj = new CheckSymmetricTree();
        System.out.println(obj.isSymmetric(root)); // Output: true
    }
}
