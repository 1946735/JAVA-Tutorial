package ExerciseJAVA;

import java.util.*;

public class FlowEX5 {

	public static void main(String[] args) {
		int score = 0;
		String grade =" ", opt = "0";
		
		System.out.print("������ �Է��� �ּ���");
		
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt(); // ȭ���� ���� �Է¹��� ������ score �� ����
		
		System.out.printf("����� ������ %d�Դϴ�.%n", score);
		
		if (score >= 90) { 
			grade = "A";
			if (score >=98) {
				opt ="+";}
				else if (score <94) {
					opt = "-";
									}
				else if (score >=80) {
					grade = "B";
					if (score >=88) {
						opt = "+";}
					else if (score <=84);
					opt = "-";				
			}
		}else { grade = "c"; 
		}
		
		
		System.out.printf("����� ������ %s%s�Դϴ�.%n", grade, opt);
	}

}
