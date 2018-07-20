import java.util.Scanner;


public class Play_With_Average {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arrSize = scan.nextInt();
		int[] arr = new int[arrSize];
		int even=0, evencount=0, odd=0,oddcount=0, add=0;
		
		for(int i=0; i<arrSize; i++){
			arr[i] = scan.nextInt();
			
			if(arr[i]%2==0){
				even = even + arr[i];
				evencount++;
			}
			else{
				odd = odd + arr[i];
				oddcount++;
			}
		}
		
		if(even==0 && odd>0){
			add = Math.round(odd/oddcount);
		}
		else if(odd==0 && even>0){
			add = Math.round(even/evencount);
		}
		else if(even>0 && odd>0){
			add = Math.round(even/evencount) + Math.round(odd/oddcount);
		}
			
			System.out.println(add);
			scan.close();

	}

}
