package ExerciseJAVA;
import java.util.*;
public class FlowEX11 {

	public static void main(String[] args) {
		System.out.print("����� �ֹι�ȣ�� �Է��ϼ���.(123456-7890123)>");
		
		Scanner scanner = new Scanner(System.in);
		String regNo = scanner.nextLine();
		char gender = regNo.charAt(7) ; // �Է¹��� ��ȣ�� 8��° ���ڸ� ������ ����.
		
		switch (gender) {
			case '1' : case '3' : 
				switch(gender) {
				case '1' :
					System.out.println("����� 2000�� ������ ����� �����Դϴ�.");
					break ; 
				case '3' :
					 System.out.println("����� 2000�� ���Ŀ� ����� �����Դϴ�.");
				}break ;
			
			case '2' : case '4' :
				switch(gender) {
				case '2' :
					System.out.println("����� 2000�� ������ ����� �����Դϴ�.");
				break ;
				case '4' : 
					System.out.println("����� 2000�� ���Ŀ� ����� �����Դϴ�.");
				}break;
			default :
				System.out.println( "��ȿ���� ���� �ֹε�Ϲ�ȣ�Դϴ�. " ) ; 
		}
	}

}
