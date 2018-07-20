import java.util.Scanner;


public class CountLetters {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		scan.close();
		int UpperCount=0,LowerCount=0;
		
		 for(int i=0;i<str.length();i++){
			 if(Character.isUpperCase(str.charAt(i))){
				 UpperCount++;
			 }
			 if(Character.isLowerCase(str.charAt(i))){
				 LowerCount++;
			 }
		 }
		 System.out.println(UpperCount);
		 System.out.println(LowerCount);	

	}

}
