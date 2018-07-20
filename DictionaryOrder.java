import java.util.Scanner;


public class DictionaryOrder {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int value = scan.nextInt()+1;
		String[] str = new String[value];
		String temp;
		
		for(int i=0; i<value; i++){
			str[i] = scan.nextLine();
		}
		
		for (int i = 0; i < value; i++) 
        {
            for (int j = i + 1; j < value; j++) 
            {
                if (str[i].compareTo(str[j])>0) 
                {
                    temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
		
		for (int i = 1; i < value; i++) 
        {
            System.out.print(str[i] + "\n");
        }
		
		scan.close();
	}

}
