package loop.iteration;

public class for_tutorial {

	public static void main(String[] args) {
		for (int i=0;i<10;i++) { 
			// for (�ʱ�ȭ- �ѹ��� ���� ��; ��������; �ݺ�����) {
			// �ݺ������� ����� ����
			if (i == 5) {
				break;}
			System.out.println("cording Everybody"+i);
				}		
		for (int b =0;b<10;b++){
			if (b == 5)
				continue;
				System.out.println("cording Everybody" +b);
				}//1,2,3,4,6,7,8,9 - 5�� �ǳ� �ٰ� ������ ���� ������ �ݺ� �ȴ�.
	}

}

