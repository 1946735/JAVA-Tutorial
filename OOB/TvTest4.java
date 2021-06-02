package OOB;

public class TvTest4 {
		public static void main(String args[]) {
			Tv[] tvArr = new Tv[3]; // Tv 배열 3개 생성
			
			for(int i = 0; i< tvArr.length;i++) { // i 값은 0 부터 배열의 길이까지 0, 1, 2 이며, 최대 2까지 1씩 증가한다.
				tvArr[i] = new Tv(); // 각 값별로 참조변수 생성
				tvArr[i].channel = i+10; // tvArr[i]의 channel에 i+10을 저장
				
			}
			
			for(int i =0; i < tvArr.length ; i++) { // 같은 반복문을 작성한다
				
				tvArr.clone()[i].channelUp(); // tvArr[i]의 메서드를 호출, 채널 1증가
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
				
