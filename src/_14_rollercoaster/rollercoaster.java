package _14_rollercoaster;

import javax.swing.JOptionPane;

public class rollercoaster { 
	public static void main(String[] args) {
String input=	JOptionPane.showInputDialog("how tall are you");
int height=Integer.parseInt(input);
	if(height>48) {
	JOptionPane.showMessageDialog(null, "enjoy the ride!!");
	}
	else {
		JOptionPane.showMessageDialog(null,"you are too short");
	}
	}

}
