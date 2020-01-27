import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class famFeudQuestions
	{
		 static Scanner stringInput = new Scanner (System.in);
		 static Scanner intInput = new Scanner (System.in);
		 static String name;
		 static JFrame frame = new JFrame();
		 static String answer;
		 static int counter;
		 
		
		public static void famFuedWelcome()
		{
			JOptionPane.showMessageDialog(frame, "Hello and welcome to single player Family Feud! ");
			
			ImageIcon harvey = new ImageIcon(("harvey.jpg"));
			JOptionPane.showMessageDialog(frame, harvey);
			
			 name = JOptionPane.showInputDialog("Please enter your name:");	
			 
			 Object[] directions = {"Directions", "No Directions"};
				int noDirections  = JOptionPane.showOptionDialog(frame, name + ", would you like directions?",
						 name, JOptionPane.YES_NO_CANCEL_OPTION,
						JOptionPane.QUESTION_MESSAGE,
						null, directions, directions[1]);
				
				if (noDirections == 0)
					{
						
							directions();	
							question1();

					}
				else if (noDirections == 1)
					{
							question1();		
					}
			 
			
			
		}
		
		public static void directions()
		{
			
			JOptionPane.showMessageDialog(frame, "In single player Family Feud, you will be asked a question. "
					+ "\nYou must answer as quickly as you can. "
					+ "\nIf your answer was correct you get a point and continue to try to guess the other 3 answers. "
					+ "\nIf your answer is wrong at any point, you lose the points for that round."
					+ "\nWhen you get 100 points you win and the game ends. "
					+ "\nGood luck!");
		}
		public static void question1()
		{
			
			answer = JOptionPane.showInputDialog("Name a reason you might get rid of an old family heirloom");
			while (counter > 0)
				{
			if (answer.contains("broken"))
				{
					JOptionPane.showMessageDialog(frame,"Corect!");
					counter++;
				}
			else if (answer.contains("ugly")) 
				{
					JOptionPane.showMessageDialog(frame,"Corect!");
					counter++;
				}
			else if (answer.contains("divorce"))
				{
					JOptionPane.showMessageDialog(frame,"Corect!");
					counter++;
				}
			else if (answer.contains("sell/need money"))
				{
					JOptionPane.showMessageDialog(frame,"Corect!");
					counter++;
				}
			else
				{
					JOptionPane.showMessageDialog(frame,"Sorry that was not an answer. "
							+ "You don't get any points");
					
				}
				}
		}
		
		

	}
