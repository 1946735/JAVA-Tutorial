package loop.iteration;

public class for_tutorial {

	public static void main(String[] args) {
		for (int i=0;i<10;i++) { 
			// for (초기화- 한번만 실행 됨; 종료조건; 반복실행) {
			// 반복적으로 실행될 구문
			if (i == 5) {
				break;}
			System.out.println("cording Everybody"+i);
				}		
		for (int b =0;b<10;b++){
			if (b == 5)
				continue;
				System.out.println("cording Everybody" +b);
				}//1,2,3,4,6,7,8,9 - 5를 건너 뛰고 정해진 범위 내에서 반복 된다.
	}

}

