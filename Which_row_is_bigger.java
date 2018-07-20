import java.util.Scanner;


public class Which_row_is_bigger {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int row = scan.nextInt();
		int column = scan.nextInt();
		int[][] arr = new int[row][column];
		int[] sum = new int[row];
		int max=0, position=0;
		
		for(int i=0; i<row; i++){
			for(int j=0; j<column; j++){
				arr[i][j]=scan.nextInt();
			}
		}
		
		
		for(int i=0; i<row; i++){
			for(int j=0; j<column; j++){
				sum[i] += arr[i][j];
			}
			if(sum[i]>max){
				max = sum[i];
				position=i+1;
			}
		}
		
		System.out.println("Row "+position);		
		scan.close();

	}

}
