import java.util.Scanner;


public class Biggest_Digit_In_A_Number {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);		
		int num = scan.nextInt();
		scan.close();
		int max=num%10;
		int rem=num/10;
		
		while(rem>0){
			if(max<rem%10){
				max=rem%10;
			}
			rem=rem/10;
		}
		System.out.println(max);

	}

}
