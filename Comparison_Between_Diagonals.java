import java.util.Scanner;


public class Comparison_Between_Diagonals {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int row = scan.nextInt();
		int column = scan.nextInt();
		int[][] arr = new int[row][column];
		int diag1=0, diag2=0;
		int a = arr.length-1;
		
		for(int i=0; i<row; i++){
			for(int j=0; j<column; j++){
				arr[i][j]=scan.nextInt();
			}
		}
		
		for(int i=0; i<row; i++){
			for(int j=0; j<column; j++){
				if(i==j){
					diag1 = diag1 + arr[i][j];
				}
			}
		}
		
		for(int i=0; i<row; i++){
			diag2 = diag2 + arr[i][a];
			a--;
		}
		
		if(diag1>diag2){
			System.out.println("Diagonal 1");
		}
		else if(diag2>diag1){
			System.out.println("Diagonal 2");
		}
		else if(diag1==diag2){
			System.out.println("Equal");
		}
		
		scan.close();
	}

}
