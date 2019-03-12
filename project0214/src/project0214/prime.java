package project0214;

public class prime {

	public static void main(String[] args) {

		for (int pr = 2; pr < 1000; pr = pr + 1) {
			boolean flag = false;
			for (int i = 2; i <= pr / 2; i = i + 1) {
				if (pr % i == 0) {
					flag = true;
					break;
				}
			}
			if (flag == false) {
				System.out.printf("%d\n", pr);
			}
		}
	}

}
