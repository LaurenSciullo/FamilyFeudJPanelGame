import java.awt.print.Book;
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
		 
		 static ImageIcon winning = new ImageIcon(("winningGif.gif"));
		 static ImageIcon losing = new ImageIcon(("losingGif.gif"));
		
		public static void famFuedWelcome()
		{
			
			ImageIcon harvey = new ImageIcon(("harvey.jpg"));
			JOptionPane.showMessageDialog(frame, "Hello and welcome to single player Family Feud! ", null, 0, harvey);
			
			
			
			 name = JOptionPane.showInputDialog("Please enter your name:");	
			 
			 final String[] directions = {"Directions", "No Directions"};
				String  noDirections  = (String) JOptionPane.showInputDialog(frame, name + ", would you like directions?",
						 name, 
						JOptionPane.QUESTION_MESSAGE,
						null, directions, directions[0]);
				
				if (noDirections == directions[0])
					{
						
							directions();	
							question1();	
							question2();
							question3();
							question4();
							question5();
							question6();
					
							
							

					}
				else if (noDirections == directions[1])
					{
							question1();	
							question2();
							question3();
							question4();
							question5();
							question6();
							
							
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
					+ "\nTry to get as many points as possible."
					+ "\nType your answer in all lowercase letters except for names, capitalize the first letter of names. "
					+ "\nGood luck!");
		}
		public static void question1()
		{
			
			answer = JOptionPane.showInputDialog("Name a reason you might get rid of an old family heirloom.");
			
				
			if (answer.contains("broken"))
				{
					JOptionPane.showMessageDialog(frame,"Correct! Top answer.", null, 0, winning);
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
							+ "\nTop answer was: broken ", null, 0, losing);
				}
			
				JOptionPane.showMessageDialog(frame,  "Total points: " + counter);
		}
		
		public static void question2()
		{
			
			answer = JOptionPane.showInputDialog("Tell me something many people do just once a week.");
			
			if (answer.contains("church"))
				{
					JOptionPane.showMessageDialog(frame,"Correct! Top answer.", null, 0, winning);
					counter += 4;
				}
			else if (answer.contains("groceries") || answer.contains("shopping")) 
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
							+ "\nTop answer was: church", null, 0, losing);
					
				}
				
			JOptionPane.showMessageDialog(frame,  "Total points: " + counter);
		}
		
		public static void question3()
		{
			
			answer = JOptionPane.showInputDialog("Who was the most popular character on the sitcom Friends? \nCapitalize name.");
			
			if (answer.contains("Rachel"))
				{
					JOptionPane.showMessageDialog(frame,"Correct! Top answer.", null, 0, winning);
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
							+ "\nTop answer was: Rachel", null, 0, losing);
					
				}
				
			JOptionPane.showMessageDialog(frame,  "Total points: " + counter);
		}
		
		public static void question4()
		{
			
			answer = JOptionPane.showInputDialog("Name a liquid in your kitchen that you hope "
					+ "no one ever accidentally drinks");
			
			if (answer.contains("soap") || answer.contains("bleach"))
				{
					JOptionPane.showMessageDialog(frame,"Correct! Top answer.", null, 0, winning);
					counter+=4;
				}
			else if (answer.contains("vinegar")) 
				{
					JOptionPane.showMessageDialog(frame,"Correct!"
							+ "\nTop answer was: soap or bleach");
					counter+=3;
				}
			else if (answer.contains("cooking oil"))
				{
					JOptionPane.showMessageDialog(frame,"Correct!"
							+ "\nTop answer was: soap or bleach");
					counter+=2;
				}
			else if (answer.contains("bacon grease"))
				{
					JOptionPane.showMessageDialog(frame,"Correct!"
							+ "\nTop answer was: soap or bleach");
					counter++;
				}
			else
				{
					JOptionPane.showMessageDialog(frame,"Sorry that was not an answer. "
							+ "\nTop answer was: soap or bleach", null, 0, losing);
					
				}
			JOptionPane.showMessageDialog(frame,  "Total points: " + counter);
				
		}
		
		public static void question5()
			{
				
				answer = JOptionPane.showInputDialog("Name a famous wizard. \nCapitalize name.");
				
				if (answer.contains("Harry Potter"))
					{
						JOptionPane.showMessageDialog(frame,"Correct! Top answer.", null, 0, winning);
						counter+=4;
					}
				else if (answer.contains("Merlin")) 
					{
						JOptionPane.showMessageDialog(frame,"Correct!"
								+ "\nTop answer was: Harry Potter");
						counter+=3;
					}
				else if (answer.contains("Gandalf"))
					{
						JOptionPane.showMessageDialog(frame,"Correct!"
								+ "\nTop answer was: Harry Potter");
						counter+=2;
					}
				else if (answer.contains("The Wizard of Oz") || answer.contains("Dr. Strange") )
					{
						JOptionPane.showMessageDialog(frame,"Correct!"
								+ "\nTop answer was: Harry Potter");
						counter++;
					}
				else
					{
						JOptionPane.showMessageDialog(frame,"Sorry that was not an answer. "
								+ "\nTop answer was: Harry Potter", null, 0, losing);
						
					}
				JOptionPane.showMessageDialog(frame,  "Total points: " + counter);
					
			}
		
		public static void question6()
			{
				
				answer = JOptionPane.showInputDialog("Name another word for book.");
				
				if (answer.contains("novel"))
					{
						JOptionPane.showMessageDialog(frame,"Correct! Top answer.", null, 0, winning);
						counter+=4;
					}
				else if (answer.contains("story")) 
					{
						JOptionPane.showMessageDialog(frame,"Correct!"
								+ "\nTop answer was: novel");
						counter+=3;
					}
				else if (answer.contains("paperback"))
					{
						JOptionPane.showMessageDialog(frame,"Correct!"
								+ "\nTop answer was: novel");
						counter+=2;
					}
				else if (answer.contains("volume") )
					{
						JOptionPane.showMessageDialog(frame,"Correct!"
								+ "\nTop answer was: novel");
						counter++;
					}
				else
					{
						JOptionPane.showMessageDialog(frame,"Sorry that was not an answer. "
								+ "\nTop answer was: novel", null, 0, losing);
						
					}
				JOptionPane.showMessageDialog(frame,  "Total points: " + counter);
					
			}
		
		

	}
