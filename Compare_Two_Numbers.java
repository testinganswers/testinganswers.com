import java.util.Scanner;


public class Compare_Two_Numbers {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);		
		long num1 = scan.nextLong();
		long num2 = scan.nextLong();
		scan.close();
		int sum1=0, sum2=0;
		long Onum1 = num1, Tnum2 = num2;
		
		while(num1>0){			
			sum1 = sum1 + (int) (num1%10);			
			num1 = num1/10;
		}	
		
		while(num2>0){			
			sum2 = sum2 + (int) (num2%10);			
			num2 = num2/10;
		}
		
		if(sum1>sum2){
			System.out.println(Onum1);
		}
		else if(sum2>sum1){
			System.out.println(Tnum2);
		}
		else if(sum1==sum2){
			System.out.println("Equal");
		}
		

	}

}
