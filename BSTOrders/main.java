package BSTOrders;

public class main {
    public static void main(String[] args){
        Tree tree = new Tree();
        
        tree.root=tree.insert(tree.root,10);
        tree.root=tree.insert(tree.root,8);
        tree.root=tree.insert(tree.root,15);
        tree.root=tree.insert(tree.root,5);
        tree.root=tree.insert(tree.root,12);
        tree.root=tree.insert(tree.root,20);
        tree.root=tree.insert(tree.root,9);
        tree.root=tree.insert(tree.root,25);
        tree.root=tree.insert(tree.root,30);
        tree.delete(tree.root, 8);
        tree.delete(tree.root, 25);
        
        tree.preOrder(tree.root);
        System.out.print("\n\n");
        tree.inOrder(tree.root);
        System.out.print("\n\n");
        tree.postOrder(tree.root);
        System.out.print("\n\n");
        System.out.println(tree.height(tree.root));
        System.out.println(tree.numberOfObjects(tree.root));
        
    }
}
