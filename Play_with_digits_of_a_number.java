import java.util.Scanner;


public class Play_with_digits_of_a_number {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);		
		long num = scan.nextLong();
		scan.close();
		int even=0, odd=0, rem=0, sub=0;
		
		while(num>0){
			
			rem=(int) num%10;
			
			if(rem%2==0){
				even = even + rem;
			}
			else {
				odd = odd + rem;
			}				
			
			num = num/10;
		}	
		
		if(even > odd){
			sub = even - odd;
		}
		else{
			sub = odd - even;
		}			
		
		System.out.println(sub);

	}

}
