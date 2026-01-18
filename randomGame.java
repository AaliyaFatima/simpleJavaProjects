package practice_Java;
import java.util.*;
public class randomGame {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			int num=(int) (Math.random() * 10 + 1);
			
			// Terminate when the random number is 5
			
			if(num == 5) {
				break;
			}
			
			// Skip all the multiples of 4
			
			else if(num % 4 == 0) {
				continue;
			}
			System.out.print(num + " ");
		}
	}
}
