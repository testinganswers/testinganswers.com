import java.util.Scanner;


public class ExploringDataTypes {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		
		if(scan.hasNextInt()){
		    System.out.println("This input is of type Integer.");
		}
		else if(scan.hasNextFloat()){
		    System.out.println("This input is of type Float.");
		}
		else if(scan.hasNextLine()){
		    System.out.println("This input is of type string.");
		}
		else
		    System.out.println("This is something else.");
		scan.close();
	}

}
