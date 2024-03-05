package BST;

public class BTree {
    Node6 root;
    public BTree(){
        root=null;
    }
    
    Node6 newNode(int data){
        return new Node6(data);
    }
    
    Node6 insert(Node6 root, int data){
        if(root!=null){
            if(data<root.data){
                root.left=insert(root.left, data);
            }
            else{
                root.right=insert(root.right, data);
            }
        }
        else{
            root=newNode(data);
            System.out.println(data + " Eklendi");
        }
        return root;
    }
}
