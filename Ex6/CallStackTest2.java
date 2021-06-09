package Ex6;

public class CallStackTest2 {

	public static void main(String[] args) {
		System.out.println("main(String[] args)�� ���۵Ǿ���.");
		firstMethod();
		System.out.println("main(String[] args)�� ������.");
		}

		static void firstMethod() {
			System.out.println("firstMethod ()�� ���� �Ǿ���.");
			secondMethod();
			System.out.println("firstMethod ()�� ������.");
		}
		static void secondMethod() {
			System.out.println("secondMethod ()�� ���� �Ǿ���.");
			System.out.println("secondMethod ()�� ������.");
		
		}
}

class Data { int x; }

class PrimitiveParamEx{
	public static void main(String[] args) {
		Data d = new Data ();
		d.x = 10;
		System.out.println("main() : x = "+ d.x);
		
		change(d.x);
		System.out.println("After Chage(d.x)");
		System.out.println("main() : x = " + d.x);
	}
	static void change (int x) { // �⺻�� �Ű�����
		x = 1000 ;
		System.out.println("chage() : x = " + x);
		
	}
}

class Data2 {int x;}

class ReferenceParamEx {
	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		change(d);
		System.out.println("After change(d.x)");
		System.out.println("main() : d.x = " + d.x);
	}
	static void change(Data d) { // ������ �Ű�����
		d.x = 1000;
		System.out.println("chage() : d.x = " + d.x);
	}
	
}

class ReferenceParamEx2 {
	public static void main(String[] args) {
		
		int[] x = {10}; //ũ�Ⱑ 1�� �迭
		System.out.println("main() : x = " + x[0]);
		
		change(x);
		System.out.println("After change(x)");
		System.out.println("change() : x = " + x[0]);
		}
	static void change(int[] x) { 
		x[0] = 1000;
		System.out.println("main() : x =" + x[0]);
	}
}


class ReferenceParamEx3 {
	public static void main(String[] args) {
		int [] arr = new int[] {4,2,1,6,5,3};
		
		printArr(arr); // �迭��� ��Ҹ� ���
		sortArr(arr); // �迭�� ����
		printArr(arr); //���� �� ����� ���		
		System.out.println("sum=" + sumArr(arr));	//�迭�� ������ ���
			}
	static void printArr(int[] arr) { //�迭�� ����Ҹ� ���
		System.out.print("{");
		for(int i : arr)
			System.out.print(i+",");
		System.out.println("]");
	}
	
	static int sumArr(int[] arr) { //�迭 ������������ ����
		int sum = 0;
		
		for(int i = 0; i<arr.length;i++)
			sum += arr[i];
		return sum;
	}
	static void sortArr(int[] arr) { // �迭�� ������������ ����
		for(int i=0;i<arr.length-1;i++)
			for(int j=0;j<arr.length-1-i;j++)
				if(arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
				
	}
	
}

class forEx1 {
	public static void main(String[] args) {
		for (int i = 0; i<5;i++) {
			for (int j = 0; j<10;j++) {
			System.out.print("*");
			}System.out.println();
		}
		
	}
}

class callStackTest {
	public static void main(String[] args) {
		firstMethod(); // static �޼���� ��ü �������� ȣ�� �����ϴ�.
	}
	
	static void firstMethod() {
		secondMethod();
	}
	static void secondMethod() {
		System.out.println("secondMethod()");
	}
}

class FactorialTest2 {
	static long factorial(int n) {
		if (n <= 0 || n>20 ) return -1; // �Ű����� ��ȿ�� �˻�
		if (n <= 1) return 1;
		 return n * factorial(n-1); 
	}
	
