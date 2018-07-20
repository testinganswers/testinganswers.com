import java.util.Scanner;

public class MinEffort_MaxOutput {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int arrSize = scan.nextInt();
		int arr[] = new int[arrSize];
		
		for(int i=0; i<arrSize; i++){
			arr[i] = scan.nextInt();
		}
		
		int s = 0, e = arrSize-1;
				
		for (s = 0; s < arrSize-1; s++)
	      {
	        if (arr[s] > arr[s+1])
	          break;
	      }
	     
	      
	      for(e = arrSize - 1; e > 0; e--)
	      {
	        if(arr[e] < arr[e-1])
	          break;
	      }
	      
	      
	      for(int i = s; i <= e+1; i++)
	      {
	        System.out.print(arr[i]+" ");
	      }
	      
	    scan.close();

	}

}
