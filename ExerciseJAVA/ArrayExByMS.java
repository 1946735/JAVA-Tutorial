package ExerciseJAVA;
import java.util.*;
public class ArrayExByMS {

	public static void main(String[] args) {
		int [] score = new int[5];
		int k = 1;
		
		score [0] = 50;
		score [1] = 60;
		score [k+1] = 70; // score[2] = 70
		score [3] = 80;
		score [4] = 90;
		
		int tmp = score[k+2] + score[4]; // int tmp =score [3] + score[4]
		
		//for문으로 배열의 모든요소를 출력한다.
		
		for (int i = 0; i < 5; i++)  {
			System.out.printf("score[%d]:%d%n",i,score[i]);
			
		}
	System.out.printf("tmp:%d%n", tmp);
	System.out.printf("score[%d]:%d%n",7,score[7], args); // index의 범위를 벗어난 값
	
	} // Main Complete.

} 
class ArrayEx2 { 
	public static void main(String[] args) {
		int[] iArr1 = new int [10];
		int[] iArr2 = new int [10];
		//int[] iArr3 = new int [] {100,95,80,70,60};
		int[] iArr3 = {100,95,80,70,60};
		char[] chArr = {'a','b','c','d'};
	for ( int i=0; i<iArr1.length ; i++ ) {
		iArr1[i] = i + 1; 
	}// 1~10의 숫자를 순서대로 배열에 넣는다.
	for ( int i=0 ; i < iArr2.length ; i++ ) {
		iArr2[i] = (int) ( Math.random()*10) + 1; // 1~10의 값을 배열에 저장
	}
	for ( int i=0 ; i < iArr1.length ; i++ ) {
		System.out.print(iArr1[i]+",");
	}
	
	System.out.println();
	System.out.println(Arrays.toString(iArr2));
	System.out.println(Arrays.toString(iArr3));
	System.out.println(Arrays.toString(chArr));
	System.out.println(iArr3);
	System.out.println(chArr);
	}
} // Main complete.

class ArrayEx3 { 
	public static void main(String[] args) {
	System.out.println("Ch.05 배열 예제3-배열의 복사");
	int[] arr = new int [5]; // 배열 arr에 1~5를 저장한다.
	for (int i = 0; i < arr.length ; i++ )
	arr[i] = i + 1;
	
	System.out.println();
	System.out.println("[변경전]");
	System.out.println("arr.length:"+arr.length);
	for (int i=0; i<arr.length;i++)
		System.out.println("arr["+i+"] : "+arr[i]);
	
	int[] tmp = new int [arr.length*2]; // 배열 arr에 저장된 값들을 배열 tmp에 복사한다.
	for(int i = 0; i < arr.length ; i++)
	tmp [i] = arr[i]; // 위 60번 줄에서 선언된 i값을 가져 옴
	
	arr = tmp ; // tmp에 저장된 값을 arr에 저장한다.
	
	System.out.println();
	System.out.println("[변경후]");
	System.out.println("arr.length:"+arr.length);
	for(int i = 0; i<arr.length;i++)
		System.out.println("arr["+i+"] : "+arr[i]);
	}	
}

class ArrayEx4 {
	public static void main(String[] args) {
		System.out.println("Ch.05 배열 예제4-배열의 복사(System.arraycopy())");
		System.out.println();
		char[] abc = { 'A','B','C','D',};
		char[] num = { '0','1','2','3','4','5','6','7','8','9'};
		System.out.println(abc);
		System.out.println(num);
		
		//배열 abc와 num을 붙여서 하나의 배열(result)로 만든다.
		
		char[] result = new char[abc.length + num.length];
		System.arraycopy(abc, 0, result, 0, abc.length);
		System.arraycopy(num, 0, result, abc.length,num.length);
		System.out.println(result);
		
		// 배열 abc을 배열 num의 첫번째 위치부터 배열 abc의 길이만큼 복사
		System.arraycopy(abc, 0, num, 0, abc.length);
		System.out.println(num);
		
		// number의 인덱스6 위치에 3개를 복사
		
		System.arraycopy(abc,0,num,5,4);
		System.out.println(num);
		
	}
}

class ArryaEx5 {
	public static void main(String[] args)  {
		System.out.println("Ch.05 배열 예제5-배열의 활용(총합과 평균)");
		System.out.println();
		int sum = 0; // 총점을 저장하기 위한 변수
		float average = 0f; // 평균을 저장하기 위한 변수
		
		int[] score = {100,88,100,100,90};
		
		for (int i = 0 ; i<score.length ; i++) {
			sum += score[i]; // 반본문을 이용해서 배열에 저장되어 있는 값들을 모두 더한다.
		}
		average = sum / (float)score.length ; // 계산결과를 float로 얻기위해서 형변환
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + average);
		
	}
}

