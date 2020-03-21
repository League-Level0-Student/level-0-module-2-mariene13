package _15_voting_booth;

import javax.swing.JOptionPane;

public class vottingboth {
	public static void main(String[] args) {
	String input=JOptionPane.showInputDialog("how old are you");
	
	int year=Integer.parseInt(input);
		if(year>18) {
			JOptionPane.showMessageDialog(null, "who will be the next president?");
		}
		else{
			JOptionPane.showMessageDialog(null, "nobody cares what you think");
		}
	}
}
