import java.io.*;
public class CandidateCode {
   public static void main(String args[] ) throws Exception {

	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String line1=br.readLine();
	String[] l=line1.split(" ");
	int row=Integer.parseInt(l[0]);
	int col=Integer.parseInt(l[1]);
	int[][] arr=new int[row][col];
	for(int i=0;i<row;i++)
	{
	    line1=br.readLine();
	    l=line1.split(" ");
	    
	    for(int j=0;j<col;j++)
	    {
	        arr[i][j]=Integer.parseInt(l[j]);
	    }
	}
	
	int diag1=0;
	int diag2=0;
	int x=0;
	for(int i=0;i<row;i++)
	{
	    diag1=diag1+arr[i][x];
	    x++;
	    System.out.println("diag1: "+diag1);
	}
	x=arr.length-1;
	for(int i=0;i<row;i++)
	{
	    diag2=diag2+arr[i][x];
	    x--;
	    System.out.println("diag2: "+diag2);
	}
	
	
	if(diag1>diag2)
	System.out.println("Diagonal 1");
	
	else if(diag1<diag2)
	System.out.println("Diagonal 2");
	
	else
	System.out.println("Equal");
	
   }
}