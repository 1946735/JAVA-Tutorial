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
		int sum = 0; // �հ踦 �����ϱ� ���� ����.
		
		for (int i = 1 ; i <=10 ; i++) {
			sum += i ; // sum = sum + i;
			// sum = sum + i 
			// i | sum + i 
			// 1 | 1 = 0 + 1
			// 2 | 2 = 0 + 1 + 2		
		System.out.printf("1���� %2d ������ �� : %2d%n",i,sum);
		}
} // main �� ��
}

class FlowEx14 {
	public static void main (String[] args) {
		for (int i=1, j=10; i<=10 ; i++,j--)
			System.out.printf("%d \t %d%n",i,j);
	} // Integer�� ���� �ƴµ�, 0���� �Ȱ���??? �� 0���� �Ȱ���??
}
 
class FlowEX141 {
	public static void main (String[] args) {
		for (int i=1; i<=10 ; i++)
			System.out.printf("%d \t %d%n",i,11-i);
	}
}// Ex14�� �������� 11�� �����ϹǷ� ��¹��� ����� �� �����ϸ� J������ �����ϰ� ���� I�θ� ���� �� �� �ִ�.

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