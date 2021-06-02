package ExerciseJAVA;
import java.util.*;
public class FlowEX6 {

	public static void main(String[] args) {
		System.out.print("현재 월을 입력하세요");
		
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt(); // 화면을 통해 입력받은 숫자를 month에 저장
			if (month==3||month==4||month==5) {
				System.out.println("현재 계절은 봄입니다.");
			}
				else if(month==6||month==7||month==8) {
					System.out.println("현재 계절은 여름입니다."); }
				else if(month==9||month==10||month==11) {
					System.out.println("현재 계절은 가을입니다.");
				} else(month==12||month==1||month==2) {
						System.out.println("현재 계절은 겨울입니다.");
			}
				}
