package ExerciseJAVA;
import java.util.*;
/**
 * @author 19467
 *
 */
public class FlowEX4 {

	public static void main(String[] args) {
		int score = 0;
		String grade = "  ";
		
		System.out.print("������ �Է��ϼ���");
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt(); 
		if(score>=97) { 
			grade = "A+";
			} else if (score>=93) {
				grade = "A";
			} else if (score>=90) {
				grade = "A-";
			} else { 
				grade = "D+";
			}
 		System.out.print("����� ������ "+ grade +"�Դϴ�.");
	}
}
