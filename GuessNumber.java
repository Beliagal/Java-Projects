import java.util.*;
public class GuessNumber {

	public static void main(String[] args) {
		
		int random = (int)(Math.random()*100);
		
		Scanner input = new Scanner(System.in);
		
		int number = 0;
		int attemps = 0;
		
		do {
			attemps ++;
			System.out.println ("Enter a number.");
			
			number = input.nextInt();
			if (random < number) {
				System.out.println ("Your number is higher than mine.");
								
			}
			else if (random > number) {
				System.out.println ("Your number is lower than mine.");
			}
						
		}
		while (number != random);
		System.out.println("That's right! You got it in " + attemps + " attemps.");
		input.close();
	}

}
