package OOB;

public class OOB_Ex {}

class TvTest4{
		public static void main(String args[]) {
			Tv[] tvArr = new Tv[3];
			
			for(int i = 0; i< tvArr.length;i++) {
				tvArr[i] = new Tv();
				tvArr[i].channel = i+10; // tvArr[i]의 channel에 i+10을 저장
				
			}
			
			for(int i =0; i < tvArr.length ; i++) {
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
				