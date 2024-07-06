/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tree;

/**
 *
 * @author ABDULLAH
 */
public class NewMain {

     
        public static void main(String[] args) 
        {
                Node root = new Node(20);
                insert(root, 15);
                insert(root, 7);
                insert(root, 20);
                insert(root, 3);
                insert(root, 9);
                insert(root, 16);
                insert(root, 25);
                insert(root, 4);
                System.out.print("preOrder : ");
                preOrder(root);
                System.out.println("");
                System.out.print("inOrder : ");
                inOrder(root);
                System.out.println("");
                System.out.print("posOrder : ");
                posOrder(root);
             
        }
        static void posOrder(Node root)
        {
                if (root!=null) {
                        posOrder(root.left);
                        posOrder(root.right);
                        System.out.print(root.data+" ");
                }
        }
        static void inOrder(Node root)
        {
                if (root!=null) {
                        inOrder(root.left);
                        System.out.print(root.data+" ");
                        inOrder(root.right);
                }
        }
        
        
        static void preOrder(Node root)
        {
                if (root!=null) {
                        System.out.print(root.data+" ");
                        preOrder(root.left);
                        preOrder(root.right);
                }
        }
        
        static void insert(Node node, int value)
        {
                if (value < node.data) {
                        if (node.left!=null)
                        {
                                 insert(node.left, value);
                        }
                        else
                        {
                                node.left = new Node(value);
                        }
                }
                else if( value > node.data)
                {
                        if (node.right!=null)
                        {
                                insert(node.right, value); 
                        }
                        else
                        {
                                node.right = new Node(value);
                        }
                }
        }
        
}