class ArrayEx6 {
	public static void main(String[] args) {
		System.out.println("Ch.05 배열 예제6-배열의 활용(최대값과 최소값)");
		System.out.println();
		
		int[] score = {1,88,91,33,100,55,95};
		
		int max = score[0]; // 배열의 첫번째 값으로 최대값을 초기화한다.
		int min = score[0]; // 배열의 첫 번째 값으로 최소값을 초기화한다.
		
		for(int i=1; i < score.length ; i++) {
			// 배열의 두번째 요소부터 읽기위해서 변수 i의 값을 1로 초기화했다.
			if(score[i] > max) { 
				max = score[i] ;
			} else if (score[i] < min) {
				min = score[i] ;
			}
		}// end of for
			
			System.out.println("최대값 :" + max);
			System.out.println("최소값 :" + min);
			} // end of main
	}// end of class

class ArrayEx7 {
	public static void main(String[] args) {
		System.out.println("Ch.05배열 예제7,8-배열의 활용(섞기)");
		System.out.println();
		int[] numArr = new int [10];
		// numArr이라는 곳에 10칸의 저장공간을 만든다.
		
		for (int i = 0 ; i<numArr.length ; i++) {
			numArr[i] = i; // 배열을 0~9의 숫자로 초기화한다.
			System.out.print(numArr[i]);
		}//for문 종료
		System.out.println();
		for (int i = 0 ; i<100 ; i++) {
			int n =(int)(Math.random()*10); // 0~9 중의 한 값을임의로 얻는다.
			int tmp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = tmp;
		}
		for (int i = 0 ; i < numArr.length ; i++)
			System.out.print(numArr[i]);
		
		} // Main 끝.
}

class ArrayEx8 { 
	public static void main (String[] args) {
		System.out.println("Ch.05배열 예제8 - 배열의 활용(섞기)");
		System.out.println();
		int [] ball = new int[45]; // 45개의 정수값을 저장하기 위한 배열 생성.
		
		// 배열의 각요소에 1~45의 값을 저장한다.
		for(int i = 0 ; i < ball.length ; i++) 
			ball [i] = i+1 ; // ball[0]에 1이 저장된다.
			
			int temp = 0 ; // 두값을 바꾸는데 사용할 임시 변수
			int j = 0 ; // 임의의 값을 얻어서 저장할 변수
			
			// 배열의 i번째 요소와 임의의 요소에 저장된 갑을 서로 바꿔서 값을 섞는다.
			// 0번째 부터 5번째 요소까지 모두 6개만 바꾼다.
			
			for( int i = 0 ; i < 6 ; i++) {
				j = (int)(Math.random() * 6 ); // 0~44범위의 임의의 값을 얻는다.
				temp = ball[i];
				ball[i] = ball [j] ;
				ball [j] = temp; 
		}
		// 배열 ball의 앞에서부터 6개의 요소를 출력한다.
			for (int i = 0; i < 6; i++)
				System.out.printf("ball[%d] = %d%n", i, ball[i]);
	}
}

class ArrayEx9 {
	public static void main (String[] args) {
		int[] code = {-4,-1,3,6,11} ; // 불연속적인 값들로 구성된 배열
		int[] arr = new int[10];
		
		for ( int i = 0 ; i < arr.length ; i++) {
			int tmp = (int)(Math.random()*code.length);
			arr[i] = code[tmp];
				
		}
		System.out.println(Arrays.toString(arr));
	}
}

class ArrayEx10 {
	public static void main (String[] args) {
		int[] numArr = new int [10];
		
		for (int i = 0 ; i<numArr.length ; i++) {
			System.out.print(numArr[i] = (int)(Math.random()*10));
			
		}
		System.out.println();
		
		for (int i = 0 ; i <numArr.length-1;i++) {
			boolean changed = false; // 자리바꿈이 발생했는지 체크한다.
			
			for (int j = 0 ; j < numArr.length-1-i ; j++) {
				if(numArr[j] > numArr[j+1]) { // 옆의 값이 작으면 서로 바꾼다.
					int temp = numArr[j];
					numArr[j] = numArr[j+1];
					numArr[j+1]=temp;
					changed = true; // 자리바꿈이 발생했으니 chaged를 true로
				}
				
			} // end for j
			if(!changed) break; //자리바꿈이 없으면 반복문을 벗어난다.
			
			for (int k = 0; k<numArr.length;k++)
				System.out.print(numArr[k]);;//정렬된 결과를 출력한다.
				System.out.println();
		}// end for i
		
	}// main의 끝
	
}

class ArrayEx11{
	public static void main (String[] args) {
		int[] numArr = new int[10];
		int[] counter = new int [20];
		
		for (int i=0; i < numArr.length ; i++) {
			numArr[i] = (int)(Math.random()*10); // 0~9의 임의의 수를 배열에 저장
			System.out.print(numArr[i]);
			
		}
			System.out.println();
			
			for(int i = 0; i < numArr.length ; i++) {
				counter[numArr[i]]++;
				
			}
		for (int i = 0 ; i < numArr.length ; i++) {
			System.out.println( i + "의 개수 :" + counter[i]);
			
		}
		
	} // main 의 끝
}

