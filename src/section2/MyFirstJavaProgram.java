package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	Robot r2d2 = new Robot();
	r2d2.setSpeed((int) 200.1);
	r2d2.penDown();
	r2d2.setPenColor(Color.blue);
	r2d2.move(100);
	r2d2.turn(90);r2d2.move(100);
	r2d2.turn(90);r2d2.move(100);
	r2d2.turn(90);r2d2.move(100);
	r2d2.turn(90);	
	}
}
