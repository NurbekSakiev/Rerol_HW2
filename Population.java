import java.lang.*;
import java.util.*;

public class Population {

	public static void main(String[] args) {
		int firstPopul = 10;
		int secondPopul = 40;
		double incrRateOne = 0.25;
		double incrRateTwo = 0.12;
		int numYears = 1;
		double finalOne = firstPopul * Math.pow((1+incrRateOne),numYears);
		double finalTwo = secondPopul * Math.pow((1+incrRateTwo),numYears);

		while (finalTwo > finalOne) {
			numYears++;
			finalOne = firstPopul * Math.pow((1+incrRateOne),numYears);
			finalTwo = secondPopul * Math.pow((1+incrRateTwo),numYears);
			
		}
		
		System.out.print("After " + (numYears) + " years country A's population will bypass country B's population.");
	}

}