package BinarySearchTree;

import java.util.Scanner;

public class CheckIfBinarySearchTree {

    class Node {
        int key;
        Node left, right;

        Node(int value) {
            key = value;
            left = right = null;
        }
    }


    Node root;
    CheckIfBinarySearchTree(){
        root=null;
    }


    void insert(int value){
        root=insertValue(root,value);
    }


    Node insertValue(Node root ,int value){
        if(root==null) {
            root = new Node(value);
        }
            else if (root.left != null && root.right != null) {
                insertValue(root.left, value);
                insertValue(root.right, value);
            } else if (root.left == null) {
                root.left =new Node(value);
            } else {
                root.right = new Node(value);
            }

         return root;

    }

    Boolean  isBinarySearchTree(Node root,int small, int large)
    {
        if(root==null)
            return true;

        else if(root.key<large && root.key>small)
        {
          Boolean isLeftBst=  isBinarySearchTree(root.left,small,root.key);
           Boolean isRightBst= isBinarySearchTree(root.right,root.key,large);
            return isLeftBst && isRightBst;
        }
        else
            return false;

    }



    void check() {

             Boolean result= isBinarySearchTree(root,Integer.MIN_VALUE, Integer.MAX_VALUE);
             if( result==true)
             System.out.println("Yes, it's a Binary search Tree");
             else
                 System.out.println("No, it's not a Binary search Tree");

              }




    public static void main(String args[])
    {

        CheckIfBinarySearchTree tree=new CheckIfBinarySearchTree();
        Scanner sc=new Scanner(System.in);
        int choice=1,value;
        while(choice!=0)
        {
            System.out.println("\nTo Enter Value                            : Press 1");
            System.out.println("To Create a New Tree & Delete Previous One : Press 2");
            System.out.println("To Check Result                             : Press 3");
            System.out.println("For Exit                                    : Press 0");
            System.out.println(" Enter Choice                               : ");
            choice=sc.nextInt();
            if(choice==1){
                System.out.println(" Enter The Value : ");
                value=sc.nextInt();
                tree.insert(value);
            }

            if(choice==2){
                System.out.println(" Enter The Value : ");
                value=sc.nextInt();
                tree.root=null;
                tree.insert(value);
            }

            if(choice==3){
                  tree.check();
            }

            if(choice==0){
                System.exit(0);
            }


        }
    }











}
