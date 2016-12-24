/*
#datastructures
#trees
#binarytree
Status : TODO
*/
public class GenericTreeTrasversals {

    class Node{
        int data ;
        Node leftChildren;
        Node rightChildren;
    }

    void visitNode(Node root)
    {
        System.out.println("Data:"+root.data);
    }

    //DFS infix
    public void inorder(Node root)
    {
        inorder(root.leftChildren);
        visitNode(root);
        inorder(root.rightChildren);
    }

    //DFS prefixWalk
    public void preorder(Node root)
    {
        visitNode(root);
        inorder(root.leftChildren);
        inorder(root.rightChildren);
    }

    //DFS sufixWalk
    public void postorder(Node root)
    {
        inorder(root.rightChildren);
        inorder(root.leftChildren);
        visitNode(root);

    }

    //BFS walk
    public void levelOrder(Node root)
    {
    }

}
