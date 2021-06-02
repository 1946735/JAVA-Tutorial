package ExerciseJAVA;
import java.util.*;
public class MultiArray {

	public static void main(String[] args) {
		final int SIZE = 10;
		int x=0,y=0;
		
		char[][]board = new char[SIZE][SIZE];
		byte[][] shipBoard = {
		//	1  2  3  4  5  6  7  8  9
		  { 0, 0, 0, 0, 0, 0, 1, 0, 0 }, // 1
		  { 1, 1, 1, 1, 0, 0, 1, 0, 0 }, // 2
		  { 0, 0, 0, 0, 0, 0, 1, 0, 0 }, // 3
		  { 0, 0, 0, 0, 0, 0, 1, 0, 0 }, // 4
		  { 0, 0, 0, 0, 0, 0, 0, 0, 0 }, // 5
		  { 1, 1, 0, 1, 0, 0, 0, 0, 0 }, // 6
		  { 0, 0, 0, 1, 0, 0, 0, 0, 0 }, // 7
		  { 0, 0, 0, 1, 0, 0, 0, 0, 0 }, // 8
		  { 0, 0, 0, 1, 0, 1, 1, 1, 0 }, // 9
				
		}; // 1�࿡ ���ȣ��, 1���� ���ȣ�� �����Ѵ�.
		
		for (int i = 1; i<SIZE;i++)
			board[0][i]=board[i][0]=(char)(i+'0');
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.printf("��ǥ�� �Է��ϼ���. (����� 00>");
			
			String input = scanner.nextLine(); // ȭ�鿡 �Է¹��� ������ input�� ����
			
			if(input.length()==2) { // �α��ڸ� �Է��� ���
			x=input.charAt(0)-'0';
			y=input.charAt(1)-'0';
			
			if(x==0 && y==0) // x�� y�� ��� 0�� ��� ����
				break;
			}
		if(input.length()!=2||x<=0||x>=SIZE||y<=0||y>=SIZE) {
			System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է����ּ���");
			continue;
		}
		// shipBoard[x-1][y-1]�� ���� 1�̸�, 'O'�� board[x][y]�� �����Ѵ�.
		board[x][y] = shipBoard[x-1][y-1]==1?'O':'X';
		
		// �迭 board�� ������ ȭ�鿡 ����Ѵ�.
		for (int i=0; i<SIZE;i++)
			System.out.println(board[i]);//board[i]�� 1���� �迭
		System.out.println();
		}
	}

}

class MultiArrEX2 {
	public static void main (String[] args) {
		final int SIZE = 5;
		int x = 0, y = 0, num = 0;
		
		int[][] bingo = new int[SIZE][SIZE];
		Scanner scanner = new Scanner(System.in);
		
		// �迭�� ��� ��Ҹ� 1���� SIZE*SIZE������ ���ڷ� �ʱ�ȭ
		for(int i = 0 ; i<SIZE;i++) 
			for(int j=0;j<SIZE;j++) 
				bingo[i][j] = i*SIZE+j+1;
				
				// �迭�� ����� ���� ���´�.
				for(int i=0;i<SIZE;i++)	{
					for(int j=0;j<SIZE;j++) {
						x=(int)(Math.random()*SIZE);
						y=(int)(Math.random()*SIZE);
						
						// bingo[i][j]�� ���Ƿ� ���õ� ��(bingo[x][y])�� �ٲ۴�.
						
						 int tmp = bingo[i][j];
						 bingo[i][j] = bingo[x][y];
						 bingo[x][y] = tmp;
						 
					}
				}
				
				do {
						for (int i=0;i<SIZE;i++) {
							for(int j=0;j<SIZE;j++)
								System.out.printf("%2d ",bingo[i][j]);
							System.out.println();
							
						}
						System.out.println();
						
						System.out.printf("1~%d�� ���ڸ� �Է��ϼ���. (����:0)>", SIZE*SIZE);
						String tmp = scanner.nextLine();
						num = Integer.parseInt(tmp);
						
						outer :
							for(int i = 0; i<SIZE;i++) {
								for(int j=0;j<SIZE;j++) {
									if(bingo[i][j]==num) {
										bingo[i][j] = 0;
										break outer; //2�� �ݺ����� �����.
									}
						
				}
				
			}
		} while(num!=0);
				
	}
}

class MultiArrEx3 {
	public static void main (String[] args) {
		int[][] m1 = {
				{1,2,3},
				{4,5,6}
				
		};
		
		int[][] m2 = {
				{1,2},
				{3,4},
				{5,6}
		};
		
		final int ROW = m1.length; // m1�� �� ����
		final int COL = m2[0].length; // m2�� �� ����
		final int M2_ROW =  m2.length; // m2�� �� ����
		
		int[][] m3 = new int[ROW][COL];
		//��İ� m1 X m2�� ����� m3�� ����
		
		for (int i = 0 ; i<ROW; i++)
			for(int j = 0 ; j < COL ; j++)
				for(int k = 0; k<M2_ROW ; k++)
					m3[i][j] += m1[i][k] * m2[k][j];
				
				// ��� m3�� ���
				for(int i=0 ; i<ROW; i++) {
					for(int j=0 ; j<COL;j++) {
						System.out.printf("%3d",m3[i][j]);
					}
					System.out.println();
					
				}
	} // main ��
}


























































