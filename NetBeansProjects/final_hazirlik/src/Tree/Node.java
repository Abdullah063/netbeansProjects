
package Tree;


public class Node {
        int data;
        Node left;
        Node right;

        public Node() {
                this.data = -1;
                this.left = null;
                this.right = null;
        }
        public Node(int data)
        {
              this.data = data;
                this.left = null;
                this.right = null;  
        }

        public Node(int data, Node left, Node right) {
                this.data = data;
                this.left = left;
                this.right = right;
        }
        
       
}
