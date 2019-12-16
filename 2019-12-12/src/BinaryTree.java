import javafx.util.Builder;

class Node{
    char val;
    Node left;
    Node right;

    public Node(char val){
        this.val = val;
    }
}
public class BinaryTree {
    static int Size = 0;
    static int LeafSize =0;
    public void preOrder(Node root){//前序
        if(root == null){
           return;
        }
        else{//递归
            //根
            System.out.println(root.val);
            //左子树
            preOrder(root.left);
            //右子树
            preOrder(root.right);
        }
    }
    public void inOrfer(Node root){//中序遍历
        if(root != null){
            inOrfer(root.left);
            System.out.println(root.val);
            inOrfer(root.right);
        }
    }
    public void postOrfer(Node root){//后序
        if(root != null){
            postOrfer(root.left);
            postOrfer(root.right);
            System.out.println(root.val);
        }
    }

    public void getSize1(Node root){
        if(root != null){
            getSize1(root.left);
            getSize1(root.right);
            Size++;
        }
    }
    public int getSize2(Node root){
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return 1;
        }
        return getSize2(root.left) + getSize2(root.right)+1;
    }

    public static void getLeafSize1(Node root) {
        if(root == null)
            return;
        if(root.left == null && root.right == null){
            ++LeafSize;
            return;
        }
        getLeafSize1(root.left);
        getLeafSize1(root.right);
    }
    public int getLeafSize2(Node root){
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return 1;
        }
        return getSize2(root.right)+getSize2(root.left);
    }
    public Node BuildTree(){
        Node root = new Node('a');
        Node node1 = new Node('b');
        Node node2 = new Node('c');
        Node node3 = new Node('d');
        Node node4 = new Node('e');
        Node node5 = new Node('f');
        Node node6 = new Node('g');
        Node node7 = new Node('h');
        node1.left = node3;
        node1.right = node4;
        node2.left = node5;
        node2.right = node6;
        node4.right = node7;

        return root;
    }
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        Node root = bt.BuildTree();
        bt.postOrfer(root);
    }
}
