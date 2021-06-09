package Ex6;

public class CallStackTest2 {

	public static void main(String[] args) {
		System.out.println("main(String[] args)이 시작되었음.");
		firstMethod();
		System.out.println("main(String[] args)이 끝났음.");
		}

		static void firstMethod() {
			System.out.println("firstMethod ()이 시작 되었음.");
			secondMethod();
			System.out.println("firstMethod ()이 끝났음.");
		}
		static void secondMethod() {
			System.out.println("secondMethod ()이 시작 되었음.");
			System.out.println("secondMethod ()이 끝났음.");
		
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
	static void change (int x) { // 기본형 매개변수
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
	static void change(Data d) { // 참조형 매개변수
		d.x = 1000;
		System.out.println("chage() : d.x = " + d.x);
	}
	
}

class ReferenceParamEx2 {
	public static void main(String[] args) {
		
		int[] x = {10}; //크기가 1인 배열
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
		
		printArr(arr); // 배열모든 요소를 출력
		sortArr(arr); // 배열을 정렬
		printArr(arr); //정렬 후 결과를 출력		
		System.out.println("sum=" + sumArr(arr));	//배열의 총합을 출력
			}
	static void printArr(int[] arr) { //배열의 모든요소를 출력
		System.out.print("{");
		for(int i : arr)
			System.out.print(i+",");
		System.out.println("]");
	}
	
	static int sumArr(int[] arr) { //배열 오름차순으로 정렬
		int sum = 0;
		
		for(int i = 0; i<arr.length;i++)
			sum += arr[i];
		return sum;
	}
	static void sortArr(int[] arr) { // 배열을 오름차순으로 정렬
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
		firstMethod(); // static 메서드는 객체 생성없이 호출 가능하다.
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
		if (n <= 0 || n>20 ) return -1; // 매개변수 유효성 검사
		if (n <= 1) return 1;
		 return n * factorial(n-1); 
	}
	
	public static void main (String args[]) {
		int n = 21;
		long result = 0;
		
		for (int i = 1 ; i <= n; i++) {
			result = factorial(i);
			
			if(result==-1) {
				System.out.printf("유효하지 않은 값입니다.(0<n<=20):%d%n",n);
			}		
		}	
	}
}

class FactorialTest3 {
	static long factorial2(int n) {
//		음 주석 단축키는 ctrl + /
		int max = 23;		
		if (n <= 0 || n > max) return -1; 
		if (n <= 1) return 1;
			return n * factorial2(n-1);	
			
	}
	public static void main (String args[]) {
		int n = 25;
		long result = 0;
		int max = 23; // 중복된 메소드
				
		for (int i = 1 ; i <= n; i++) {
			result = factorial2(i);
			
			if(result==-1) {
		
				System.out.printf("유효하지 않은 값.(0<n<=%d):%d%n", max ,n);
			}
			System.out.printf("%2d!=%20d%n",i,result);
		}
	}
}

class MainTest {
	public static void main (String args[]) {
		main(null); // 재귀호출. 
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
//	인스턴스변수 a,b만 사용해서 개발하므로  매개변수가 필요없다고 한다.
	
	long add() {return a + b; }
	long substract() {return a - b; }
	long multiply() {return a * b; }
	double divide() {return a / b; } // float으로 잘못 기재함.
	
//	인스턴스변수와 관계없이 매개변수만으로 작업이 가능하다고 한다.
	
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

MyMath2 mm = new MyMath2() ; // 인스턴스를 생성
mm.a = 200L;
mm.b = 100L;
//인스턴스메서드는 객체생성 후에만 호출이 가능함.
System.out.println(mm.add());
System.out.println(mm.substract());
System.out.println(mm.multiply());
System.out.println(mm.divide());

}
}

class MemberCall {
	
//	System.out.println("page. 280 : 메소드의 범위 : 클래스메서드 > 인스턴스메서드");
	
	int iv = 10;
	static int cv = 20; 
	
	int iv2 = cv;
//	static int cv2 = iv; 에러. 클래스변수는 인스턴스변수를 사용할 수 없음.
	static int cv2 = new MemberCall().iv; // 객체 생성 후 사용가능
	
	static void staticMethod1() {
		System.out.println(cv);
//		System.out.println(iv); 에러. 클래스매서드이기 때문에 인스턴스변수를 사용할 수 없음.
		MemberCall c = new MemberCall();; // 객체생성
		System.out.println(c.iv); // 객체를 생성한 후 인스턴스변수의 참조 가능.
	}
	
	void instanceMethod1() {
		System.out.println(cv);
		System.out.println(iv); // 인스턴스메서드에서 인스턴스변수를 바로 사용 가능함.
	}
	
	static void staticMethod2() {
		staticMethod1();
//		instanceMethod1(); 에러 . 클래스메서드에서는 인스턴스메서드를 호출 할 수 없음.
		MemberCall c = new MemberCall();
		c.instanceMethod1(); // 인스턴스메서드를 생성 해야 호출 할 수 있음.
		
	}
	
	void instanceMethod2() { //인스턴스메서드에서 인스턴스메서드와 클래스메서드
		staticMethod1(); 
		instanceMethod1();
	}
}