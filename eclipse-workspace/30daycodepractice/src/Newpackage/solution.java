package Newpackage;

import java.io.*;
import java.util.*;

public class solution<T> {
    private static final String Character = null;
	// Write your code here.
    Stack<Character> myStack = new Stack<Character>();
    Queue myqueue = new LinkedList<>();
  public void pushCharacter(char c)
  {
    
     myStack.push(c);
  }
  public void enqueueCharacter(char c)
  {
      
            
            myqueue.add(c);
  }
  public char popCharacter()
  {
      char retc=' ';
      if( myStack.empty()==false)
      {
          retc=myStack.pop();
      }
      return retc;
  }
  public char dequeueCharacter()
  {
       char retc1=' ';
   if( myqueue.isEmpty()==false)
   {
       retc1=(char) myqueue.remove();
   }
   return retc1;
  }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        solution p = new solution();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}