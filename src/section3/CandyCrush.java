package section3;

import javax.swing.JOptionPane;

public class CandyCrush {

	public static void main(String[] args) {
		// 1. Using a pop-up, ask the user who they don't like
		String hated= JOptionPane.showInputDialog(null, "Who do you hate");
	
		// 2. Change the next line so that the pop-up will tell them they have a crush on that person
		JOptionPane.showMessageDialog(null, "You totally have a crush on"+ hated);
		// 3. Ask the user for the name of their best friend
		String name= JOptionPane.showInputDialog(null, "Who is your best friend");
		
		// 4. Tell them their best friend is as sweet as candy
	
		JOptionPane.showMessageDialog(null, name +" is donald trump");
	} 
}



