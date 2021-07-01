import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Random random =new Random();
		Scanner scanner=new Scanner(System.in);
		int number=random.nextInt(100);
		int hp=10, guessNumber=1, guess=0;
		
		while(hp>0) {
			System.out.print("Guess "+guessNumber+": ");
			guess=scanner.nextInt();
			guessNumber++;
			
			if(guess==number) {
				System.out.println("Your guess is right! The number was "+number+".");
				break;
			} else if(number>guess) {
				System.out.println("Your guess is smaller than the number, try again!");
				hp--;
			} else if(number<guess) {
				System.out.println("Your guess is bigger than the number, try again!");
				hp--;
			}
			
			if(hp==0) {
				System.out.println("You lost! The number was "+number+".");
			}
		}
	}

}
