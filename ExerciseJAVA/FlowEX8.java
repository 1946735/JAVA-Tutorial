package ExerciseJAVA;
import java.util.*;
public class FlowEX8 {

	public static void main(String[] args) {
		System.out.print("����� �ֹι�ȣ�� �Է��ϼ���.(ex: 011231-111222)>");
		
		Scanner scanner = new Scanner(System.in);
				String regNo = scanner.nextLine();
		
				char gender = regNo.charAt(7); // �Է¹��� ��ȣ�� 8��° ���ڸ� gender�� ����)
				
				switch (gender) {
				case '1' :
				System.out.println("����� �����Դϴ�.");
				
				break;
				
				case '2' :
				System.out.println("����� �����Դϴ�.");
			
				break;
				
				default :
					System.out.println("��ȿ���� ���� �ֹε�Ϲ�ȣ�Դϴ�.");
					}
	}

}
