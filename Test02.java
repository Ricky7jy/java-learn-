
public class Test02 {
	public static void main(String[] args) {
		float i = 1.0f;
		int week = 52;
		while (week >= 0) {
			i = i * 1.01f;
			week = week -1;
		}
		System.out.println(i);
		
		
		
		
		float salary = 100000;
		int year = 1;
		while(year <= 5) {
			salary = salary * 1.67f;
			year =year + 1;
		}
		System.out.print(salary);
	}
}
