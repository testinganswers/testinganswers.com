import java.util.Scanner;


public class SecondLargest {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int ArrLength = scan.nextInt();
		int[] Arr = new int[ArrLength];
		int first=0,second=0;
		
		for(int i=0;i<ArrLength;i++){			
			Arr[i]=scan.nextInt();
			
			if(Arr[i]>first){
				second=first;
				first=Arr[i];
			}
			else if (Arr[i] > second && Arr[i] != first){
	            second = Arr[i];
			}
			
		}
		System.out.println(second);
		scan.close();
		
	}

}