	public static void main (String args[]) {
		int n = 21;
		long result = 0;
		
		for (int i = 1 ; i <= n; i++) {
			result = factorial(i);
			
			if(result==-1) {
				System.out.printf("��ȿ���� ���� ���Դϴ�.(0<n<=20):%d%n",n);
			}		
		}	
	}
}

class FactorialTest3 {
	static long factorial2(int n) {
//		�� �ּ� ����Ű�� ctrl + /
		int max = 23;		
		if (n <= 0 || n > max) return -1; 
		if (n <= 1) return 1;
			return n * factorial2(n-1);	
			
	}
	public static void main (String args[]) {
		int n = 25;
		long result = 0;
		int max = 23; // �ߺ��� �޼ҵ�
				
		for (int i = 1 ; i <= n; i++) {
			result = factorial2(i);
			
			if(result==-1) {
		
				System.out.printf("��ȿ���� ���� ��.(0<n<=%d):%d%n", max ,n);
			}
			System.out.printf("%2d!=%20d%n",i,result);
		}
	}
}

class MainTest {
	public static void main (String args[]) {
		main(null); // ���ȣ��. 
		}
	}

class PowerTest {
	public static void main (String args[])	{
		int x = 2;
		int n = 4;
		long result = 0;
		for (int i = 1; i<=n; i++) {
			result += power (x,i);
		}
		System.out.println(result);
		}
	
	static long power(int x, int n) {
		if(n==1) return x;
		return x * power(x, n-1);
	}
}


class MyMath2 {
	long a,b;
//	�ν��Ͻ����� a,b�� ����ؼ� �����ϹǷ�  �Ű������� �ʿ���ٰ� �Ѵ�.
	
	long add() {return a + b; }
	long substract() {return a - b; }
	long multiply() {return a * b; }
	double divide() {return a / b; } // float���� �߸� ������.
	
//	�ν��Ͻ������� ������� �Ű����������� �۾��� �����ϴٰ� �Ѵ�.
	
	static long add(long a, long b) { return a + b; }
	static long substract(long a, long b) { return a - b; }
	static long multiply(long a, long b) { return a * b; }
	static double divide(long a, long b) { return a / b; }
	
}

class MyMathTest2 {
	public static void main (String args[]) {
		System.out.println(MyMath2.add(200,100));
		System.out.println(MyMath2.substract(200,100));
		System.out.println(MyMath2.multiply(200,100));
		System.out.println(MyMath2.divide(200,100));

MyMath2 mm = new MyMath2() ; // �ν��Ͻ��� ����
mm.a = 200L;
mm.b = 100L;
//�ν��Ͻ��޼���� ��ü���� �Ŀ��� ȣ���� ������.
System.out.println(mm.add());
System.out.println(mm.substract());
System.out.println(mm.multiply());
System.out.println(mm.divide());

}
}

class MemberCall {
	
//	System.out.println("page. 280 : �޼ҵ��� ���� : Ŭ�����޼��� > �ν��Ͻ��޼���");
	
	int iv = 10;
	static int cv = 20; 
	
	int iv2 = cv;
//	static int cv2 = iv; ����. Ŭ���������� �ν��Ͻ������� ����� �� ����.
	static int cv2 = new MemberCall().iv; // ��ü ���� �� ��밡��
	
	static void staticMethod1() {
		System.out.println(cv);
//		System.out.println(iv); ����. Ŭ�����ż����̱� ������ �ν��Ͻ������� ����� �� ����.
		MemberCall c = new MemberCall();; // ��ü����
		System.out.println(c.iv); // ��ü�� ������ �� �ν��Ͻ������� ���� ����.
	}
	
	void instanceMethod1() {
		System.out.println(cv);
		System.out.println(iv); // �ν��Ͻ��޼��忡�� �ν��Ͻ������� �ٷ� ��� ������.
	}
	
	static void staticMethod2() {
		staticMethod1();
//		instanceMethod1(); ���� . Ŭ�����޼��忡���� �ν��Ͻ��޼��带 ȣ�� �� �� ����.
		MemberCall c = new MemberCall();
		c.instanceMethod1(); // �ν��Ͻ��޼��带 ���� �ؾ� ȣ�� �� �� ����.
		
	}
	
	void instanceMethod2() { //�ν��Ͻ��޼��忡�� �ν��Ͻ��޼���� Ŭ�����޼���
		staticMethod1(); 
		instanceMethod1();
	}
}