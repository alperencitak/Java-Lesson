package BSTOrders;

public class Tree {
    Node root;
    public Tree(){
        root=null;
    }
    
    Node newNode(int data){
        return new Node(data);
    }
    
    Node insert(Node root, int data){
        if(root!=null){
            if(data<root.data){
                root.left=insert(root.left,data);
            }
            else{
                root.right=insert(root.right,data);
            }
        }
        else{
            root=newNode(data);
        }
        return root;
    }
    Node delete(Node root,int data){
        if(root==null){
            System.out.println("Tree is empty.");
            return root;
        }
        if(root.data == data){
            Node t1,t2;
            if(root.left == root.right){
                root=null;
                return root;
            }
            else if(root.left==null){
                t1=root.right;
                root=null;
                return t1;
            }
            else if(root.right==null){
                t1=root.left;
                root=null;
                return t1;
            }
            else{
                t1=t2=root.right;
                while(t1.left!=null){
                    t1=t1.left;
                }
                t1.left=root.left;
                root=null;
                return t2;
            }
        }
        else{
            if(data<root.data){
                root.left = delete(root.left,data);
            }
            else{
                root.right = delete(root.right,data);
            }
            return root;
        }
    }
    void preOrder(Node root){
        if(root!=null){
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    void inOrder(Node root){
        if(root!=null){
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }
    void postOrder(Node root){
        if(root!=null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }
    }
    int height(Node root){
        if(root==null){
            return 0;
        }
        else{
            int sol=0,sag=0;
            sol = height(root.left);
            sag = height(root.right);
            if(sol>sag){
                return sol+1;
            }
            else{
                return sag+1;
            }
        }
    }
    int numberOfObjects(Node root){
        if(root==null){
            return 0;
        }
        else{
            return numberOfObjects(root.left) + numberOfObjects(root.right) + 1;
        }
    }
}
