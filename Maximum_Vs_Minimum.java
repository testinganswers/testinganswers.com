import java.util.Scanner;


public class Maximum_Vs_Minimum {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int arrSize = scan.nextInt();
		int[] arr = new int[arrSize];
		
		
		for(int i=0; i<arrSize; i++){
			arr[i] = scan.nextInt();
		}
		
		int min=arr[0], max=arr[0], mult=0;
		
		for(int i=1; i<arrSize; i++){
				if(min>arr[i]){
					min = arr[i];
				}
				if(max<arr[i]){
					max = arr[i];
				}
		}
		
		mult = min * max;
		System.out.println(mult);
		scan.close();

	}

}
