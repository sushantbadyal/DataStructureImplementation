package BinarySearchTree;

import java.util.Scanner;

public class BinarySearchTree {

    class Node {
        Node leftNode = null ;
        Node rightNode = null ;
        int value;
    }

    Node root=null;

         Node insertValue(Node root ,int newValue)
         {

             if(root==null)
             {
                 root=new Node();
                 root.value = newValue;
             }
             else if(newValue < root.value)
             {
              root.leftNode=insertValue(root.leftNode,newValue);
             }
             else{
                 root.rightNode=insertValue(root.rightNode,newValue);
             }
             return root;
         }


         void preOrder(Node root){

             if(root!=null)
             {
                 System.out.print (" "+root.value);
                 preOrder(root.leftNode);
                 preOrder(root.rightNode);
             }

         }

    void inOrder(Node root){

        if(root!=null)
        {
            inOrder(root.leftNode);
            System.out.print (" "+root.value);
            inOrder(root.rightNode);
        }

    }

    void postOrder(Node root){

        if(root!=null)
        {
            postOrder(root.leftNode);
            postOrder(root.rightNode);
            System.out.print (" "+root.value);
        }

    }



         public static void main(String args[])
         {
             BinarySearchTree tree=new BinarySearchTree();
             Scanner sc=new Scanner(System.in);
             int choice=1,value;
             while(choice!=0)
             {
                 System.out.println("\nTo Enter Value         : Press 1");
                 System.out.println("For Inorder Traversal  : Press 2");
                 System.out.println("For Preorder Traversal  : Press 3");
                 System.out.println("For Postorder Traversal  : Press 4");
                 System.out.println("For Exit               : Press 0");
                 System.out.println(" Enter Choice: ");
                 choice=sc.nextInt();
                 if(choice==1){
                     System.out.println(" Enter The Value : ");
                     value=sc.nextInt();
                    tree.root= tree.insertValue(tree.root,value);
                 }
                     if(choice==2){
                       tree.inOrder(tree.root);
                     }
                 if(choice==3){
                     tree.preOrder(tree.root);
                 }
                 if(choice==4){
                     tree.postOrder(tree.root);
                 }

                 if(choice==0){
                     System.exit(0);
                 }


             }
         }
}
