package BinarySearchTree;

import java.util.Scanner;

public class CheckIfBinarySearchTree {

    class Node {
        Node leftNode = null ;
        Node rightNode = null ;
        int value;
    }

    Node root=null;

    void insertValue(Node root ,int newValue){
        if(root==null) {
            root = new Node();
            root.value = newValue;
        }
            else if (root.leftNode != null && root.rightNode != null) {
                insertValue(root.leftNode, newValue);
                insertValue(root.rightNode, newValue);
            } else if (root.leftNode == null) {
                root.leftNode =new Node();
                root.leftNode.value=newValue;
            } else {
                root.rightNode = new Node();
                root.rightNode.value = newValue;
            }

          this.root = root;

    }

    Boolean  checkBinarySearchTree(Node root,int small, int large)
    {
        if(root==null)
            return true;

        else if(root.value<large && root.value>small)
        {
          Boolean isLeftBst=  checkBinarySearchTree(root.leftNode,small,root.value);
           Boolean isRightBst= checkBinarySearchTree(root.rightNode,root.value,large);
            return isLeftBst && isRightBst;
        }
        else
            return false;

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
                tree.insertValue(tree.root,value);
            }

            if(choice==2){
                System.out.println(" Enter The Value : ");
                value=sc.nextInt();
                tree.root=null;
                tree.insertValue(tree.root,value);
            }

            if(choice==3){
                boolean result =tree.checkBinarySearchTree(tree.root,Integer.MIN_VALUE, Integer.MAX_VALUE);
                if( result==true)
                    System.out.println("Yes, it's a Binary search Tree");
                else
                    System.out.println("No, it's not a Binary search Tree");
            }

            if(choice==0){
                System.exit(0);
            }


        }
    }











}
