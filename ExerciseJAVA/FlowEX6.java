package ExerciseJAVA;
import java.util.*;
public class FlowEX6 {

	public static void main(String[] args) {
		System.out.print("���� ���� �Է��ϼ���");
		
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt(); // ȭ���� ���� �Է¹��� ���ڸ� month�� ����
			if (month==3||month==4||month==5) {
				System.out.println("���� ������ ���Դϴ�.");
			}
				else if(month==6||month==7||month==8) {
					System.out.println("���� ������ �����Դϴ�."); }
				else if(month==9||month==10||month==11) {
					System.out.println("���� ������ �����Դϴ�.");
				} else(month==12||month==1||month==2) {
						System.out.println("���� ������ �ܿ��Դϴ�.");
			}
				}
