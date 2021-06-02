package ExerciseJAVA;
import java.util.*;
public class FlowEX10 {

	public static void main(String[] args) {
		int score = 0;
		char grade = ' ';
		
		System.out.println("당신의 점수를 입력하세요.(1~100)>");
		
		Scanner scanner = new Scanner(System.in);
		
		String tmp = scanner.nextLine();// 화면을 통해 입력받은 내용을 tmp에 저장
		score = Integer.parseInt(tmp); // 입력받은 문자열 (tmp)를 숫자로 변환
		
		switch (score/10) {
		case 10 :
		case 9 :
			grade = 'A';
			break;
			
		case 8 :		
			grade = 'B';
			break;
			
		case 7 :
			grade = 'C';
			break ;
			
		case 6 : 
			grade = 'D';
			break ;
			
			default :
				grade = 'F';
		}
		System.out.println("당신의 학점은 " +grade + "입니다.");
	}

}
