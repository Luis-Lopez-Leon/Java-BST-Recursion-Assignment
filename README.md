# Java-BST-Recursion-Assignment
Spring 2022 Data Structures &amp; Algorithms Assignment 1

Download the code provided by the textbook in order to complete this program.
Write a program that

1. Reads a word (series of characters) from the keyboard and builds a Binary Search Tree
out of them. The assumption is that the word is in all caps. Use the code in the book to build this
tree, and later display it.

You are also asked to write the following methods and add them to class Tree (in Tree.java
that you download from the textbook’s online resources).

2. A method called displayLeftSide that displays the nodes on the left side of the tree as a
word. This method MUST be written recursively. Add the proper method call in the driver
class corresponding to the menu option.

3. A method called displayLeaves that displays the leaves of a tree as a word. This method
MUST be recursive. Add the proper method call in the driver class corresponding to the menu
option.

4. A method called siblingSubtree that displays the subtree of a node that will be
searched based on user input.

In your driver class, you need to have the following menu to test the methods you wrote above:
Please note that you first read the series of characters from the keyboard, build a BST, and then
display the following menu:

Please choose an option:

1. Display the tree
2. Display the word built out of the characters on the left side of this
tree.
3. Display the word built out of the characters that form the leaves of
this tree.
4. Display the sibling subtree of a character node
 a. Enter the character
5. Exit.

The following could be an example of execution of this program. 

If the user inputs the following series of characters:
 FHKBDA

The BST would look like the following:

![image](https://user-images.githubusercontent.com/103616373/173102430-9fc41b14-f2ef-477f-a349-55a974bada5e.png)


Please note that the method provided in the book will not display this tree in the above format!
I am using this as an example to describe what is expected.

For this tree:

Option 2 should generate: ABF

Option 3 should generate: ADK

Option 4 based on character B should generate:

![image](https://user-images.githubusercontent.com/103616373/173102492-6f53808a-4b7b-4296-b756-11d7d7e7de45.png)


Again the method that you will be using to display trees will not generate this exact format. But
you will use that method, and that format is acceptable.
