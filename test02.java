import java.util.Scanner;

public class test02 {
	public static void main(String[] args) {
//		long cash = 100000000L;
//		int count = 0;
//		while(cash > 1) {
//			cash = cash / 2;
//			count = count + 1;
//		}
//		System.out.println(count);
//	
//		float start = 1.0f;
//		int i = 1;
//		while(i < 365) {
//			start =start * 1.01f;
//			i++;
//		}
//		System.out.println(start);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("calender:");
		int month = sc.nextInt();
		System.out.print("date:");
		int date = sc.nextInt();
		if((month * 100 + date >= 321 )&& (month * 100 + date <= 420)) {
			System.out.println("������");
		}else if((month * 100 + date >= 421 )&& (month * 100 + date <= 520)) {
			System.out.println("��ţ��");
		}else if((month * 100 + date >= 521 )&& (month * 100 + date <= 620)) {
			System.out.println("˫����");
		}else if((month * 100 + date >= 621 )&& (month * 100 + date <= 720)) {
			System.out.println("��з��");
		}else if((month * 100 + date >= 721 )&& (month * 100 + date <= 820)) {
			System.out.println("ʨ����");
		}else if((month * 100 + date >= 821 )&& (month * 100 + date <= 920)) {
			System.out.println("��Ů��");
		}else if((month * 100 + date >= 921 )&& (month * 100 + date <= 1020)) {
			System.out.println("�����");
		}else if((month * 100 + date >= 1021 )&& (month * 100 + date <= 1120)) {
			System.out.println("��Ы��");
		}else if((month * 100 + date >= 1121 )&& (month * 100 + date <= 1220)) {
			System.out.println("������");
		}else if((month * 100 + date >= 221 )&& (month * 100 + date <= 320)) {
			System.out.println("˫����");
		}else if((month * 100 + date >= 121 )&& (month * 100 + date <= 220)) {
			System.out.println("ˮƿ��");
		}else {
			System.out.println("Ħ����");
		}
		
		
		
		
		
		
	}
}
