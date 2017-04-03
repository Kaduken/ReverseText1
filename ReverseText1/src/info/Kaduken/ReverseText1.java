package info.Kaduken;

import javax.swing.JOptionPane;

/* Taking input from a JOptionPane object, 
 * Doing a string reversal algorithm, 
 * and returning the reversed string
 */

public class ReverseText1 {
	
	static String test = "";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test = takeInput("Enter text to be reversed: ");
		reverseTest(test);
		printTest("Here's the reversed text: " + test);

	}
	
	private static String takeInput(String s){
		test = JOptionPane.showInputDialog(s);
		return test; 
	}
	
	private static void reverseTest(String s){
		String newTest = "";
		for (int i = s.length() - 1; i >= 0; i--){
			newTest += s.charAt(i);
		}
		test = newTest; 
	}
	
	private static void printTest(String s){
		JOptionPane.showMessageDialog(null,s, "Result", JOptionPane.INFORMATION_MESSAGE);
	}
	

	
	
}
