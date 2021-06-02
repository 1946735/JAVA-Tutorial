package Operator;

public class OperatorArithmetic {

	public static void main(String[] args) {
		// + 더하기
		// - 빼기
		// * 곱하기
		// / 나누기
		// % 나머지
		int result = 1 + 2;
		System.out.println(result);// result의 값은 3
		result = result-1;
		System.out.println(result);// result의 값은 2
		result = result*2;
		System.out.println(result);// result의 값은 4
		result=result/2;
		System.out.println(result);// result의 값은 2
		result=result+8;
		System.out.println(result); // result의 값은 10
		result=result%7;
		System.out.println(result);//result의 값은 3

		int a = 3;
		System.out.println(0%a);
		System.out.println(1%a);
		System.out.println(2%a);
		System.out.println(3%a);
		System.out.println(4%a);
		System.out.println(5%a);
		System.out.println(6%a);
	
		String firstString ="This is";
		String SecondString = " a City Life";
		String ThirdString = firstString+SecondString;
				System.out.println(ThirdString);
				
				int b = 10;
				int c = 3;
				
				float d = 10.0F;
				float e = 3.0F;
				
				System.out.println(b/c);
				System.out.println(d/c);
				System.out.println(b/c);
				
				// 이항연산자 (infix operator) 
				
				// 단항연산자 
				// +3
				// -3
				// ++ : 증가 연산자로 항의 값을 1씩 증가시킨다.
	
	}
	

}
