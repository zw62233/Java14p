import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class leverOrder2{
    public List<List<Integer>> leverOrder(TreeNode root){
        List<List<Integer>> mat = new LinkedList<>();
        Queue<TreeNode> queue =  new LinkedList<>();
        if(root != null){
            queue.offer(root);
        }
        while(!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> rowNode = new LinkedList<>();
            while (size > 0) {
                TreeNode treeNode = queue.poll();
                rowNode.add(treeNode.val);
                if (treeNode.left != null) {
                    queue.offer(treeNode.left);
                }
                if (treeNode.right != null) {
                    queue.offer(treeNode.right);
                }

                --size;
            }
            //放一行
            mat.add(rowNode);
        }
        return mat;
    }
}
