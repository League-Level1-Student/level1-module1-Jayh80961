package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {
	public static void main(String[] args) {
	String flavor = JOptionPane.showInputDialog("What popcorn flavor do you want?");
	Popcorn popcorn = new Popcorn(flavor);
	Microwave microwave = new Microwave();
	microwave.putInMicrowave(popcorn);
	String time = JOptionPane.showInputDialog("How many minutes do you want the popcorns to be cooked?");
	int time2 = Integer.parseInt(time);
	microwave.setTime(time2);
	microwave.startMicrowave();
	popcorn.applyHeat();
	popcorn.eat();
	
	
	
	
	}
}