class ArrayEx12 {
	public static void main(String[] args) {
		String[] names = {"Kim", "Park", "Yi"};
		
		for(int i = 0; i < names.length ; i++) 
			System.out.println("names["+i+"] : "+names[i]);
		String tmp = names[2]; // 배열 name의 3번째 요소를 tmp에 저장
		System.out.println("tmp :"+tmp);
		names[0] = "Yu"; // 배열 names의 첫 번째 요소를 "Yu"로 변경
		
		for(String str : names) // 향상된 for 문
			System.out.println(str);
	}
}

class ArrayEx13 {
	public static void main(String[] args) {
		char[] hex = { 'C','A','F','E'};
		
		String[] binary = {"0000","0001","0010","0011","0100","0101","0110","0111","1000","1001","1010","1011","1100","1101","1110","1111"};
		String result = "";
		
		for(int i =0 ;i < hex.length ; i++) {
			if (hex[i] >='0'&& hex[i] <='9') {
				result +=binary[hex[i]-'0']; // '8'-'0'의 결과는 8이다.
			} else { //A~F이면
				result +=binary[hex[i]-'A'+10]; // 'C'-'A'의 결과는 2
			}
		}
			
		// Stirng(char[] value)
		System.out.println("hex : " +new String(hex));
		System.out.println("binary : " +result);
		
		String str = "Java";
		str = str + '8';
		System.out.println(str);
	}
}

class ArrayEx14 {
	public static void main (String[] args) {
		String src = "ABCDE";
		for (int i = 0 ; i < src.length() ; i++) {
			char ch = src.charAt(i); 				//src의 i번째 문자를  ch에 저장
			System.out.println("src.charAt("+i+") : "+ch);
		}	//for문 종료
			char[] chArr = src.toCharArray();		// String을 char[]로 변환			
			System.out.println(chArr);				// char배열[](char[])을 출력
		}
}

class ArrayEx15 {
	public static void main(String[] args) {
		String source = "SOSHELP";
		String[] morse = {".-","-...","-.-","-..",".","..-.","--.","....","..",".---",
				".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.." };
		String result ="";
		
		for (int i = 0 ; i<source.length();i++) {
			result+=morse[source.charAt(i)-'A'];
			}
		System.out.println("source : " + source);
		System.out.println("morse : "+ result);
	}
}

class ArrayEx16 {
	public static void main(String[] args) {

		System.out.println("매개변수의 개수 :"+args.length);
		
		for(int i = 0; i<args.length ; i++);{
			
			int i = 0;
			System.out.println("args[" + i + "] = \""+ args[i]+"\"");
		}
	}
}

class ArrayEx17 {
	public static void main(String[] args) {
		if (args.length!=3) { // 입력된 값의 개수가 3개가 아니면,
			System.out.println("usage : java ArrayEx17 NUM1 OP NUM2");
			System.exit(0); // 프로그램을 종료한다.
		}
		
		int num1 = Integer.parseInt(args[0]); // 문자열을 숫자로 변환한다.
		char op = args[1].charAt(0); // 문자열을 문자(char)로 변환한다.
		int num2 = Integer.parseInt(args[2]); 
		int result = 0;
		
		switch(op) { // switch 문의 수식으로 char타입의 변수도 가능하다.
		
		case '+':
			result = num1 + num2;
			break;
		
		case '-':
			result = num1 - num2;
			break;
			
		case 'x':
			result = num1 * num2;
			break;
			
		case '/':
			result = num1 / num2;
			break;
		
		default : 
			System.out.println("지원되지 않는 연산입니다.");
			
		}
		System.out.println("결과"+result);
	}
}

class MultidimentionalEX18 {
	public static void main (String[] args) {
		int [][] score = {
							{100,100,100}
							,{20,20,20}
							,{30,30,30}
							,{40,40,40}
		};
		
		int sum = 0;
		for (int i = 0 ; i < score.length;i++ ) {
			for(int j = 0 ; j < score[i].length ; j++) {
				System.out.printf("score[%d][%d]=%d%n",i,j,score[i][j]);
			}
		}
		
		for (int[] tmp : score) {
			for (int i : tmp) {
				sum += i;
			}
		}
		
		System.out.println("sum="+sum);
	}
}

class MultidimentionalEX19 {
	public static void main (String[] args) {
		int[][] score = {
				{100,100,100}
				,{20,20,20}
				,{30,30,30}
				,{40,40,40}
				,{50,50,50}
		};
		int korTotal = 0, engTotal = 0, mathTotal=0;
		
		System.out.println("번호  국어  영어  수학  총점  평균");
		System.out.println("===========================");
		
		for (int i = 0; i < score.length ; i++) {
			 int sum = 0;
			 float avg = 0.0f;
			 
			 korTotal += score[i][0];
			 engTotal += score[i][1];
			 mathTotal += score[i][2];
			 System.out.printf("%3d",i+1);
			 
			 for (int j = 0 ; j < score[i].length ; j++) {
				 sum += score[i][j];
				 System.out.printf("%5d",score[i][j]);
			 }
			 
			 avg = sum/(float)score[i].length; 
			 System.out.printf("%5d %5.1f%n",sum,avg);
		}
			System.out.println("============================");
			System.out.printf("총점 : %3d %4d %4d%n", korTotal, engTotal, mathTotal);
			
	}
}

























