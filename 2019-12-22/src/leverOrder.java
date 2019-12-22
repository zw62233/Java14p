import java.util.LinkedList;
import java.util.Queue;

public class leverOrder {
    public void LeverOrder(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        if(root == null){
            queue = null;
        }
        if (root != null){
            queue.offer(root);
        }
        while(!queue.isEmpty()){
            TreeNode treeNode = queue.poll();
            System.out.println(treeNode.val);
            if (treeNode.left != null){
                queue.offer(treeNode.left);
            }
            if(treeNode.right != null){
                queue.offer(treeNode.right);
            }
        }
    }
}
