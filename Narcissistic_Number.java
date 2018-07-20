import java.util.Scanner;


public class Narcissistic_Number {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		scan.close();
		int a=num;
		int b=0;
		int c= String.valueOf(num).length();
		
		while(a!=0){
			b=(int) (b+Math.pow(a%10,c));
			a=a/10;
		}
		
		if(b==num){
			System.out.println("Narcissistic Number");
		}
		else
			System.out.println("Not a Narcissistic Number");
	}

}
