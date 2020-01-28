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
			
			ImageIcon harvey = new ImageIcon(("harvey.jpg"));
			JOptionPane.showMessageDialog(frame, "Hello and welcome to single player Family Feud! ", null, 0, harvey);
			
			
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
							question2();
							question3();
							question4();
							
							

					}
				else if (noDirections == 1)
					{
							question1();	
							question2();
							question3();
							question4();
							
							
					}
			 
				ImageIcon endGame = new ImageIcon(("famFeudWin.jpg"));
			
				JOptionPane.showMessageDialog(frame, "Thanks for playing!", null, 0, endGame);
			
		}
		
		public static void directions()
		{
			
			JOptionPane.showMessageDialog(frame, "In single player Family Feud, you will be asked a question."
					+ "\nThis is representative of a Family Feud Speed Round where you only answer once. "
					+ "\nIf your answer was correct you get a point. "
					+ "\nThe more popular your answer was in the survey the more points you get. "
					+ "\nIf your answer is wrong, you do not get any points. "
					+ "\nTry to get as many points as possible. "
					+ "\nGood luck!");
		}
		public static void question1()
		{
			
			answer = JOptionPane.showInputDialog("Name a reason you might get rid of an old family heirloom.");
			
				
			if (answer.contains("broken"))
				{
					JOptionPane.showMessageDialog(frame,"Correct! Top answer.");
					counter += 4;
				}
			else if (answer.contains("ugly")) 
				{
					JOptionPane.showMessageDialog(frame,"Correct!"
							+ "\nTop answer was: broken");
					counter += 3;
				}
			else if (answer.contains("too much stuff"))
				{
					JOptionPane.showMessageDialog(frame,"Correct!"
							+ "\nTop answer was: broken");
					counter += 2;
				}
			else if (answer.contains("sell/need money"))
				{
					JOptionPane.showMessageDialog(frame,"Correct!"
							+ "\nTop answer was: broken");
					counter++;
				}
			else
				{
					JOptionPane.showMessageDialog(frame,"Sorry that was not an answer."
							+ "\nTop answer was: broken ");
				}
			
				JOptionPane.showMessageDialog(frame,  "Total points: " + counter);
		}
		
		public static void question2()
		{
			
			answer = JOptionPane.showInputDialog("Tell me something many people do just once a week.");
			
			if (answer.contains("church"))
				{
					JOptionPane.showMessageDialog(frame,"Correct! Top answer.");
					counter += 4;
				}
			else if (answer.contains("groceries/shopping")) 
				{
					JOptionPane.showMessageDialog(frame,"Correct!"
							+ "\nTop answer was: church");
					counter += 3;
				}
			else if (answer.contains("laundry"))
				{
					JOptionPane.showMessageDialog(frame,"Correct!"
							+ "\nTop answer was: church");
					counter += 2;
				}
			else if (answer.contains("clean"))
				{
					JOptionPane.showMessageDialog(frame,"Correct!"
							+ "\nTop answer was: church");
					counter++;
				}
			else
				{
					JOptionPane.showMessageDialog(frame,"Sorry that was not an answer. "
							+ "\nTop answer was: church");
					
				}
				
			JOptionPane.showMessageDialog(frame,  "Total points: " + counter);
		}
		
		public static void question3()
		{
			
			answer = JOptionPane.showInputDialog("Who was the most popular character on the sitcom Friends?");
			
			if (answer.contains("Rachel"))
				{
					JOptionPane.showMessageDialog(frame,"Correct! Top answer.");
					counter += 4;
				}
			else if (answer.contains("Joey")) 
				{
					JOptionPane.showMessageDialog(frame,"Correct!"
							+ "\nTop answer was: Rachel");
					counter += 3;
				}
			else if (answer.contains("Ross"))
				{
					JOptionPane.showMessageDialog(frame,"Correct!"
							+ "\nTop answer was: Rachel");
					counter+=2;
				}
			else if (answer.contains("Chandler"))
				{
					JOptionPane.showMessageDialog(frame,"Correct!"
							+ "\nTop answer was: Rachel");
					counter++;
				}
			else
				{
					JOptionPane.showMessageDialog(frame,"Sorry that was not an answer. "
							+ "\nTop answer was: Rachel");
					
				}
				
			JOptionPane.showMessageDialog(frame,  "Total points: " + counter);
		}
		
		public static void question4()
		{
			
			answer = JOptionPane.showInputDialog("Name a liquid in your kitchen that you hope "
					+ "no one ever accidentally drinks");
			
			if (answer.contains("soap"))
				{
					JOptionPane.showMessageDialog(frame,"Correct! Top answer.");
					counter+=4;
				}
			else if (answer.contains("vinegar")) 
				{
					JOptionPane.showMessageDialog(frame,"Correct!"
							+ "\nTop answer was: soap");
					counter+=3;
				}
			else if (answer.contains("cooking oil"))
				{
					JOptionPane.showMessageDialog(frame,"Correct!"
							+ "\nTop answer was: soap");
					counter+=2;
				}
			else if (answer.contains("bacon grease"))
				{
					JOptionPane.showMessageDialog(frame,"Correct!"
							+ "\nTop answer was: soap");
					counter++;
				}
			else
				{
					JOptionPane.showMessageDialog(frame,"Sorry that was not an answer. "
							+ "\nTop answer was: soap");
					
				}
			JOptionPane.showMessageDialog(frame,  "Total points: " + counter);
				
		}
		

	}
