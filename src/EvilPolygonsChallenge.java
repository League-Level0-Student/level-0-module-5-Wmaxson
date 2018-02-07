import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class EvilPolygonsChallenge {

	public static void main(String[] args) {
		//1. Create a robot
		Robot C3P0 = new Robot();
		//2. Set the speed to 100
		C3P0.setSpeed(100);
		int colorChoice=JOptionPane.showOptionDialog(null, "hello", "title", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new String[]{"Red","Green", "Blue"}, 0);
		
		//3. Set the pen color of the robot according to the value of the colorChoise variable
		if (colorChoice == 0) {
			C3P0.setPenColor(255,0,0);
		} else if (colorChoice == 1) {
		C3P0.setPenColor(0,255,0);
		} else if  (colorChoice == 2) {
			C3P0.setPenColor(0,0,255);
		} 
		//4. Ask the use how many polygons they want to be drawn.
		String num = JOptionPane.showInputDialog("How many polygons u want?");
		int numb = Integer.parseInt(num);
		int numbe = 100/numb
		int size =   
		//5. Use the robot to draw the number of polygons the user requested.
		C3P0.move();
		//6. Make it so your shapes do not overlap

		//7. Challenge: add more colors to the Option Dialog.
	}
	
}
