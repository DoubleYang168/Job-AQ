package examination.tme;

public class Main1 {
    class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public TreeNode pruneLeaves (TreeNode root) {
        // write code here
        if (root == null)
            return root;


        return null;
    }
    public void dfs(TreeNode node) {
        TreeNode p = node;
        if (p != null) {
            if ((p.left == null && p.right == null) || p == null) {
                return;
            } else if (p.left.left == null && p.left.right == null) {
                p.left = null;
            } else if (p.right.left == null && p.right.right == null) {
                p.right = null;
            }
            dfs(node.left);
            dfs(node.right);
        }
    }

}
