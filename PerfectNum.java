import java.lang.*;
import java.util.*;

public class PerfectNum {

	public static void main(String[] args) {
		double perfectNum;
		int power = 2;

		perfectNum = Math.pow(2, power-1) * (Math.pow(2,power)-1);

		while(perfectNum < 1000) {
			power++;
			System.out.println("The perfect num is " + perfectNum);
			perfectNum = Math.pow(2, power-1) * (Math.pow(2,power)-1);
		
		}
	}

}