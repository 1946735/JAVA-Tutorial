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
				
		}; // 1행에 행번호를, 1열에 행번호를 저장한다.
		
		for (int i = 1; i<SIZE;i++)
			board[0][i]=board[i][0]=(char)(i+'0');
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.printf("좌표를 입력하세요. (종료는 00>");
			
			String input = scanner.nextLine(); // 화면에 입력받은 내용을 input에 저장
			
			if(input.length()==2) { // 두글자를 입력한 경우
			x=input.charAt(0)-'0';
			y=input.charAt(1)-'0';
			
			if(x==0 && y==0) // x와 y가 모두 0인 경우 종료
				break;
			}
		if(input.length()!=2||x<=0||x>=SIZE||y<=0||y>=SIZE) {
			System.out.println("잘못된 입력입니다. 다시 입력해주세요");
			continue;
		}
		// shipBoard[x-1][y-1]의 값이 1이면, 'O'을 board[x][y]에 저장한다.
		board[x][y] = shipBoard[x-1][y-1]==1?'O':'X';
		
		// 배열 board의 내용을 화면에 출력한다.
		for (int i=0; i<SIZE;i++)
			System.out.println(board[i]);//board[i]는 1차원 배열
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
		
		// 배열의 모든 요소를 1부터 SIZE*SIZE까지의 숫자로 초기화
		for(int i = 0 ; i<SIZE;i++) 
			for(int j=0;j<SIZE;j++) 
				bingo[i][j] = i*SIZE+j+1;
				
				// 배열에 저장된 값을 섞는다.
				for(int i=0;i<SIZE;i++)	{
					for(int j=0;j<SIZE;j++) {
						x=(int)(Math.random()*SIZE);
						y=(int)(Math.random()*SIZE);
						
						// bingo[i][j]와 임의로 선택된 값(bingo[x][y])을 바꾼다.
						
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
						
						System.out.printf("1~%d의 숫자를 입력하세요. (종료:0)>", SIZE*SIZE);
						String tmp = scanner.nextLine();
						num = Integer.parseInt(tmp);
						
						outer :
							for(int i = 0; i<SIZE;i++) {
								for(int j=0;j<SIZE;j++) {
									if(bingo[i][j]==num) {
										bingo[i][j] = 0;
										break outer; //2중 반복문을 벗어난다.
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
		
		final int ROW = m1.length; // m1의 행 길이
		final int COL = m2[0].length; // m2의 행 길이
		final int M2_ROW =  m2.length; // m2의 행 길이
		
		int[][] m3 = new int[ROW][COL];
		//행렬곱 m1 X m2의 결과를 m3에 저장
		
		for (int i = 0 ; i<ROW; i++)
			for(int j = 0 ; j < COL ; j++)
				for(int k = 0; k<M2_ROW ; k++)
					m3[i][j] += m1[i][k] * m2[k][j];
				
				// 행렬 m3를 출력
				for(int i=0 ; i<ROW; i++) {
					for(int j=0 ; j<COL;j++) {
						System.out.printf("%3d",m3[i][j]);
					}
					System.out.println();
					
				}
	} // main 끝
}


























































