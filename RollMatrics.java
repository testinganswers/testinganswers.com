import java.util.Scanner;


public class RollMatrics {

	public static void main(String[] args) {
		
Scanner scan = new Scanner(System.in);
		
		int rows=scan.nextInt();
		int columns=scan.nextInt();
		int[][] Arr1 = new int[rows][columns];
		
		for(int i=0;i<rows;i++){
			for(int j=0;j<columns;j++){
				Arr1[i][j] = scan.nextInt();
			}
		}
	
		if(rows!=columns){
			int swipe = rows;
			rows = columns;
			columns = swipe;
		}
		
		int[][] Arr2 = new int[rows][columns];
		
		for(int i=0;i<rows;i++){
			for(int j=0;j<columns;j++){
				Arr2[i][j]=Arr1[j][i];
				System.out.println("Arr2["+i+"]["+j+"] "+Arr2[i][j]);
			}
		}
		
		for(int[] row : Arr2) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
		
		scan.close();

	}

}
