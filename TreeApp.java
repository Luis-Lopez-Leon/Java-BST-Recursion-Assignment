import java.util.Scanner;

//Luis Lopez
//Assignment 1


class TreeApp
   {
   public static void main(String[] args){
	   
	   
	   
	  Scanner userInput = new Scanner(System.in);
	  int MenuChoice;//for do while loop
      String userWord;
      char userChar;
      Tree charTree = new Tree();

      
      //Building BST first
      
      System.out.print("Enter a word in all caps and press ENTER key: ");
      userWord = userInput.nextLine();//reads user word as a String
      
      for(int i = 0; i < userWord.length(); i++) {//Inserting each Character into a new Tree
    	  
    	  charTree.insert(userWord.charAt(i));
    	  
      }
      
      

      do {//Now we display the Menu
    	  
    	  
    	  System.out.print("\n\n1. Display the tree\n");
          System.out.print("2. Display the word built out of the characters on the left side of this tree.\n");
          System.out.print("3. Display the word built out of the characters that form the leaves of this tree.\n");
          System.out.print("4. Display the sibling subtree of a character node.\n");
          System.out.print("5. Exit.\n");
          int choice = userInput.nextInt();
          MenuChoice = choice;//assigns user's choice to MenuChoice for do while loop to work.
          switch(choice)
             {
             case 1:
                charTree.displayTree();
                break;
             case 2:
                
            	 charTree.displayLeftSide(charTree.getroot());
               
                break;
             case 3:
                
            	 charTree.displayLeaves(charTree.getroot());
                
                break;
             case 4:
             	System.out.print("a. Enter the character\n");
             	userChar = userInput.next().charAt(0);
             	charTree.siblingSubtree(userChar);
                
                break;
             case 5:
             
                break;
                
             default:
                System.out.print("Invalid entry\n");
             }  // end switch
          }// end do
    	  while(MenuChoice != 5);
     
      
      
      
      
      
      
   		}  // end main()
   }  // end class TreeApp