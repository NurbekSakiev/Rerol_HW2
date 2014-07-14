import java.util.*;
import java.lang.*;

public class PrimeNum
{
		public static void main (String []args)
		{
			int number;
			Scanner scan = new Scanner(System.in);
			System.out.print("Until what number to print all prime numbers? ");
			
			number = scan.nextInt();
			primeList(number);
		}
		
		public static void primeList(int num) {
			int j,i = 0;
			
			for (i =1; i<num; i++) {
				int counter = 0;
				for (j=i;j>=1;j--) {
					if (i%j == 0) {
						counter++;
					}
				}
				if (counter == 2) {
					System.out.print(" " + i);
				}
			}
		}
}