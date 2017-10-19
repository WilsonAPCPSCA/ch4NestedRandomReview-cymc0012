//Marshal Chen Period 1
import java.util.Scanner;
public class fourreviewthree {
	public static void main(String[] args) {
		Scanner fequalma = new Scanner(System.in);
			System.out.print("Enter a side length: ");
			int sidelength = fequalma.nextInt();
			 int maxwidth = sidelength * 2 - 1; 
			 int halfwidth = maxwidth / 2;
			 int num = 1;
			for (int i = 0; i < sidelength; i++) { 
			     for (int j = 0; j < halfwidth; j++) { 
			  System.out.print(" "); 
			     } 
			     for (int j = 0; j < num; j++) { 
			  System.out.print("*"); 
			     } 
			     System.out.println(); 
			     num += 2; 
			     halfwidth -= 1; 
			 } 
			 num = maxwidth - 2; 
			 halfwidth = 1; 
			 for (int i = 0; i < sidelength; i++) { 
			     for (int j = 0; j < halfwidth; j++) { 
			  System.out.print(" "); 
			     } 
			     for (int j = 0; j < num; j++) { 
			  System.out.print("*"); 
			     } 
			     System.out.println(); 
			     num -= 2; 
			     halfwidth += 1; 
			 }
	}
}
