package ExerciseJAVA;
import java.util.Scanner;
public class MultiArrayEx4 {

	public static void main(String[] args) {
		System.out.println("���� 5-23");
		String[][] words = {
				{"chair","����"}, // words[0][0], words[0][1]
				{"computer","��ǻ��"},
				{"integer","����"	}
		};
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0 ; i< words.length;i++) {
			System.out.printf("Q%d. %s�� ����?",i+1, words[i][0]);
			
			String tmp = scanner.nextLine();
			
			if(tmp.equals(words[i][1])) {
				System.out.printf("�����Դϴ�.%n%n");
				
			} else {
				System.out.printf("Ʋ�Ƚ��ϴ�. ������ %s�Դϴ�. %n%n",words[i][1]);
			}
		} // for
	}
}

class EX5_1_tmp {
	public static void main (String[] args)	{
				 //	  01234
		String str = "ABCDE"; //str.length()�� 5
		char ch = str.charAt(2);
		String str2 = str.substring(1,4); // BCD
		String str3 = str.substring(1); // BCDE
		String str4 = str.substring(1,str.length()); // BCDE
		System.out.println(str4); 
		
	}
}
