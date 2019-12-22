

public class maxDepth {
    public int MaxDepth(TreeNode root){
        return root == null ? 0:Math.max(MaxDepth(root.left),MaxDepth(root.right))+1;
    }
}
