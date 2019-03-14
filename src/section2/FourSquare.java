package section2;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	Robot r2d2 = new Robot();

	void go() { 
		r2d2.setSpeed(1000);
		r2d2.setPenWidth(5);

	
		

			// 7. Set the pen color to random
	
			// 1. Call the drawSquare() method
		drawsquare()
	
			// 8. Turn the robot 90 degrees to the right

	}

	
	void drawSquare() {
		JOptionPane.showMessageDialog(null, "yay! you called the drawSquare() method!");
		/* 3. Fill in the code to draw a square inside the method below. */
		
		for(int i = 0 ; i < 4; i++ ) {
			r2d2.move(200);
			r2d2.turn(90); 
			}
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}



