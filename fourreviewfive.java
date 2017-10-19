import java.util.Scanner;
public class fourreviewfive {
	public static void main(String[] args) {
		Scanner abx = new Scanner(System.in);
		System.out.print("How many times would you like the dice to be tossed? ");
		int times = abx.nextInt();
		int die1 =0;
		int die2 = 0;
		int sumi =0;
		int two = 0;
		int three = 0;
		int four = 0;
		int five = 0;
		int six = 0;
		int seven = 0;
		int eight = 0;
		int nine = 0;
		int ten = 0;
		int eleven = 0;
		int twelve= 0;
		for(int i = 0;i<times;i++) {
			die1 = (int) ((Math.random()* 6)+1);
			die2 = (int) ((Math.random()* 6)+1);
			sumi = die1+die2;
			if (sumi == 2) two++;
			if (sumi == 3) three++;
			if (sumi == 4) four++;
			if (sumi == 5) five++;
			if (sumi == 6) six++;
			if (sumi == 7) seven++;
			if (sumi == 8) eight++;
			if (sumi == 9) nine++;
			if (sumi == 10) ten++;
			if (sumi == 11) eleven++;
			if (sumi == 12) twelve++;
			System.out.print(sumi +" ");
		}
		System.out.println("");
		System.out.print("2: ");
		for(int y = 0; y<two;y++) {System.out.print("*");}
		System.out.println("");
		System.out.print("3: ");
		for(int y = 0; y<three;y++) {System.out.print("*");}
		System.out.println("");
		System.out.print("4: ");
		for(int y = 0; y<four;y++) {System.out.print("*");}
		System.out.println("");
		System.out.print("5: ");
		for(int y = 0; y<five;y++) {System.out.print("*");}
		System.out.println("");
		System.out.print("6: ");
		for(int y = 0; y<six;y++) {System.out.print("*");}
		System.out.println("");
		System.out.print("7: ");
		for(int y = 0; y<seven;y++) {System.out.print("*");}
		System.out.println("");
		System.out.print("8: ");
		for(int y = 0; y<eight;y++) {System.out.print("*");}
		System.out.println("");
		System.out.print("9: ");;
		for(int y = 0; y<nine;y++) {System.out.print("*");}
		System.out.println("");
		System.out.print("10: ");
		for(int y = 0; y<ten;y++) {System.out.print("*");}
		System.out.println("");
		System.out.print("11: ");
		for(int y = 0; y<eleven;y++) {System.out.print("*");}
		System.out.println("");
		System.out.print("12: ");
		for(int y = 0; y<twelve;y++) {System.out.print("*");}
	}
}