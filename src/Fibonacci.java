/* Homework
 * @date: 09-02-2014
 * @class: APCS-A-2014
 * @author: Rebecca Wong
 */
public class Fibonacci {
	public static void print1(){
		int a=1, b=1;
		System.out.print(a+",");
		System.out.print(b+",");
		a+=b;
		System.out.print(a+",");
		b+=a;
		System.out.print(b+",");
		a+=b;
		System.out.print(a+",");
		b+=a;
		System.out.print(b+",");
		a+=b;
		System.out.print(a+",");
		b+=a;
		System.out.print(b+",");
		a+=b;
		System.out.print(a+",");
		b+=a;
		System.out.print(b);
		System.out.println();
	}
	public static void print2(){
		int a=1, b=1;
		String fib10="";
		fib10=a+","+b;
		a+=b;
		b+=a;
		fib10=fib10+","+a+","+b;
		a+=b;
		b+=a;
		fib10=fib10+","+a+","+b;
		a+=b;
		b+=a;
		fib10=fib10+","+a+","+b;
		a+=b;
		b+=a;
		fib10=fib10+","+a+","+b;
		System.out.println(fib10);
	}
	public static void print3(){
		int a=1, b=1, count=1;
		System.out.println("F_"+count+": "+a);
		count++;
		System.out.println("F_"+count+": "+b);
		a+=b;
		count++;
		System.out.println("F_"+count+": "+a);
		b+=a;
		count++;
		System.out.println("F_"+count+": "+b);
		a+=b;
		count++;
		System.out.println("F_"+count+": "+a);
		b+=a;
		count++;
		System.out.println("F_"+count+": "+b);
		a+=b;
		count++;
		System.out.println("F_"+count+": "+a);
		b+=a;
		count++;
		System.out.println("F_"+count+": "+b);
		a+=b;
		count++;
		System.out.println("F_"+count+": "+a);
		b+=a;
		count++;
		System.out.println("F_"+count+": "+b);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print1();
		print2();
		print3();
	}

}
