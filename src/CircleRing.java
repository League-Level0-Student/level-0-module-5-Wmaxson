import org.jointheleague.graphical.robot.Robot;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */



public class CircleRing {
    public static void main(String[] args) throws Exception {

        // 1. Make a new Robot
    	Robot C3PO = new Robot();
    	
       //  2. Set your robot’s position to x=150 and y=200
    	C3PO.setX(150);
    	C3PO.setY(200);
        // 3. Put the robot's pen down
    	C3PO.penDown();
        // 4. Set the robot’s speed to 10
    	C3PO.setSpeed(100);
        // 5. Do everything below here 360 times (use i as the counter)
    	for (int i = 0; i < 360; i++) {
			
		
	        // 6. Move the robot 3 pixels
    		C3PO.move(3);
    		C3PO.turn(1);
    		if (i % 20 == 0) {
    			for (int x = 0; x < 360; x++) {
				C3PO.move(1);
				C3PO.turn(1);
    			}
			}
    		System.out.println(i);
       //  7. Turn the robot 1 degree
    	
        // 8. If the counter i is divisible by 20 (hint: use mod operator  %)


        // 9. Do steps 10 thru 12, 360 times (use j as the counter)

		        // 10. Move the robot 1 pixel

		        // 11. Turn the robot 1 degree
    	}
}
}
