import java.util.Scanner;


public class Find_Pairs {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		
		int arrLength = scan.nextInt();
		int[] arr = new int[arrLength];
		String status="False";
		
		for(int i=0; i<arrLength; i++){
			arr[i] = scan.nextInt();
		}
		
		int num = scan.nextInt();
		
		for(int i=0; i<arrLength; i++){
			for(int j=i+1; j<arrLength; j++){
				if(num==arr[i]+arr[j]){
					status="True";
					break;
				}
			}
		}
		System.out.println(status);
		scan.close();	
	}	

}
