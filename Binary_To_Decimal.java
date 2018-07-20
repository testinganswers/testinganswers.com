import java.util.Scanner;


public class Binary_To_Decimal {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);		
		String binary = scan.nextLine();
		scan.close();
		int i=binary.length();
		int decimal=0, power=0;
		
		while(i>0){
			--i;
			char binaryCharAt = binary.charAt(i);			
			decimal = (int) (decimal + (Character.getNumericValue(binaryCharAt) * Math.pow(2, power)));			
			power++;			
		}
		System.out.println(decimal);

	}

}
