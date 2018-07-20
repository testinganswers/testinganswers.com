import java.util.Scanner;


public class consecutiveNumber {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int arrSize = scan.nextInt();
		int[] arr = new int[arrSize];
		String status ="False";
		
		for(int i=0; i<arrSize; i++){
			arr[i] = scan.nextInt();
		}
		
		scan.close();
		int min=arr[0], max=arr[0];
		
		for(int i=1; i<arrSize; i++){
				if(min>arr[i]){
					min = arr[i];
				}
				if(max<arr[i]){
					max = arr[i];
				}
		}
		
		if (max - min + 1 == arrSize) 
        {
            
            boolean visited[] = new boolean[arrSize];
            int i;
            for (i = 0; i < arrSize; i++) 
            {
                if (visited[arr[i] - min] != false){
                	status="False";
                }
                else
                	visited[arr[i] - min] = true;
                	
            }
            status="True";
           
        }
		System.out.println(status);

	}

}
