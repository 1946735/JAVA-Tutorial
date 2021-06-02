package loop.iteration;

public class while_tutorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i = -0;
		
		while (i<=10) { // while 뒤 i<=10까지 반복한다. i의 값이 10일 때 까지
			// 그래서 반복문 조건이 고정 돼있는 경우라면 큰 효용이 없다. 
			System.out.println("Cording Everybody"+ i);
		i++;// i 값에 1을 더한다. 반복문의 중괄호의 마지막 라인에 도달하면 반복문은 반복문을 재호출한다. 이때 i<=10의 값을 검사하게 된다.
		
		} // 반복문의 종료를 코딩 할 수 있다.

	}

}
