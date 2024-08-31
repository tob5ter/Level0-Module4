package _01_double._1_change_calculator;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */

public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
		 String nickelString = JOptionPane.showInputDialog("How Many Nickels do You Have?");

		// Convert their answer to an int.   Hint: Integer.parseInt()  
		int nickelInt = Integer.parseInt(nickelString);


		// Ask the user how many dimes they have, and convert their answer
		String dimeString = JOptionPane.showInputDialog("How Many Dimes do You Have?");
		int dimeInt = Integer.parseInt(dimeString);

		// Ask the user how many quarters they have, and convert their answer
		String quarterString = JOptionPane.showInputDialog("How Many Quarters do You Have?");
		int quarterInt = Integer.parseInt(quarterString);
		// Calculate how much money the user has.  Hint: Use a double variable 
		double money = nickelInt*.05+dimeInt*.1+quarterInt*.25;
		JOptionPane.showMessageDialog(null,"You have $" +(String.format("%.2f",money)));

		// Tell the user how much money they have in dollars and cents format (e.g. $6.75)

	}
}

