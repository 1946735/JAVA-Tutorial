package ExerciseJAVA;

public class FlowEX12 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
			System.out.println(i);
		
		for(int i=1;i<=5;i++)
			System.out.print(i);
		
	}

}


class FlowEx13 {
	public static void main (String[] args) {
		int sum = 0; // 합계를 저장하기 위한 변수.
		
		for (int i = 1 ; i <=10 ; i++) {
			sum += i ; // sum = sum + i;
			// sum = sum + i 
			// i | sum + i 
			// 1 | 1 = 0 + 1
			// 2 | 2 = 0 + 1 + 2		
		System.out.printf("1부터 %2d 까지의 합 : %2d%n",i,sum);
		}
} // main 의 끝
}

class FlowEx14 {
	public static void main (String[] args) {
		for (int i=1, j=10; i<=10 ; i++,j--)
			System.out.printf("%d \t %d%n",i,j);
	} // Integer로 정의 됐는데, 0으로 안가나??? 왜 0까지 안가지??
}
 
class FlowEX141 {
	public static void main (String[] args) {
		for (int i=1; i<=10 ; i++)
			System.out.printf("%d \t %d%n",i,11-i);
	}
}// Ex14의 실행결과가 11로 일정하므로 출력물의 결과를 재 정리하면 J변수를 삭제하고 변수 I로만 정리 할 수 있다.

class FlowEx15 {
	public static void main (String[] args) {
		System.out.println("i \t 2*i \t 2*i*-1 \t i*i \t 11-i \t i%3 \t i/3");
		System.out.println("--------------------------------------------------------");
		
		for(int i=1;i<=10;i++) 
		System.out.printf(" %d \t %d \t %d \t %d \t %d \t %d \t %d%n",i,2*i, 2*i-1, i*i, 11-i, i%3, i/3);
	
	}
}
class FlowEx151 {
	public static void main (String[] args) {
		for (int i = 1; i<=1; i++)
		//System.out.println("***********"); 
			for (int j = 1 ; j<=1; j++) {System.out.print("*");}System.out.println();
			for (int j = 1 ; j<=2; j++) {System.out.print("*");}System.out.println();
			for (int j = 1 ; j<=3; j++) {System.out.print("*");}System.out.println();
			for (int j = 1 ; j<=4; j++) {System.out.print("*");}System.out.println();
			for (int j = 1 ; j<=5; j++) {System.out.print("*");}System.out.println();
	}
}