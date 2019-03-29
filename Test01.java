
public class Test01 {
	public static void main(String[] args) {
		int salary = 1000000;
		int i = 5;
		while (i > 0) {
			salary = salary / 2;
			i = i - 1;
		}
		System.out.println(salary);
	}
}
