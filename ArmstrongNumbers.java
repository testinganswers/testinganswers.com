import java.util.Scanner;


public class ArmstrongNumbers {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		scan.close();
		int a=num;
		int b=0;

		while(a!=0){
			b=(int) (b+Math.pow(a%10,3));
			a=a/10;
		}
		
		if(b==num){
			System.out.println("Armstrong Numbers");
		}
		else
			System.out.println("Not a Armstrong Numbers");
		
	}

}
