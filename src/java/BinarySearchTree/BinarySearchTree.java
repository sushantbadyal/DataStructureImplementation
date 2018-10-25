package BinarySearchTree;

import java.util.Scanner;

public class BinarySearchTree {

    class Node {
        int key;
        Node left, right;

        Node(int value) {
            key = value;
            left = right = null;
        }
    }


         Node root;
         BinarySearchTree(){
             root=null;
         }


         void insert(int value){
             root=insertValue(root,value);
         }


         Node insertValue(Node root ,int value){
             if(root==null){
                 root=new Node(value);
             }
             else if(value<root.key){
              root.left=insertValue(root.left,value);
             }
             else{
                 root.right=insertValue(root.right,value);
             }
             return root;
         }



         void preOrder(){
           preOrderExecute(root);
         }


         void preOrderExecute(Node root){

             if(root!=null)
             {
                 System.out.print (" "+root.key);
                 preOrderExecute(root.left);
                 preOrderExecute(root.right);
             }

         }


    void inOrder(){
        inOrderExecute(root);
    }


    void inOrderExecute(Node root){

        if(root!=null)
        {
            inOrderExecute(root.left);
            System.out.print (" "+root.key);
            inOrderExecute(root.right);
        }

    }



    void postOrder(){
        postOrderExecute(root);
    }


    void postOrderExecute(Node root){

        if(root!=null)
        {
            postOrderExecute(root.left);
            postOrderExecute(root.right);
            System.out.print (" "+root.key);
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
                     tree.insert(value);
                 }
                     if(choice==2){
                       tree.inOrder();
                     }
                 if(choice==3){
                     tree.preOrder();
                 }
                 if(choice==4){
                     tree.postOrder();
                 }

                 if(choice==0){
                     System.exit(0);
                 }


             }
         }
}
