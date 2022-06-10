
//Luis Lopez
//Assignment 1

class Node
   {
   public char charData;              // char data item (key)
 
   public Node leftChild;         // this node's left child
   public Node rightChild;        // this node's right child

   public void displayNode()      // display yourself
      {
      System.out.print('{');
      System.out.print(charData);
      System.out.print("}");
      }
   }  // end class Node