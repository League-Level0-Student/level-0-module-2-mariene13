//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


package _05_magic_8_ball;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….
        public static void main(String[] args) {
			
		
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
            int number= new Random().nextInt(4);{
	// 3. Print out this variable
           JOptionPane.showMessageDialog(null, "new Random");
	// 4. Get the user to enter a question for the 8 ball
          JOptionPane.showInputDialog(null, "do i have a carmex in my pocket");
	// 5. If the random number is 0
            if (number==0 ){
            	JOptionPane.showMessageDialog(null,"yess");
            
            }
            
	// -- tell the user "Yes"
            
	// 6. If the random number is 1
         if ("number==1"!=null ){
        	 JOptionPane.showMessageDialog(null, "nooo");
         }
         
	// -- tell the user "No"
           
	// 7. If the random number is 2
             if ("number=2"!=null);{
            	 JOptionPane.showInputDialog(null,"maybe you should ask google");	 
             }
             }
	// -- tell the user "Maybe you should ask Google?"
            
	// 8. If the random number is 3
           if ("number==3"!=null);{
        	   JOptionPane.showMessageDialog(null,"ok");
           }
           
	// -- write your own answer
        
            }
        }

