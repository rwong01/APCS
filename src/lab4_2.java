/**
 * @author Rebecca Wong
 * 
 */
import java.util.*;
import java.io.*;

public class lab4_2 {

	public static void main(String[] args) throws FileNotFoundException{
		// TODO Auto-generated method stub
		Scanner input=new Scanner (System.in);
//		PrintStream output=new PrintStream (new File ("xxx-out.txt"));
		while(input.hasNext()){
			int[] a1=new int[input.nextInt()];
			for(int i=0;i<a1.length;i++){
				a1[i]=input.nextInt();
			}
			System.out.println(Arrays.toString(a1)+" "+isUnique(a1));
		}
		input.close();
//		output.close();
	}
	public static boolean isUnique(int[] a1){
		for(int i=0;i<a1.length;i++){
			for(int j=i+1;j<a1.length;j++){
				if(a1[i]==a1[j])
					return false;
			}
		}
		return true;
	}
}
