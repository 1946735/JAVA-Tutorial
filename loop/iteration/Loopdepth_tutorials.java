package loop.iteration;

public class Loopdepth_tutorials {

	public static void main(String[] args) {
		for (int i = 0; i<10; ++i) {
			for (int j = 0; j<10; j++) {
				System.out.println(i+" "+j);
			}
		} // j가 먼저 실행이 되고 0~9까지 채우면 i 가 실행이 되어 2자릿수를 표현한다. 
		// 01~09, 11~19 

	}

}
