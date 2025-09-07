class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int x) { val = x; }
}

public class LCABinaryTree {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
      
        if (root == null || root == p || root == q) {
            return root;
        }
       
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        
        // If both sides return non-null → root is LCA
        if (left != null && right != null) {
            return root;
        }
        
        // Else return whichever side is non-null
        return (left != null) ? left : right;
    }
}
