import java.util.Scanner;


public class Multiplication_EvenOdd {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int arrSize = scan.nextInt();
		int[] arr = new int[arrSize];
		int even=0, odd=0, mult=0;
		
		for(int i=0; i<arrSize; i++){
			arr[i] = scan.nextInt();
			
			if(arr[i]%2==0){
				even = even + arr[i];
			}
			else
				odd = odd + arr[i];			
		}
		
		mult = even * odd;
		System.out.println(mult);
		scan.close();
	}

}
