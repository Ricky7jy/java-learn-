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
		if((a % 4 == 0 && a % 100 !=0) || (a % 400 == 0)){
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
			}else {
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
	}
	
	
	
}
