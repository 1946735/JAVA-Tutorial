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
		
		//for������ �迭�� ����Ҹ� ����Ѵ�.
		
		for (int i = 0; i < 5; i++)  {
			System.out.printf("score[%d]:%d%n",i,score[i]);
			
		}
	System.out.printf("tmp:%d%n", tmp);
	System.out.printf("score[%d]:%d%n",7,score[7], args); // index�� ������ ��� ��
	
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
	}// 1~10�� ���ڸ� ������� �迭�� �ִ´�.
	for ( int i=0 ; i < iArr2.length ; i++ ) {
		iArr2[i] = (int) ( Math.random()*10) + 1; // 1~10�� ���� �迭�� ����
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
	System.out.println("Ch.05 �迭 ����3-�迭�� ����");
	int[] arr = new int [5]; // �迭 arr�� 1~5�� �����Ѵ�.
	for (int i = 0; i < arr.length ; i++ )
	arr[i] = i + 1;
	
	System.out.println();
	System.out.println("[������]");
	System.out.println("arr.length:"+arr.length);
	for (int i=0; i<arr.length;i++)
		System.out.println("arr["+i+"] : "+arr[i]);
	
	int[] tmp = new int [arr.length*2]; // �迭 arr�� ����� ������ �迭 tmp�� �����Ѵ�.
	for(int i = 0; i < arr.length ; i++)
	tmp [i] = arr[i]; // �� 60�� �ٿ��� ����� i���� ���� ��
	
	arr = tmp ; // tmp�� ����� ���� arr�� �����Ѵ�.
	
	System.out.println();
	System.out.println("[������]");
	System.out.println("arr.length:"+arr.length);
	for(int i = 0; i<arr.length;i++)
		System.out.println("arr["+i+"] : "+arr[i]);
	}	
}

class ArrayEx4 {
	public static void main(String[] args) {
		System.out.println("Ch.05 �迭 ����4-�迭�� ����(System.arraycopy())");
		System.out.println();
		char[] abc = { 'A','B','C','D',};
		char[] num = { '0','1','2','3','4','5','6','7','8','9'};
		System.out.println(abc);
		System.out.println(num);
		
		//�迭 abc�� num�� �ٿ��� �ϳ��� �迭(result)�� �����.
		
		char[] result = new char[abc.length + num.length];
		System.arraycopy(abc, 0, result, 0, abc.length);
		System.arraycopy(num, 0, result, abc.length,num.length);
		System.out.println(result);
		
		// �迭 abc�� �迭 num�� ù��° ��ġ���� �迭 abc�� ���̸�ŭ ����
		System.arraycopy(abc, 0, num, 0, abc.length);
		System.out.println(num);
		
		// number�� �ε���6 ��ġ�� 3���� ����
		
		System.arraycopy(abc,0,num,5,4);
		System.out.println(num);
		
	}
}

class ArryaEx5 {
	public static void main(String[] args)  {
		System.out.println("Ch.05 �迭 ����5-�迭�� Ȱ��(���հ� ���)");
		System.out.println();
		int sum = 0; // ������ �����ϱ� ���� ����
		float average = 0f; // ����� �����ϱ� ���� ����
		
		int[] score = {100,88,100,100,90};
		
		for (int i = 0 ; i<score.length ; i++) {
			sum += score[i]; // �ݺ����� �̿��ؼ� �迭�� ����Ǿ� �ִ� ������ ��� ���Ѵ�.
		}
		average = sum / (float)score.length ; // ������� float�� ������ؼ� ����ȯ
		
		System.out.println("���� : " + sum);
		System.out.println("��� : " + average);
		
	}
}

class ArrayEx6 {
	public static void main(String[] args) {
		System.out.println("Ch.05 �迭 ����6-�迭�� Ȱ��(�ִ밪�� �ּҰ�)");
		System.out.println();
		
		int[] score = {1,88,91,33,100,55,95};
		
		int max = score[0]; // �迭�� ù��° ������ �ִ밪�� �ʱ�ȭ�Ѵ�.
		int min = score[0]; // �迭�� ù ��° ������ �ּҰ��� �ʱ�ȭ�Ѵ�.
		
		for(int i=1; i < score.length ; i++) {
			// �迭�� �ι�° ��Һ��� �б����ؼ� ���� i�� ���� 1�� �ʱ�ȭ�ߴ�.
			if(score[i] > max) { 
				max = score[i] ;
			} else if (score[i] < min) {
				min = score[i] ;
			}
		}// end of for
			
			System.out.println("�ִ밪 :" + max);
			System.out.println("�ּҰ� :" + min);
			} // end of main
	}// end of class

class ArrayEx7 {
	public static void main(String[] args) {
		System.out.println("Ch.05�迭 ����7,8-�迭�� Ȱ��(����)");
		System.out.println();
		int[] numArr = new int [10];
		// numArr�̶�� ���� 10ĭ�� ��������� �����.
		
		for (int i = 0 ; i<numArr.length ; i++) {
			numArr[i] = i; // �迭�� 0~9�� ���ڷ� �ʱ�ȭ�Ѵ�.
			System.out.print(numArr[i]);
		}//for�� ����
		System.out.println();
		for (int i = 0 ; i<100 ; i++) {
			int n =(int)(Math.random()*10); // 0~9 ���� �� �������Ƿ� ��´�.
			int tmp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = tmp;
		}
		for (int i = 0 ; i < numArr.length ; i++)
			System.out.print(numArr[i]);
		
		} // Main ��.
}

