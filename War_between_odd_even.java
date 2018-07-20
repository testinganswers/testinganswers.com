import java.util.Scanner;


public class War_between_odd_even {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int arrSize = scan.nextInt();
		int[] arr = new int[arrSize];
		int even=0, odd=0, subtract=0;
		
		for(int i=0; i<arrSize; i++){
			arr[i] = scan.nextInt();
			
			if(i%2==0){
				even = even + arr[i];
			}
			else
				odd = odd + arr[i];			
		}
		
		if(even>odd)
			subtract = even - odd;
		else
			subtract = odd - even;
		
		System.out.println(subtract);
		scan.close();

	}

}
