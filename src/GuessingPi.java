/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import javax.swing.JOptionPane;

public class GuessingPi {
	// 1. Make a main method and make sure your program can run
	public static void main(String[] args) {
		
	
		// 2. Make a String variable to hold the value of Pi.
		//    Get the first few digits from http://www.piday.org/million/.
		String pi=  "3.14159265358979323846264338327950288419716939937510582097494459"
				+ "2307816406286208998628034825342117067982148086513282306647093844"
				+ "6095505822317253594081284811174502841027019385211055596446229489"
				+ "5493038196442881097566593344612847564823378678316527120190914564"
				+ "8566923460348610454326648213393607260249141273724587006606315588"
				+ "1748815209209628292540917153643678925903600113305305488204665213"
				+ "8414695194151160943305727036575959195309218611738193261179310511"
				+ "8548074462379962749567351885752724891227938183011949129833673362"
				+ "44065664308602139494";
		// 3. Print out the first 3 digits of Pi to the console.
		//    The first value is "pi.charAt(0)", the second is "pi.charAt(1)", etc.
		//    Run your program to see how this works.
		System.out.println(pi.charAt(0));
		System.out.println(pi.charAt(2));
		System.out.println(pi.charAt(3));
		// 9. If you want to give the \ more than one chance to guess,
		//    put a for loop around steps 4-8.

			// 4. Create a for loop that will step through each digit of pi (steps 5-8)
			//    NOTE: The number of digits in your string will be
			//       yourStringVariable.length()
			for (int i = 0; i < pi.length()-1; i++) {
			
			String guess1 = JOptionPane.showInputDialog("What is the next digit of pi");	
			int guess = Integer.parseInt(guess1);
			if (guess == ) {
				
			}
			}
				// 5. Ask the user for the NEXT digit of pi.

				// 6. Compare the user's input to the next digit of your pi variable 
				//    (look at step 3 for a clue).
				//    HINT: use charAt(0) to get 1st char of user input String 

					// 7. If they are correct, print out "correct".

					// 8. If they are not, print out "incorrect" and tell them
					//    to start over. Use 'break;' to break out of the loop.

}
}

