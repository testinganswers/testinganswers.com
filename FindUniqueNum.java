
import java.util.ArrayList;

public class FindUniqueNum {
	
	public static void main(String[] args){
	
		int arr[] = {4,5,5,5,4,6,6,9,4,2,3,3,2,1,1,1};
		
		ArrayList<Integer> arl = new ArrayList<Integer>();
		
		for(int i=0;i<arr.length;i++){
			
			int count=1;
			
			if(!arl.contains(arr[i])){
				
				arl.add(arr[i]);
				
				for(int j=i+1;j<arr.length;j++){
					
					if(arr[i]==arr[j]){
						
						count++;					
					}

				}
				if(count==1){
					System.out.println(arr[i]+" is a unique number in Array.");
				}
				
			}
					
		}
	}
	
}
