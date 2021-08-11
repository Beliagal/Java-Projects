package personal;
import java.util.*;
import javax.swing.JOptionPane;

public class RandomD20 {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		String input = JOptionPane.showInputDialog("How many D20's you wanna roll?");
		int dices = Integer.parseInt(input);
		
		for (int roll=0 ; roll < dices; ++roll) {
			
			int value = random.nextInt(20);
			System.out.println ("Roll " + (roll+1) + ": " + (value+1));
		}

	}

}
