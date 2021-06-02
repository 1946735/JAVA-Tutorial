package Operator;

public class PresPostDemo {

	public static void main(String[] args) {

		int i = 3;
		i++;
		System.out.println(i); // 4출력
		++i;
		System.out.println(i); // 5출력
		System.out.println(++i); // 6
		System.out.println(i++); // 6 - 괄호 안에서는 값이 더해지지 않는다. 괄호 밖에서 더해진다.
		System.out.println(i); // 7

	}

}
