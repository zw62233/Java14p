import java.util.LinkedList;
import java.util.Queue;

public class complete_binary_tree {
    public boolean isCompleteBinaaryTree(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        if (root != null){
        queue.offer(root);
        }
        while(!queue.isEmpty()){
            TreeNode treeNode = queue.poll();
            if (treeNode == null){
                break;
            }
            queue.offer(treeNode.left);
            queue.offer(treeNode.right);
        }
        while(!queue.isEmpty()){
            TreeNode treeNode = queue.poll();
            if (treeNode != null){
                return false;
            }
        }
        return true;
    }


}
