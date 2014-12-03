/**
 * @author Rebecca Wong
 * 
 */
import java.util.*;
import java.io.*;

public class lab4_3 {

	public static void main(String[] args) throws FileNotFoundException{
		// TODO Auto-generated method stub
		Scanner input=new Scanner (System.in);
//		PrintStream output=new PrintStream (new File ("xxx-out.txt"));
		while(input.hasNext()){
			int[] a1=new int[input.nextInt()];
			for(int i=0;i<a1.length;i++){
				a1[i]=input.nextInt();
			}
			if (a1.length%2==0){
				int[] a2=new int[a1.length/2];
				collapse(a1,a2);
				System.out.println(Arrays.toString(a1)+" "+Arrays.toString(a2));
			}
			else{
				int[] a2=new int[a1.length/2+1];
				a2[a2.length-1]=a1[a1.length-1];    
				collapse(a1,a2);
				System.out.println(Arrays.toString(a1)+" "+Arrays.toString(a2));
			}
		}
		input.close();
//		output.close();
	}
	public static void collapse(int[] a1, int[] a2){
		for(int i=0;i<a2.length;i++){
			if(a2[i]==0){
				for(int j=0;j<a1.length-1;i+=2){
				a2[i]=a1[j]+a1[j+1];
				
				}
			}
		}
	}
}
