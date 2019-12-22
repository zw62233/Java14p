public class BalanceTree {
    public boolean isBalanced (TreeNode root){
        if(root == null ){
            return true;
        }
        int left = getHeight(root.left);
        int right = getHeight(root.right);

        return Math.abs(left - right)<2 && isBalanced(root.right) && isBalanced(root.left);
    }

    private int getHeight(TreeNode root) {
        return root == null ? 0:Math.max(getHeight(root.left),getHeight(root.right))+1;
    }
}
