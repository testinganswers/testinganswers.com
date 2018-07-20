import java.util.Scanner;


public class PrimeNum {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int start = scan.nextInt();
		int end = scan.nextInt();
		int count = 0;
		int primeNum=0;
		
		if(start<=2){
			start=3;
		}
						
		for(int i=start;i<=end;i++){
			count=0;
			for(int j=2;j<i;j++){
				if(i%j==0){
					count++;
					break;
				}
			}
			if(count == 0)
            {
                System.out.print(i + " ");
                primeNum++;
            }
			
		}
		System.out.println("count: "+primeNum);
		scan.close();

	}

}
