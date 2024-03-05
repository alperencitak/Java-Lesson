package BST;

public class BSTmain {
    public static void main(String[] args){
        BTree tree=new BTree();
        
        tree.root = tree.insert(tree.root,10);
        tree.root = tree.insert(tree.root,15);
        tree.root = tree.insert(tree.root,7);
        tree.root = tree.insert(tree.root,13);
        tree.root = tree.insert(tree.root,5);
        
        System.out.println("Kökün datası: " + tree.root.data);
        System.out.println("Kökün sağının datası: " + tree.root.right.data);
        System.out.println("Kökün solunun datası: " + tree.root.left.data);
        System.out.println("Kökün sağının solunun datası: " + tree.root.right.left.data);
        System.out.println("Kökün solunun solunun datası: " + tree.root.left.left.data);
        
        
    }
}
