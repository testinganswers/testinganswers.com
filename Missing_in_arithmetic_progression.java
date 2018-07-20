import java.util.Scanner;


public class Missing_in_arithmetic_progression {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int arrSize = scan.nextInt();		
		int[] arr = new int[arrSize];
		
		for(int i=0; i<arrSize; i++){
			arr[i] = scan.nextInt();
		}
		
		int diff = (arr[arrSize-1]-arr[0])/arrSize;
		
		
		
		scan.close();

	}

}
 
