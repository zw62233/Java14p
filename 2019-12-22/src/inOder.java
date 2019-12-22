import java.util.ArrayList;
import java.util.List;

class TreeNode{
    TreeNode left;
    TreeNode right;
    int val;
    TreeNode(int val){
        this.val = val;
    }
}
public class inOder {
    public static void _inOrder(TreeNode root, List<Integer> list){
        if (root != null){
            _inOrder(root.left,list);
            list.add(root.val);
            _inOrder(root.right,list);
        }
    }
    public static List<Integer> inOrderTraversal(TreeNode root){
        List<Integer> list = new ArrayList<>();
        _inOrder(root,list);
        return list;
    }

    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(5);
        TreeNode n2 = new TreeNode(4);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(2);
        TreeNode n5 = new TreeNode(1);

        n1.right = n2;
        n1.left = n3;
        n3.left = n4;
        n2.right = n5;

        inOrderTraversal(n1);
    }
}
