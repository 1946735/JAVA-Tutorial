package OOB;

public class TvTest4 {
		public static void main(String args[]) {
			Tv[] tvArr = new Tv[3]; // Tv �迭 3�� ����
			
			for(int i = 0; i< tvArr.length;i++) { // i ���� 0 ���� �迭�� ���̱��� 0, 1, 2 �̸�, �ִ� 2���� 1�� �����Ѵ�.
				tvArr[i] = new Tv(); // �� ������ �������� ����
				tvArr[i].channel = i+10; // tvArr[i]�� channel�� i+10�� ����
				
			}
			
			for(int i =0; i < tvArr.length ; i++) { // ���� �ݺ����� �ۼ��Ѵ�
				
				tvArr.clone()[i].channelUp(); // tvArr[i]�� �޼��带 ȣ��, ä�� 1����
				System.out.printf("tvArr[%d].channel=%d%n",i,tvArr[i].channel);
			}
		}
}
	
		class Tv {
			String color;
			boolean power;
			int channel;
			
			void power() {power = !power;}
			void channelUp() { ++channel;}
			void channelDown() { --channel;}
}
				
