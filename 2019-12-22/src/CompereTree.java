public class CompereTree {
    public boolean isSame(TreeNode root1,TreeNode root2){
        if(root1 == null || root2 == null ) {
            return false;
        }
        if(root1 != null){
            if(root1 == root2){
                 return isSame(root1.left,root2.left)&& isSame(root1.right,root2.right);
            }
        }
        return false;
    }
    public boolean compereTree(TreeNode s,TreeNode t){
        if(s == null){
            return false;
        }
        if(isSame(s,t)){
         return  true;
        }
        if(isSame(s.left,t)){
            return true;
        }
        return isSame(s.right,t);
    }
}
