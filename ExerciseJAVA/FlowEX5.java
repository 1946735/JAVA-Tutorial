package ExerciseJAVA;

import java.util.*;

public class FlowEX5 {

	public static void main(String[] args) {
		int score = 0;
		String grade =" ", opt = "0";
		
		System.out.print("점수를 입력해 주세요");
		
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt(); // 화면을 통해 입력받은 점수를 score 에 저장
		
		System.out.printf("당신의 점수는 %d입니다.%n", score);
		
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
		
		
		System.out.printf("당신의 학점은 %s%s입니다.%n", grade, opt);
	}

}
