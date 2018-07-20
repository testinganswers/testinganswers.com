import java.util.Scanner;


public class calculate_power_using_recursion {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int power = scan.nextInt();
		int result=1;
		if(power==0){
			System.out.println("1");
		}
		else
			calcPower(num, power, result);
		
		scan.close();

	}
	
	static void calcPower(int n, int p, int r){
		if(p>0){
			r = r*n;
			p--;
			if(p==0){
			System.out.println(r);
			}
			calcPower(n,p,r);
		}
		
			
	}

}
