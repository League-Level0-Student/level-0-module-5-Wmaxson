/*
 *    Copyright (c) The League of Amazing Programmers 201
 *    Level 0
 */

import javax.swing.JOptionPane;

public class GoofyNames {
	public static void main(String[] args) {
		String goofyName = "";
		String gooofyName = "";
		// 1. Ask the user to enter their name
		goofyName = JOptionPane.showInputDialog("Was ur name");
		// 2. Print upper case name to the console using .toUpperCase()
		//    Run your program to see that this works.
		goofyName = goofyName.toUpperCase(); 
		// 3. Loop through each character of the name (steps 4 - 6).
		//    HINT: Use .length() to determine the number of characters in the String.
		for (int i = 0; goofyName.length() < args.length; i++) {
			
		
			// 4. Create a String variable to store the next character of the name
			//    using .substring(start, end)
			//    HINT: replace 'start' and 'end' to get String with character at i 
			String letter = goofyName.substring(i ,i );
			// 5. Use MODULO to set this variable to upper case for EVEN characters
			//    and lower case for ODD characters.
			int letter1 = i % 2;
			if (letter1 == 0) {
				letter = letter.toUpperCase();
			}
			
			// 6. ADD this String  (containing 1 char) to the goofyName String
			gooofyName += letter;
		}
		// 7. Use pop-up to show user their Goofy name
		System.out.println(gooofyName);
	}
}

