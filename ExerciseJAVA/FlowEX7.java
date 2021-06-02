package ExerciseJAVA;
import java.util.*;
public class FlowEX7 {

	public static void main(String[] args) {
		System.out.print("가위(1),바위(2),보(3) 중 하나를 입력하세요.>");
		
		Scanner scanner = new Scanner(System.in);
		int user = scanner.nextInt();// 화면을 통해 입력받은 숫자를 user에 저장
		int com = (int)(Math.random() * 3) + 1; //1,2,3 중 하나가 com에 저장 됨
		
		System.out.println("당신은 "+ user + "입니다.");
		System.out.println("컴은 "+ com + "입니다.");
		
		switch(user - com) {
		case 2: case -1 :
			System.out.println("You Lose.");
			break;
		
		case 1: case-2 :
			System.out.println("You Won!");
			break;
		case 0 :
			System.out.println("DRAW");
			break; // 마지막 문장이므로 break를 사용할 필요가 없다.
		}
	} // main 의 끝.
}
