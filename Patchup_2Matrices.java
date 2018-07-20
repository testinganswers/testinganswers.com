import java.util.Scanner;


public class Patchup_2Matrices {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int HI1=scan.nextInt();
		int VI1=scan.nextInt();
		int[][] Arr1 = new int[HI1][VI1];
		
		for(int i=0;i<HI1;i++){
			for(int j=0;j<VI1;j++){
				Arr1[i][j] = scan.nextInt();
			}
		}
		
		int HI2=scan.nextInt();
		int VI2=scan.nextInt();
		int[][] Arr2 = new int[HI1][VI1];
		
		for(int i=0;i<HI2;i++){
			for(int j=0;j<VI2;j++){
				Arr2[i][j] = scan.nextInt();
			}
		}
		
		int[][] result = new int[Arr1.length][Arr1[0].length];
		
		for(int i=0;i<Arr1.length;i++){			
			for(int j=0;j<Arr1[0].length;j++){
				 result[i][j] = Arr1[i][j] + Arr2[i][j];
				System.out.print(result[i][j]+ " ");
			}
			 System.out.println();
		}
		
	/*	for(int[] row : result) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        } */
		
		scan.close();

	}

}