class ArrayEx8 { 
	public static void main (String[] args) {
		System.out.println("Ch.05�迭 ����8 - �迭�� Ȱ��(����)");
		System.out.println();
		int [] ball = new int[45]; // 45���� �������� �����ϱ� ���� �迭 ����.
		
		// �迭�� ����ҿ� 1~45�� ���� �����Ѵ�.
		for(int i = 0 ; i < ball.length ; i++) 
			ball [i] = i+1 ; // ball[0]�� 1�� ����ȴ�.
			
			int temp = 0 ; // �ΰ��� �ٲٴµ� ����� �ӽ� ����
			int j = 0 ; // ������ ���� �� ������ ����
			
			// �迭�� i��° ��ҿ� ������ ��ҿ� ����� ���� ���� �ٲ㼭 ���� ���´�.
			// 0��° ���� 5��° ��ұ��� ��� 6���� �ٲ۴�.
			
			for( int i = 0 ; i < 6 ; i++) {
				j = (int)(Math.random() * 6 ); // 0~44������ ������ ���� ��´�.
				temp = ball[i];
				ball[i] = ball [j] ;
				ball [j] = temp; 
		}
		// �迭 ball�� �տ������� 6���� ��Ҹ� ����Ѵ�.
			for (int i = 0; i < 6; i++)
				System.out.printf("ball[%d] = %d%n", i, ball[i]);
	}
}

class ArrayEx9 {
	public static void main (String[] args) {
		int[] code = {-4,-1,3,6,11} ; // �ҿ������� ����� ������ �迭
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
			boolean changed = false; // �ڸ��ٲ��� �߻��ߴ��� üũ�Ѵ�.
			
			for (int j = 0 ; j < numArr.length-1-i ; j++) {
				if(numArr[j] > numArr[j+1]) { // ���� ���� ������ ���� �ٲ۴�.
					int temp = numArr[j];
					numArr[j] = numArr[j+1];
					numArr[j+1]=temp;
					changed = true; // �ڸ��ٲ��� �߻������� chaged�� true��
				}
				
			} // end for j
			if(!changed) break; //�ڸ��ٲ��� ������ �ݺ����� �����.
			
			for (int k = 0; k<numArr.length;k++)
				System.out.print(numArr[k]);;//���ĵ� ����� ����Ѵ�.
				System.out.println();
		}// end for i
		
	}// main�� ��
	
}

class ArrayEx11{
	public static void main (String[] args) {
		int[] numArr = new int[10];
		int[] counter = new int [20];
		
		for (int i=0; i < numArr.length ; i++) {
			numArr[i] = (int)(Math.random()*10); // 0~9�� ������ ���� �迭�� ����
			System.out.print(numArr[i]);
			
		}
			System.out.println();
			
			for(int i = 0; i < numArr.length ; i++) {
				counter[numArr[i]]++;
				
			}
		for (int i = 0 ; i < numArr.length ; i++) {
			System.out.println( i + "�� ���� :" + counter[i]);
			
		}
		
	} // main �� ��
}

class ArrayEx12 {
	public static void main(String[] args) {
		String[] names = {"Kim", "Park", "Yi"};
		
		for(int i = 0; i < names.length ; i++) 
			System.out.println("names["+i+"] : "+names[i]);
		String tmp = names[2]; // �迭 name�� 3��° ��Ҹ� tmp�� ����
		System.out.println("tmp :"+tmp);
		names[0] = "Yu"; // �迭 names�� ù ��° ��Ҹ� "Yu"�� ����
		
		for(String str : names) // ���� for ��
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
				result +=binary[hex[i]-'0']; // '8'-'0'�� ����� 8�̴�.
			} else { //A~F�̸�
				result +=binary[hex[i]-'A'+10]; // 'C'-'A'�� ����� 2
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
			char ch = src.charAt(i); 				//src�� i��° ���ڸ�  ch�� ����
			System.out.println("src.charAt("+i+") : "+ch);
		}	//for�� ����
			char[] chArr = src.toCharArray();		// String�� char[]�� ��ȯ			
			System.out.println(chArr);				// char�迭[](char[])�� ���
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

		System.out.println("�Ű������� ���� :"+args.length);
		
		for(int i = 0; i<args.length ; i++);{
			
			int i = 0;
			System.out.println("args[" + i + "] = \""+ args[i]+"\"");
		}
	}
}

class ArrayEx17 {
	public static void main(String[] args) {
		if (args.length!=3) { // �Էµ� ���� ������ 3���� �ƴϸ�,
			System.out.println("usage : java ArrayEx17 NUM1 OP NUM2");
			System.exit(0); // ���α׷��� �����Ѵ�.
		}
		
		int num1 = Integer.parseInt(args[0]); // ���ڿ��� ���ڷ� ��ȯ�Ѵ�.
		char op = args[1].charAt(0); // ���ڿ��� ����(char)�� ��ȯ�Ѵ�.
		int num2 = Integer.parseInt(args[2]); 
		int result = 0;
		
		switch(op) { // switch ���� �������� charŸ���� ������ �����ϴ�.
		
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
			System.out.println("�������� �ʴ� �����Դϴ�.");
			
		}
		System.out.println("���"+result);
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
		
		System.out.println("��ȣ  ����  ����  ����  ����  ���");
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
			System.out.printf("���� : %3d %4d %4d%n", korTotal, engTotal, mathTotal);
			
	}
}

























