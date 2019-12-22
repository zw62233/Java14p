class Node {
    Node left;
    Node right;
    int val;
}
public class Btree {
    public Node  find(Node root,int val){
        if (root == null){
            return null;
        }
        if(root.val == val){
            return root;
        }
        Node node = find(root.left,val);
        if(node != null){
            return node;
        }
        return find(root.right,val);
    }
}
