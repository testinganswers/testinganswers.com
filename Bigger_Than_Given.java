import java.util.Scanner;


public class Bigger_Than_Given {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int arrSize = scan.nextInt();		
		int[] arr = new int[arrSize];
		
		for(int i=0; i<arrSize; i++){
			arr[i] = scan.nextInt();
		}
		
		int comVal = scan.nextInt();
		scan.close();
		int count=0;
		
		for(int i=0; i<arrSize; i++){
			if(arr[i]>comVal){
				count++;
			}
		}
		
		System.out.println(count);

	}

}
