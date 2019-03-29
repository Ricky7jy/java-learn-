import java.util.Scanner;

public class hello {
	public static void main(String[] args) {
//		System.out.println("HELLO WORLD");
//		//获得系统输入流
//		Scanner sc = new Scanner(System.in);
//		String a1 = sc.next();
//		System.out.println(a1);
		
		int a1 = 100;
		int a2 = 200;
		int a3;
		
		a3 = a1;
		a1 = a2;
		a2 = a3;
		
	System.out.println(a1);
	System.out.println(a2);
	
	a2 = a3 + 100;
	System.out.println(a2);
	a2 = a1 * 5;
	System.out.println(a2);
	
	}
}