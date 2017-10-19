import java.util.Scanner;
public class fourreveiewfour {
	public static void main(String[] args) {
		Scanner abx = new Scanner(System.in);
		System.out.println("How many times do I flip the coin? ");
		int times = abx.nextInt();
		int actual = 0;
		double random = 0;
		int heads = 0;
		int tails = 0;
		System.out.println("Here's the sequence of coin flips: ");
		while(actual < times) {
			random = Math.random();
			if(random<0.50) {
				System.out.print("H");
				heads++;
			}
			else {
				System.out.print("T");
				tails++;
			}
			actual++;
		}
		System.out.println("");
		System.out.println("There were "+heads + " heads and "+tails+ " tails.");
	}
}
