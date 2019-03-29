import java.util.Scanner;

public class Homework {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int days = 0;
		System.out.print("please input year:");
		int a = sc.nextInt();
		System.out.print("please input month:");
		int month = sc.nextInt();
		System.out.print("please input date:");
		int date = sc.nextInt();
	      /*if((month < 12 && month > 0)||date < 31 && date > 0) {
		//①//	if((a % 4 == 0 && a % 100 !=0) || (a % 400 == 0)){
				if(month == 1) {
					days = date;
				}else if(month == 2 ) {
					days = (month-1) * 31 +date;
				}else if(month == 3 ) {
					days = (month-2) * 31 +date + 29;
				}else if(month == 4 ) {
					days = (month-2) * 31 +date + 29;
				}else if(month == 5 ) {
					days = (month-3) * 31 +date + 29 + 30;
				}else if(month == 6 ) {
					days = (month-3) * 31 +date + 29 + 30 * 2;
				}else if(month == 7 ) {
					days = (month-4) * 31 +date + 29 + 30 * 2;
				}else if(month == 8 ) {
					days = (month-4) * 31 +date + 29 + 30 * 2;
				}else if(month == 9 ) {
					days = (month-4) * 31 +date + 29 + 30 * 2;
				}else if(month == 10 ) {
					days = (month-4) * 31 +date + 29 + 30 * 3;
				}else if(month == 11 ) {
					days = (month-5) * 31 +date + 29 + 30 * 3;
				}else{
					days = (month-6) * 31 +date + 29 + 30 * 4;
				}
				System.out.print("all days is " + days);
			}else {
				if(month == 1) {
					days = date;
				}else if(month == 2 ) {
					days = (month-1) * 31 +date;
				}else if(month == 3 ) {
					days = (month-2) * 31 +date + 28;
				}else if(month == 4 ) {
					days = (month-2) * 31 +date + 28;
				}else if(month == 5 ) {
					days = (month-3) * 31 +date + 28 + 30;
				}else if(month == 6 ) {
					days = (month-3) * 31 +date + 28 + 30 * 2;
				}else if(month == 7 ) {
					days = (month-4) * 31 +date + 28 + 30 * 2;
				}else if(month == 8 ) {
					days = (month-4) * 31 +date + 28 + 30 * 2;
				}else if(month == 9 ) {
					days = (month-4) * 31 +date + 28 + 30 * 2;
				}else if(month == 10 ) {
					days = (month-4) * 31 +date + 28 + 30 * 3;
				}else if(month == 11 ) {
					days = (month-5) * 31 +date + 28 + 30 * 3;
				}else {
					days = (month-6) * 31 +date + 28 + 30 * 4;
				}
				System.out.print("all days is " + days);
			}
		}else {
			System.out.print("it is a error day");
		}*/
		int b;
		int days =date;//days记录总天数，以当前月做初值
		if((a % 4 ==0 && a % 100 != 0)||a % 400 ==0) {
			b = 29;
			System.out.println("this is 闰年");
		}else {
			b = 28;
			System.out.println("this is 平年");
		}
		switch(month - 1) {
			case 11:
				days += 30;
			case 10:
				days += 31;
			case 9:
				days += 30;
			case 8:
				days += 31;
			case 7:
				days += 31;
			case 6:
				days += 30;
			case 5:
				days += 31;
			case 4:
				days += 30;
			case 3:
				days += 31;
			case 2:
				days += b;
			case 1:
				days += 31;
		}
		System.out.println("days is " + days);
	}
}
	
	
